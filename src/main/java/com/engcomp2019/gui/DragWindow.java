package com.engcomp2019.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public class DragWindow {

    private int x;
    private int y;
    private int xMouse;
    private int yMouse;
    private int xFinal;
    private int yFinal;

    // Puxa as coordenadas do evento e seta nas variáveis de coordenadas.
    public void setCoordenates(java.awt.event.MouseEvent evt) {
        try {
            x = evt.getXOnScreen();
            y = evt.getYOnScreen();
        } catch (Exception e) {
            System.err.println("Erro: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setMouseCoordenates(java.awt.event.MouseEvent evt) {
        try {
            xMouse = evt.getX();
            yMouse = evt.getY();
        } catch (Exception e) {
            System.err.println("Erro: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setNewPosition(java.awt.Frame frame) {
        try {
            frame.setLocation(x - xMouse, y - yMouse);
        } catch (Exception e) {
            System.err.println("Erro: " + e);
            JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
