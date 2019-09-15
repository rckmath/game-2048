package com.engcomp2019.core;

import com.engcomp2019.core.Drag;
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
    public void setCoord() {
        try {
            frame.setLocation(super.x - super.xMouse, super.y - super.yMouse);
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
