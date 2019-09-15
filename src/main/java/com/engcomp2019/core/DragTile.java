package com.engcomp2019.core;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author erick / rckmath
 */
public class DragTile extends Drag {
    private int finalX;
    private int finalY;
    
    /* CONSTRUTOR(ES) */
    public DragTile() {
    }
    
    /* METODOS */
    public void setFinal(){
        if(super.x - super.xMouse > super.y - super.yMouse){
            finalX = super.x - super.xMouse;
            finalY = super.y;
        } else {
            finalX = super.x;
            finalY = super.y - super.yMouse;
        }
    }
    
    @Override
    public void setCoord() {
        try {
            //frame.setLocation(finalX, finalY);
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
