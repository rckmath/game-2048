package com.engcomp2019.core;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public class DragWindow extends Drag {

    private Frame frame;

    /* CONSTRUTOR(ES) */
    public DragWindow() {
    }

    /* METODOS */
    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    // Define e seta no frame a coordenada de destino
    @Override
    public int setCoord() {
        try {
            frame.setLocation(super.getX() - super.getFinalX(), super.getY() - super.getFinalY());
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
}
