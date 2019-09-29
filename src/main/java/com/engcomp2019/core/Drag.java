package com.engcomp2019.core;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public abstract class Drag {

    private int x;
    private int y;
    private int finalX;
    private int finalY;

    /* CONSTRUTOR(ES) */
    public Drag() {
    }

    /* METODOS */
    // Getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getFinalX() {
        return finalX;
    }

    public void setFinalX(int xMouse) {
        this.finalX = xMouse;
    }

    public int getFinalY() {
        return finalY;
    }

    public void setFinalY(int yMouse) {
        this.finalY = yMouse;
    }

    /**
     * Puxa as coordenadas iniciais do evento e seta nas variáveis de
     * coordenadas.
     *
     * @param evt Recebe o mouse event de origem
     */
    public void setInitialCoordenates(MouseEvent evt) {
        try {
            x = evt.getXOnScreen();
            y = evt.getYOnScreen();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Puxa as coordenadas finais do evento e seta nas variáveis de coordenadas.
     *
     * @param evt Recebe o mouse event de origem
     */
    public void setFinalCoordenates(MouseEvent evt) {
        try {
            finalX = evt.getX();
            finalY = evt.getY();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Definirá a coordenada de destino do objeto.
     */
    public abstract int setCoord();
}
