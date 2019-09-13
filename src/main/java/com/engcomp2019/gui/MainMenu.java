package com.engcomp2019.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class MainMenu extends JFrame {
    private final DragWindow drag = new DragWindow();
    
    /*private int xMouse;
    private int yMouse;*/

    private final ImageIcon imgFrame = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\frameBackground.png");
    private final ImageIcon imgLogo = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\mainMenu.gif");
    private final ImageIcon imgBtnDef = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\btnDefault.png");
    private final ImageIcon imgBtnHov = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\btnHover.png");
    private final ImageIcon imgBtnPre = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\btnPressed.png");

    public MainMenu() {
        // Propriedades da janela e inicialização dos componentes
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        btnStart.setIcon(imgBtnDef);
        btnStart.setBounds(210, 360, 384, 128);
        add(btnStart, new AbsoluteConstraints(210, 360, -1, -1));

        gameLogo.setIcon(imgLogo);
        gameLogo.setBounds(212, 110, 373, 172);
        add(gameLogo, new AbsoluteConstraints(212, 110, -1, -1));

        //frameBackground = new JLabel(imgFrame);
        frameBackground.setIcon(imgFrame);
        frameBackground.setBounds(0, 0, 800, 576);
        add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameLogo = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        btnStart = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuList = new javax.swing.JMenu();
        menuOpNovoJogo = new javax.swing.JMenuItem();
        menuOpConfig = new javax.swing.JMenuItem();
        menuOpQuit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 576));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(gameLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 7, 24, 24));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 7, 24, 24));

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
        });
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 18));

        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStartMouseReleased(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        frameBackground.setBackground(new java.awt.Color(0, 0, 0));
        frameBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameBackground.setPreferredSize(new java.awt.Dimension(800, 576));
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBar.setBackground(new java.awt.Color(0, 0, 0));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuList.setBackground(new java.awt.Color(0, 0, 0));
        menuList.setForeground(new java.awt.Color(255, 255, 255));
        menuList.setText("Arquivo");

        menuOpNovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        menuOpNovoJogo.setBackground(new java.awt.Color(0, 0, 0));
        menuOpNovoJogo.setForeground(new java.awt.Color(255, 255, 255));
        menuOpNovoJogo.setText("Novo jogo");
        menuOpNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpNovoJogoActionPerformed(evt);
            }
        });
        menuList.add(menuOpNovoJogo);

        menuOpConfig.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        menuOpConfig.setBackground(new java.awt.Color(0, 0, 0));
        menuOpConfig.setForeground(new java.awt.Color(255, 255, 255));
        menuOpConfig.setText("Configurações");
        menuOpConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpConfigActionPerformed(evt);
            }
        });
        menuList.add(menuOpConfig);

        menuOpQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuOpQuit.setBackground(new java.awt.Color(0, 0, 0));
        menuOpQuit.setForeground(new java.awt.Color(255, 255, 255));
        menuOpQuit.setText("Sair");
        menuOpQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpQuitActionPerformed(evt);
            }
        });
        menuList.add(menuOpQuit);

        menuBar.add(menuList);

        menuAbout.setBackground(new java.awt.Color(0, 0, 0));
        menuAbout.setForeground(new java.awt.Color(255, 255, 255));
        menuAbout.setText("Sobre");
        menuBar.add(menuAbout);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        // Comandos para garantir que fecharemos nosso programa completamente
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
        setVisible(false);
        super.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setBackground(Color.white);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        setState(Frame.ICONIFIED);  // Minimize our frame
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited

    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        drag.setCoordenates(evt);
        drag.setNewPosition(this);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        drag.setMouseCoordenates(evt);
    }//GEN-LAST:event_frameDragMousePressed

    private void btnStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseEntered
        btnStart.setIcon(imgBtnHov);
    }//GEN-LAST:event_btnStartMouseEntered

    private void btnStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseExited
        btnStart.setIcon(imgBtnDef);
    }//GEN-LAST:event_btnStartMouseExited

    private void btnStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMousePressed
        btnStart.setIcon(imgBtnPre);
    }//GEN-LAST:event_btnStartMousePressed

    private void btnStartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseReleased
        btnStart.setIcon(imgBtnHov);
    }//GEN-LAST:event_btnStartMouseReleased

    private void menuOpConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOpConfigActionPerformed

    private void menuOpNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpNovoJogoActionPerformed
       
    }//GEN-LAST:event_menuOpNovoJogoActionPerformed

    private void menuOpQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpQuitActionPerformed
        // Comandos para garantir que fecharemos nosso programa completamente
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
        setVisible(false);
        super.dispose();
        System.exit(0);
    }//GEN-LAST:event_menuOpQuitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnStart;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel gameLogo;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuList;
    private javax.swing.JMenuItem menuOpConfig;
    private javax.swing.JMenuItem menuOpNovoJogo;
    private javax.swing.JMenuItem menuOpQuit;
    // End of variables declaration//GEN-END:variables
}
