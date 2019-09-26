package com.engcomp2019.core;

/**
 *
 * @author erick / rckmath
 */
public class Session extends Engine {

    private Integer gameStatus;
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
}
