package com.engcomp2019.core;

import com.engcomp2019.gui.GUI_Game;

/**
 *
 * @author erick / rckmath
 */
public class Session extends Engine {

    private Integer gameStatus; // Recebera 1 p/ vitoria e 2 p/ derrota
    private Integer recordScore;
    private Integer roundScore;
    private Boolean altTheme;

    public Session(int bSizeOp) {
        super(bSizeOp);
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

    // Outros
    // Inicializa a sessão zerada
    public void initializeSession() {
        if (this.altTheme == null) {
            this.altTheme = false;
        }
        this.gameStatus = 0;
        this.roundScore = 0;
        this.recordScore = 0;
    }

    /**
     * Inicia um novo jogo e instancia a interface
     *
     * @param s
     * @param restart True para caso for reiniciar o jogo, false para caso for
     * novo jogo
     */
    public void newGame(Session s, Boolean restart) {
        GUI_Game game;
        Session session;
        if (restart) {
            // s.getBoardSize() - 2 = Opcao p/ tamanho de jogo
            session = new Session(s.getBoardSize() - 2);
        } else {
            session = new Session(s.getBoardSize());
        }
        session.setAltTheme(s.getAltTheme());
        session.setGameStatus(0);
        session.setRoundScore(0);
        session.setRecordScore(s.getRecordScore());

        game = new GUI_Game(session);
        game.setVisible(true);
    }
}
