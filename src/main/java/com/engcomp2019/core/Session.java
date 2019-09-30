package com.engcomp2019.core;

import com.engcomp2019.gui.GUI_Game;
import com.engcomp2019.gui.GUI_RestartConfirm;
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

    public Session(int bSizeOp) {
        super(bSizeOp);
        super.setImgTileDef(new ImageIcon("imgs/tiles/def.png"));
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

}
