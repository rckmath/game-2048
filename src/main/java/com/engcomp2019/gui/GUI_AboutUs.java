package com.engcomp2019.gui;

import com.engcomp2019.core.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_AboutUs extends javax.swing.JFrame {

    private final JFrame previousFrame;
    private final DragWindow drag = new DragWindow();
    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameAbout.png");
    private final ImageIcon imgGitDef = new ImageIcon("imgs/buttons/other/btnGitDef.png");
    private final ImageIcon imgGitHov = new ImageIcon("imgs/buttons/other/btnGitHover.png");
    private final ImageIcon imgGitPre = new ImageIcon("imgs/buttons/other/btnGitPressed.png");

    /**
     * Constroi o frame "Sobre" e desativa o frame atual
     *
     * @param pPreviousFrame Recebe o frame atual
     */
    public GUI_AboutUs(JFrame pPreviousFrame) {
        // Desativa o frame anterior para bloqueá-lo enquanto não fechar este
        previousFrame = pPreviousFrame;
        previousFrame.setEnabled(false);

        // Inicializa este frame
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        btnGit.setIcon(imgGitDef);
        add(btnGit, new AbsoluteConstraints(105, 160, -1, -1));

        frameBackground.setIcon(imgFrame);
        add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        btnGit = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("frameAbout"); // NOI18N
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

        btnGit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGitMouseReleased(evt);
            }
        });
        getContentPane().add(btnGit, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 160, -1, -1));
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

    private void btnGitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGitMouseEntered
        btnGit.setIcon(imgGitHov);
    }//GEN-LAST:event_btnGitMouseEntered

    private void btnGitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGitMouseExited
        btnGit.setIcon(imgGitDef);
    }//GEN-LAST:event_btnGitMouseExited

    private void btnGitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGitMousePressed
        btnGit.setIcon(imgGitPre);
    }//GEN-LAST:event_btnGitMousePressed

    private void btnGitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGitMouseReleased
        btnGit.setIcon(imgGitHov);
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://github.com/rckmath/2048-Game"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(GUI_AboutUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGitMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnGit;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    // End of variables declaration//GEN-END:variables
}
