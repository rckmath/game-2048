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
        if(super.getX() - super.getxMouse() > super.getY() - super.getyMouse()){
            finalX = super.getX() - super.getxMouse();
            finalY = super.getY();
        } else {
            finalX = super.getX();
            finalY = super.getY() - super.getyMouse();
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
