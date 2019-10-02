package com.engcomp2019.core;

import com.engcomp2019.gui.GUI_Game;
import com.engcomp2019.gui.GUI_RestartConfirm;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
        setImgTileDef(new ImageIcon("imgs/tiles/def.png"));
        Integer tileNum = 2;
        for (int i = 0; i < 11; i++) {
            imgTiles.put(tileNum, new ImageIcon("imgs/tiles/gifs/" + tileNum + ".gif"));
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
    // Inicializa a sessão zerada
    public void initializeSession() {
        if (this.altTheme == null) {
            this.altTheme = false;
        }
        this.gameStatus = -1;
        this.roundScore = 0;
        this.recordScore = 0;
        this.audioOn = true;
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
            session.setImgTileDef(new ImageIcon("imgs/tiles/leo.gif"));
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
        for (int i = 0; i < getBoardSize(); i++) {
            for (int j = 0; j < getBoardSize(); j++) {
                if (gameAux[i][j] == 0 || (!areEqual(gameAux))) {
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
