package com.engcomp2019.gui;

import com.engcomp2019.core.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_Exit extends javax.swing.JFrame {

    private final DragWindow drag = new DragWindow();
    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameExit.png");
    private final ImageIcon imgBtnYesDef = new ImageIcon("imgs/buttons/confirm/btnYesDef.png");
    private final ImageIcon imgBtnYesHov = new ImageIcon("imgs/buttons/confirm/btnYesHover.png");
    private final ImageIcon imgBtnYesPre = new ImageIcon("imgs/buttons/confirm/btnYesPressed.png");
    private final ImageIcon imgBtnNoDef = new ImageIcon("imgs/buttons/confirm/btnNoDef.png");
    private final ImageIcon imgBtnNoHov = new ImageIcon("imgs/buttons/confirm/btnNoHover.png");
    private final ImageIcon imgBtnNoPre = new ImageIcon("imgs/buttons/confirm/btnNoPressed.png");
    private final JFrame previousFrame;
    
    /**
     * Constroi o frame "Sair" e desativa o frame atual
     *
     * @param pPreviousFrame Recebe o frame atual
     */
    public GUI_Exit(JFrame pPreviousFrame) { 
        // Desativa o frame anterior para bloqueá-lo enquanto não fechar este
        previousFrame = pPreviousFrame;
        previousFrame.setEnabled(false);
        
        // Inicializa este frame
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        btnYes.setIcon(imgBtnYesDef);
        this.add(btnYes, new AbsoluteConstraints(65, 200, -1, -1));

        btnNo.setIcon(imgBtnNoDef);
        this.add(btnNo, new AbsoluteConstraints(205, 200, -1, -1));

        frameBackground.setIcon(imgFrame);
        this.add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        btnYes = new javax.swing.JLabel();
        btnNo = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frameExit"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 6, 24, 24));

        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameDrag.setPreferredSize(new java.awt.Dimension(41, 18));
        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                frameDragMouseReleased(evt);
            }
        });
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 18));

        btnYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnYesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnYesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnYesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnYesMouseReleased(evt);
            }
        });
        getContentPane().add(btnYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 200, -1, -1));

        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNoMouseReleased(evt);
            }
        });
        getContentPane().add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 200, -1, -1));
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        previousFrame.setEnabled(true);
        new Close(this, false).frame();
    }//GEN-LAST:event_btnCloseMouseReleased

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        drag.setCoordenates(evt);
        drag.setFrame(this);
        drag.setCoord();
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        drag.setMouseCoordenates(evt);
    }//GEN-LAST:event_frameDragMousePressed

    private void frameDragMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseReleased
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_frameDragMouseReleased

    private void btnYesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYesMouseEntered
        btnYes.setIcon(imgBtnYesHov);
    }//GEN-LAST:event_btnYesMouseEntered

    private void btnYesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYesMouseExited
        btnYes.setIcon(imgBtnYesDef);
    }//GEN-LAST:event_btnYesMouseExited

    private void btnYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYesMousePressed
        btnYes.setIcon(imgBtnYesPre);
    }//GEN-LAST:event_btnYesMousePressed

    private void btnYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYesMouseReleased
        new Close(this, true).frame();
    }//GEN-LAST:event_btnYesMouseReleased

    private void btnNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseEntered
        btnNo.setIcon(imgBtnNoHov);
    }//GEN-LAST:event_btnNoMouseEntered

    private void btnNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseExited
        btnNo.setIcon(imgBtnNoDef);
    }//GEN-LAST:event_btnNoMouseExited

    private void btnNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMousePressed
        btnNo.setIcon(imgBtnNoPre);
    }//GEN-LAST:event_btnNoMousePressed

    private void btnNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseReleased
        previousFrame.setEnabled(true);
        new Close(this, false).frame();
    }//GEN-LAST:event_btnNoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnNo;
    private javax.swing.JLabel btnYes;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    // End of variables declaration//GEN-END:variables
}
