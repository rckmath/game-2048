package com.engcomp2019.core;

import com.engcomp2019.gui.GUI_Game;
import com.engcomp2019.gui.GUI_RestartConfirm;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import org.ini4j.*;

/**
 *
 * @author erick / rckmath
 */
public class Session extends Engine {

    private Integer gameStatus; // Receberá 0 p/ jogando, 1 p/ vitoria e 2 p/ derrota
    private Integer recordScore;
    private Integer roundScore;
    private Boolean altTheme;
    private Boolean audioOn;
    private ImageIcon imgTileDef;
    private final HashMap<Integer, ImageIcon> imgTiles = new HashMap<>();

    public Session(int bSizeOp) {
        super(bSizeOp);
        setImgTileDef(new ImageIcon(this.getClass().getResource("/imgs/tiles/def.png")));
        Integer tileNum = 2;
        for (int i = 0; i < 11; i++) {
            imgTiles.put(tileNum, new ImageIcon(this.getClass().getResource("/imgs/tiles/gifs/" + tileNum + ".gif")));
            tileNum *= 2;
        }
    }

    /* METODOS */
    // Getters and setters
    public Integer getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Integer gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Integer getRecordScore() {
        return recordScore;
    }

    public void setRecordScore(Integer recordScore) {
        this.recordScore = recordScore;
    }

    public Integer getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(Integer roundScore) {
        this.roundScore = roundScore;
    }

    public Boolean getAltTheme() {
        return altTheme;
    }

    public void setAltTheme(Boolean alternateTheme) {
        this.altTheme = alternateTheme;
    }

    public Boolean getAudioOn() {
        return audioOn;
    }

    public void setAudioOn(Boolean audioOn) {
        this.audioOn = audioOn;
    }

    public ImageIcon getImgTileDef() {
        return imgTileDef;
    }

    public void setImgTileDef(ImageIcon imgTileDef) {
        this.imgTileDef = imgTileDef;
    }

    // Outros
    /**
     * Carrega nossas configurações a partir do que está salvo no arquivo
     * "load.ini"
     */
    public void loadSession() {
        try {
            Wini ini;
            File file = new File("load.ini");
            // Se existir o arquivo, carrega ele, senão cria
            if (file.exists()) {
                ini = new Wini(file);
            } else {
                file.createNewFile();
                ini = new Wini(file);
                ini.put("options", "altTheme", false);
                ini.put("options", "audioOn", true);
                ini.put("session", "record", 0);
                ini.store();
            }
            // Carregando as opções de .ini
            this.altTheme = ini.get("options", "altTheme", boolean.class);
            this.audioOn = ini.get("options", "audioOn", boolean.class);
            // Carregando a sessão de .ini
            this.recordScore = ini.get("session", "record", int.class);
        } catch (IOException e) {
            System.err.println("ERRO: " + e);
        }
    }

    /**
     * Salva a sessão atual localmente
     *
     * @param s Recebe a sessão atual
     */
    public void saveSession(Session s) {
        try {
            Wini ini;
            File file = new File("load.ini");
            // Se existir o arquivo, carrega ele, senão cria
            if (file.exists()) {
                ini = new Wini(file);
                ini.put("options", "altTheme", s.altTheme);
                ini.put("options", "audioOn", s.audioOn);
                ini.put("session", "record", s.recordScore);
                ini.store();
            }
        } catch (IOException e) {
            System.err.println("ERRO: " + e);
        }
    }

    /**
     * Chama loadSession e inicializa zerado o status de jogo e o round score
     */
    public void initializeSession() {
        loadSession();

        this.gameStatus = -1;
        this.roundScore = 0;
    }

    /**
     * Inicia um novo jogo e instancia a interface
     *
     * @param s Recebe a sessão instaciada e cria um novo jogo
     */
    public void newGame(Session s) {
        GUI_Game game;

        // Define as tiles de acordo com o status do tema
        Session session;
        session = new Session(s.getBoardSize() - 2); // Board size - 2 = Opção p/ board size
        session.setAltTheme(s.getAltTheme());
        session.setAudioOn(s.getAudioOn());
        session.setGameStatus(-1);
        session.setRoundScore(0);
        session.setRecordScore(s.getRecordScore());
        if (s.getAltTheme()) {
            session.setImgTileDef(new ImageIcon(this.getClass().getResource("/imgs/tiles/leo.gif")));
        }

        game = new GUI_Game(session);
        game.setVisible(true);
    }

    /**
     *
     * @param pPreviousFrame Recebe o frame de onde foi chamado
     */
    @Override
    public void restart(JFrame pPreviousFrame) {
        // Chamar frame para confirmar ação
        GUI_RestartConfirm frameConfirm;
        frameConfirm = new GUI_RestartConfirm(pPreviousFrame, this);
        frameConfirm.setVisible(true);
    }

    /**
     *
     * @param i Linha da matriz
     * @param j Coluna da matriz
     * @return Elemento de gameBoard[i][j]
     */
    @Override
    public int getGameBoardValue(int i, int j) {
        return getGameBoard()[i][j];
    }

    /**
     * Busca a imagem correspondente a determinado número
     *
     * @param i Linha da matriz
     * @param j Coluna da matriz
     * @return Imagem correspondente ao elemento da matriz
     */
    public ImageIcon getTileImg(int i, int j) {
        int val = getGameBoardValue(i, j);

        if (val == 0) {
            return imgTileDef;
        } else {
            imgTiles.get(val).getImage().flush();
            return imgTiles.get(val);
        }
    }

    /**
     * Copia a matriz do jogo atual para a que vem do parâmetro
     *
     * @param array2D Matriz que receberá a cópia da nossa original
     */
    public void arrayCopy(int array2D[][]) {
        for (int i = 0; i < getBoardSize(); i++) {
            System.arraycopy(getGameBoard()[i], 0, array2D[i], 0, getBoardSize());
        }
    }

    /**
     * Verifica se deu game over
     *
     * @return True p/ fim de jogo, false p/ continuar jogo
     */
    public Boolean isGameOver() {
        int[][] gameAux = new int[getBoardSize()][getBoardSize()];

        arrayCopy(gameAux);

        /* Tenta movimentar a matriz pra todos os
        lados p/ verificar se ha movimento possivel */
        moveDown(gameAux);
        moveUp(gameAux);
        moveRight(gameAux);
        moveLeft(gameAux);

        /* Se não houver nenhuma casa vazia após os moves ou todos
        os elementos forem iguais a matriz original, game over */
        if (!areEqual(gameAux)) {
            return false;
        }
        for (int i = 0; i < getBoardSize(); i++) {
            for (int element : getGameBoard()[i]) {
                if (element == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Compara a matriz do jogo com a que vem do parâmetro
     *
     * @param array2D Matriz que será comparada com nossa original
     * @return
     */
    public Boolean areEqual(int array2D[][]) {
        return Arrays.deepEquals(array2D, getGameBoard());
    }
}
