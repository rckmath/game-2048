package com.engcomp2019.core;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public class DragTile extends Drag {

    private int deltaX;
    private int deltaY;
    private int buffer;

    /* CONSTRUTOR(ES) */
    public DragTile() {
        this.buffer = 0;
    }

    /* METODOS */
    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public void setFinal() {
        this.deltaX = super.getFinalX() - super.getX();
        this.deltaY = super.getFinalY() - super.getY();

        System.out.println("Delta X:" + deltaX);
        System.out.println("Delta Y:" + deltaY);
        System.out.println();
    }

    /**
     * Puxa as coordenadas finais do evento e seta nas variáveis de coordenadas.
     *
     * @param evt Recebe o mouse event de origem
     */
    @Override
    public void setInitialCoordenates(MouseEvent evt) {
        try {
            super.setX(evt.getX());
            super.setY(evt.getY());
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao definir coordenadas!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public int setCoord() {
        setFinal();
        int moveDirection = -1;
        try {
            // Se ambos forem positivos
            if (deltaX > 0 && deltaY > 0) {
                if (deltaX > 2 && deltaY > 2) {
                    if (deltaX > deltaY) {
                        moveDirection = 'R';
                    } else {
                        moveDirection = 'D';
                    }
                }
                // Se o deltaX for positivo e deltaY negativo
            } else if (deltaX > 0 && deltaY < 0) {
                if (deltaX > 2 && deltaY < -2) {
                    if (deltaX > (deltaY * -1)) {
                        moveDirection = 'R';
                    } else {
                        moveDirection = 'U';
                    }
                }
                // Se o deltaX for negativo e deltaY positivo
            } else if (deltaX < 0 && deltaY > 0) {
                if (deltaX < -2 && deltaY > 2) {
                    if ((deltaX * -1) > deltaY) {
                        moveDirection = 'L';
                    } else {
                        moveDirection = 'D';
                    }
                }
                // Se ambos forem negativos
            } else {
                if (deltaX < -2 && deltaY < -2) {
                    if ((deltaX * -1) > (deltaY * -1)) {
                        moveDirection = 'L';
                    } else {
                        moveDirection = 'U';
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return moveDirection;
    }
}
