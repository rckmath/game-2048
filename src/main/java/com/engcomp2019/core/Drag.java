package com.engcomp2019.core;

import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public abstract class Drag {
    private int x;
    private int y;
    private int xMouse;
    private int yMouse;
 
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

    public int getxMouse() {
        return xMouse;
    }

    public void setxMouse(int xMouse) {
        this.xMouse = xMouse;
    }

    public int getyMouse() {
        return yMouse;
    }

    public void setyMouse(int yMouse) {
        this.yMouse = yMouse;
    }

    /**
     * Puxa as coordenadas iniciais do evento e seta nas variáveis de coordenadas.
     *
     * @param evt Recebe o mouse event de origem
     */
    public void setCoordenates(java.awt.event.MouseEvent evt) {
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
    public void setMouseCoordenates(java.awt.event.MouseEvent evt) {
        try {
            xMouse = evt.getX();
            yMouse = evt.getY();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Definirá a coordenada de destino do objeto.
     */
    public abstract void setCoord();
}
