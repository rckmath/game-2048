package com.engcomp2019.core;

import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public abstract class Drag {
    protected int x;
    protected int y;
    protected int xMouse;
    protected int yMouse;
 
    /* CONSTRUTOR(ES) */
    public Drag() {
    }
    
    /* METODOS */
    // Puxa as coordenadas do evento e seta nas variáveis de coordenadas.
    public void setCoordenates(java.awt.event.MouseEvent evt) {
        try {
            x = evt.getXOnScreen();
            y = evt.getYOnScreen();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setMouseCoordenates(java.awt.event.MouseEvent evt) {
        try {
            xMouse = evt.getX();
            yMouse = evt.getY();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    public abstract void setCoord();
}
