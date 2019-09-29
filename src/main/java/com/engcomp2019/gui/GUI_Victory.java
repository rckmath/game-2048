package com.engcomp2019.gui;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.core.Close;
import com.engcomp2019.core.DragWindow;
import com.engcomp2019.core.Session;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_Victory extends javax.swing.JFrame {

    // ImageIcon
    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameVictory.png");
    private final ImageIcon imgMenu = new ImageIcon("imgs/elements/gameDropdown.png");
    private final ImageIcon imgWinGif = new ImageIcon("imgs/victory/endingAnim.gif");
    private final ImageIcon imgFireworksGif = new ImageIcon("imgs/victory/fireworksAnim.gif");
    private final ArrayList<ImageIcon> imgBtnReset = new ArrayList<>();
    private final ArrayList<ImageIcon> imgBtnMain = new ArrayList<>();
    // JLabel
    private final ArrayList<JLabel> fireworksGif = new ArrayList<>();
    private ArrayList<JLabel> menuItems;
    // Outros
    private final DragWindow drag = new DragWindow();
    private final Close close = new Close();
    private Boolean menuActive = true;
    private final Audio a = new Audio();
    private final Session s;

    /**
     * Inicializa e instancia a tela de vitória
     *
     * @param s Mantém a sessão inicializada
     */
    public GUI_Victory(Session s) {
        this.s = s;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initMenu();
        loadImages();

        for (int i = 0; i < 2; i++) {
            fireworksGif.add(new JLabel(imgFireworksGif));
        }

        lblScore.setText(String.format("%06d%n", s.getRoundScore()));
        lblRecord.setText(String.format("%06d%n", s.getRecordScore()));

        btnReset.setIcon(imgBtnReset.get(0));
        this.add(btnReset, new AbsoluteConstraints(245, 456, -1, -1));

        btnMainMenu.setIcon(imgBtnMain.get(0));
        this.add(btnMainMenu, new AbsoluteConstraints(409, 456, -1, -1));
        btnMainMenu.setVisible(true);

        this.add(fireworksGif.get(0), new AbsoluteConstraints(600, 280, -1, -1));
        this.add(fireworksGif.get(1), new AbsoluteConstraints(45, 400, -1, -1));
        
        imgWinGif.getImage().flush();
        victoryGif.setIcon(imgWinGif);
        this.add(victoryGif, new AbsoluteConstraints(271, 180, -1, -1));
        initAudio();

        menuDropdown.setIcon(imgMenu);
        this.add(menuDropdown, new AbsoluteConstraints(39, 20, -1, -1));
        menuDropdown.setVisible(false);

        frameBackground.setIcon(imgFrame);
        this.add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newGame = new javax.swing.JLabel();
        mainMenu = new javax.swing.JLabel();
        exitGame = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnFile = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        victoryGif = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameVictory"); // NOI18N
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

        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGameMouseReleased(evt);
            }
        });
        getContentPane().add(newGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 18));

        mainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainMenuMouseReleased(evt);
            }
        });
        getContentPane().add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 18));

        exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitGameMouseReleased(evt);
            }
        });
        getContentPane().add(exitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 18));

        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAboutMouseReleased(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 0, 50, 18));

        menuDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuDropdownMouseReleased(evt);
            }
        });
        getContentPane().add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, 131, 77));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 7, 24, 24));

        btnFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFileMouseReleased(evt);
            }
        });
        getContentPane().add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, 70, 18));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 7, 24, 24));

        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetMouseReleased(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 456, -1, -1));

        btnMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMainMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseReleased(evt);
            }
        });
        getContentPane().add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 456, -1, -1));

        lblRecord.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(77, 77, 77));
        getContentPane().add(lblRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 265, -1, -1));

        lblScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(77, 77, 77));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 150, -1, -1));
        getContentPane().add(victoryGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

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

        frameBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\erick\\Documents\\NetBeansProjects\\prj2048\\imgs\\frames\\frameVictory.png")); // NOI18N
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        setState(Frame.ICONIFIED);  // Minimize our frame
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void btnFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseReleased
        menuActive = close.menu(1, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnFileMouseReleased

    private void btnAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseReleased
        GUI_AboutUs frameAbout = new GUI_AboutUs(this);
        frameAbout.setVisible(true);
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnAboutMouseReleased

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        new Close(this, true).frame();
    }//GEN-LAST:event_btnCloseMouseReleased

    private void mainMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        // Chamar frame para confirmar ação
        GUI_MainConfirm frameConfirm;
        frameConfirm = new GUI_MainConfirm(this, s);
        frameConfirm.setVisible(true);
    }//GEN-LAST:event_mainMenuMouseReleased

    private void menuDropdownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_menuDropdownMouseReleased

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        drag.setCoordenates(evt);
        drag.setFrame(this);
        drag.setCoord();
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        drag.setMouseCoordenates(evt);
    }//GEN-LAST:event_frameDragMousePressed

    private void frameDragMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseReleased
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_frameDragMouseReleased

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        s.restart(this);
    }//GEN-LAST:event_newGameMouseReleased

    private void exitGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        GUI_Exit frameExit = new GUI_Exit(this);
        frameExit.setVisible(true);
    }//GEN-LAST:event_exitGameMouseReleased

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        btnReset.setIcon(imgBtnReset.get(1));
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        btnReset.setIcon(imgBtnReset.get(0));
    }//GEN-LAST:event_btnResetMouseExited

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        btnReset.setIcon(imgBtnReset.get(2));
    }//GEN-LAST:event_btnResetMousePressed

    private void btnResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseReleased
        btnReset.setIcon(imgBtnReset.get(1));
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        s.restart(this);
    }//GEN-LAST:event_btnResetMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_formMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        a.stop();
    }//GEN-LAST:event_formWindowClosed

    private void btnMainMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseEntered
        btnMainMenu.setIcon(imgBtnMain.get(1));
    }//GEN-LAST:event_btnMainMenuMouseEntered

    private void btnMainMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseExited
        btnMainMenu.setIcon(imgBtnMain.get(0));
    }//GEN-LAST:event_btnMainMenuMouseExited

    private void btnMainMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMousePressed
        btnMainMenu.setIcon(imgBtnMain.get(2));
    }//GEN-LAST:event_btnMainMenuMousePressed

    private void btnMainMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseReleased
        btnMainMenu.setIcon(imgBtnMain.get(1));
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        // Chamar frame para confirmar ação
        GUI_MainConfirm frameConfirm;
        frameConfirm = new GUI_MainConfirm(this, s);
        frameConfirm.setVisible(true);

    }//GEN-LAST:event_btnMainMenuMouseReleased

    // <editor-fold defaultstate="collapsed" desc="Initiate the menu">
    private void initMenu() {
        menuItems = new ArrayList<JLabel>() {
            {
                add(exitGame);
                add(newGame);
                add(mainMenu);
            }
        };

        // Para inicializar as opções de menu desativadas
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Initiate the audio">
    private void initAudio() {
        a.setAudioPath("src/main/java/com/engcomp2019/audio/youWin.wav");
        a.play(false);

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Load images">
    private void loadImages() {
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetDef.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetHov.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetPre.png"));

        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuDef.png"));
        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuHov.png"));
        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuPre.png"));
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnMainMenu;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel exitGame;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel newGame;
    private javax.swing.JLabel victoryGif;
    // End of variables declaration//GEN-END:variables
}
