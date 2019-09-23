package com.engcomp2019.gui;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.core.*;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_EasterEgg extends javax.swing.JFrame {

    private final ImageIcon imgFrame = new ImageIcon("src/main/java/com/engcomp2019/imgs/easteregg/frameEasterEgg.png");
    private final ImageIcon imgMenu = new ImageIcon("src/main/java/com/engcomp2019/imgs/elements/gameDropdown.png");
    private final ImageIcon imgLeoHorse = new ImageIcon("src/main/java/com/engcomp2019/imgs/easteregg/leoCavalo.gif");
    private final ImageIcon imgLeoOx = new ImageIcon("src/main/java/com/engcomp2019/imgs/easteregg/leoBoi.gif");
    private final ImageIcon imgLeoHeadDance = new ImageIcon("src/main/java/com/engcomp2019/imgs/easteregg/leoHeadDance.gif");
    private final DragWindow drag = new DragWindow();
    private final Close close = new Close();
    private final ArrayList<JLabel> menuItems;
    private Boolean menuActive = false;
    protected Audio a = new Audio();

    public GUI_EasterEgg() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        menuItems = new ArrayList<JLabel>() {
            {
                add(exitGame);
                add(newGame);
                add(mainMenu);
                add(configGame);
            }
        };
        a.play("src/main/java/com/engcomp2019/audio/pula.wav");

        close.menu(1, menuActive, menuDropdown, menuItems);

        menuDropdown.setIcon(imgMenu);
        add(menuDropdown, new AbsoluteConstraints(39, 20, -1, -1));
        menuDropdown.setVisible(false);

        leoHead.setIcon(imgLeoHeadDance);
        add(leoHead, new AbsoluteConstraints(330, 50, -1, -1));

        leoHead2.setIcon(imgLeoHeadDance);
        add(leoHead2, new AbsoluteConstraints(450, 370, -1, -1));

        leoHead3.setIcon(imgLeoHeadDance);
        add(leoHead3, new AbsoluteConstraints(60, 470, -1, -1));

        leoHead4.setIcon(imgLeoHeadDance);
        add(leoHead4, new AbsoluteConstraints(730, 300, -1, -1));

        leoOx.setIcon(imgLeoOx);
        add(leoOx, new AbsoluteConstraints(40, 30, -1, -1));

        leoHorse.setIcon(imgLeoHorse);
        add(leoHorse, new AbsoluteConstraints(620, 400, -1, -1));

        frameBackground.setIcon(imgFrame);
        add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitGame = new javax.swing.JLabel();
        newGame = new javax.swing.JLabel();
        mainMenu = new javax.swing.JLabel();
        configGame = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JLabel();
        btnFile = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        leoHorse = new javax.swing.JLabel();
        leoOx = new javax.swing.JLabel();
        leoHead = new javax.swing.JLabel();
        leoHead2 = new javax.swing.JLabel();
        leoHead3 = new javax.swing.JLabel();
        leoHead4 = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameEasterEgg"); // NOI18N
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitGameMouseReleased(evt);
            }
        });
        getContentPane().add(exitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 18));
        getContentPane().add(newGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 18));

        mainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainMenuMouseReleased(evt);
            }
        });
        getContentPane().add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 18));
        getContentPane().add(configGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 18));

        menuDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuDropdownMouseReleased(evt);
            }
        });
        getContentPane().add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, 131, 77));

        btnFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFileMouseReleased(evt);
            }
        });
        getContentPane().add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, 70, 18));

        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAboutMouseReleased(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 0, 50, 18));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 7, 24, 24));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 7, 24, 24));

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
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 18));
        getContentPane().add(leoHorse, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 20, 20));

        leoOx.setToolTipText("");
        getContentPane().add(leoOx, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 20, 20));
        getContentPane().add(leoHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 20, 20));
        getContentPane().add(leoHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 20, 20));
        getContentPane().add(leoHead3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 20, 20));
        getContentPane().add(leoHead4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 20, 20));
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
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

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        new Close(this, true).frame();
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        setState(Frame.ICONIFIED);  // Minimize our frame
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void exitGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        GUI_Exit frameExit = new GUI_Exit(this);
        frameExit.setVisible(true);
    }//GEN-LAST:event_exitGameMouseReleased

    private void btnFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseReleased
        menuActive = close.menu(1, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnFileMouseReleased

    private void btnAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseReleased
        GUI_AboutUs frameAbout = new GUI_AboutUs(this);
        frameAbout.setVisible(true);
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnAboutMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_formMouseReleased

    private void menuDropdownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_menuDropdownMouseReleased

    private void mainMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);   
        // Chamar frame para confirmar ação
        GUI_MainConfirm frameConfirm;
        frameConfirm = new GUI_MainConfirm(this);
        frameConfirm.setVisible(true);
    }//GEN-LAST:event_mainMenuMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Para a música
        a.stop();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_EasterEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_EasterEgg().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel configGame;
    private javax.swing.JLabel exitGame;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel leoHead;
    private javax.swing.JLabel leoHead2;
    private javax.swing.JLabel leoHead3;
    private javax.swing.JLabel leoHead4;
    private javax.swing.JLabel leoHorse;
    private javax.swing.JLabel leoOx;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel newGame;
    // End of variables declaration//GEN-END:variables
}
