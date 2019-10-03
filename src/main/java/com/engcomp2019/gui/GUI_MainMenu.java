package com.engcomp2019.gui;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.core.*;
import java.awt.Frame;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_MainMenu extends JFrame {

    private final ImageIcon imgFrame = new ImageIcon(this.getClass().getResource("/imgs/frames/frameBackground.png"));
    private final ImageIcon imgMenu = new ImageIcon(this.getClass().getResource("/imgs/elements/mainMenuDropdown.png"));
    private final ImageIcon imgLeoHead = new ImageIcon(this.getClass().getResource("/imgs/easteregg/leoHeadDance.gif"));
    private final ArrayList<ImageIcon> imgBtnStart = new ArrayList<>();
    private final ArrayList<ImageIcon> imgBtnGameS = new ArrayList<>();
    private final ArrayList<ImageIcon> imgVolume = new ArrayList<>();
    private final DragWindow drag = new DragWindow();
    private final Close close = new Close();
    private ArrayList<JLabel> menuItems;
    private Boolean menuActive = true;
    protected static Audio a = new Audio();
    private final Session s;
    private int gameBoardSize = 1;

    /**
     * Inicializa e instancia a tela principal
     *
     * @param s Mantém a sessão inicializada
     */
    public GUI_MainMenu(Session s) {
        this.s = s;

        // Propriedades da janela e inicialização dos componentes
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        initMenu();
        loadImages();

        altTheme.setIcon(imgLeoHead);
        this.add(altTheme, new AbsoluteConstraints(740, 50, -1, -1));
        altTheme.setVisible(false);

        if (s.getAltTheme()) {
            altTheme.setVisible(true);
        }

        initAudio();

        this.add(btnAudio, new AbsoluteConstraints(32, 525, -1, -1));

        menuDropdown.setIcon(imgMenu);
        this.add(menuDropdown, new AbsoluteConstraints(39, 20, -1, -1));
        menuDropdown.setVisible(false);

        btnGameSize.setIcon(imgBtnGameS.get(0));
        this.add(btnGameSize, new AbsoluteConstraints(210, 155, -1, -1));

        btnStart.setIcon(imgBtnStart.get(0));
        this.add(btnStart, new AbsoluteConstraints(210, 295, -1, -1));

        frameBackground.setIcon(imgFrame);
        this.add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitGame = new javax.swing.JLabel();
        configGame = new javax.swing.JLabel();
        newGame = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnFile = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        btnGameSize = new javax.swing.JLabel();
        btnStart = new javax.swing.JLabel();
        btnAudio = new javax.swing.JLabel();
        altTheme = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameMainMenu"); // NOI18N
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitGameMouseReleased(evt);
            }
        });
        getContentPane().add(exitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 18));

        configGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                configGameMouseReleased(evt);
            }
        });
        getContentPane().add(configGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 18));

        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGameMouseReleased(evt);
            }
        });
        getContentPane().add(newGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 18));
        getContentPane().add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, 130, 57));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 7, 24, 24));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 7, 24, 24));

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

        btnGameSize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGameSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGameSizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGameSizeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGameSizeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGameSizeMouseReleased(evt);
            }
        });
        getContentPane().add(btnGameSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        btnAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAudioMouseReleased(evt);
            }
        });
        getContentPane().add(btnAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 515, 32, 32));
        getContentPane().add(altTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 30, 30));

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

        frameBackground.setBackground(new java.awt.Color(0, 0, 0));
        frameBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameBackground.setPreferredSize(new java.awt.Dimension(800, 576));
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        new Close(this, true).frame();
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        setState(Frame.ICONIFIED);  // Minimize our frame
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        drag.setInitialCoordenates(evt);
        drag.setFrame(this);
        drag.setCoord();
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        drag.setFinalCoordenates(evt);
    }//GEN-LAST:event_frameDragMousePressed

    private void btnStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseEntered
        btnStart.setIcon(imgBtnStart.get(1));
    }//GEN-LAST:event_btnStartMouseEntered

    private void btnStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseExited
        btnStart.setIcon(imgBtnStart.get(0));
    }//GEN-LAST:event_btnStartMouseExited

    private void btnStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMousePressed
        btnStart.setIcon(imgBtnStart.get(2));
    }//GEN-LAST:event_btnStartMousePressed

    private void btnStartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseReleased
        try {
            btnStart.setIcon(imgBtnStart.get(1));
            a.stop();
            this.dispose();
            start();
            s.newGame(s);
        } catch (Exception ex) {
            System.err.println("ERRO: " + ex);
        }
    }//GEN-LAST:event_btnStartMouseReleased

    private void frameDragMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseReleased
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_frameDragMouseReleased

    private void btnAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseReleased
        GUI_AboutUs frameAbout = new GUI_AboutUs(this);
        frameAbout.setVisible(true);
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnAboutMouseReleased

    private void btnFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseReleased
        menuActive = close.menu(1, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnFileMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_formMouseReleased

    private void exitGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        GUI_Exit frameExit = new GUI_Exit(this);
        frameExit.setVisible(true);
    }//GEN-LAST:event_exitGameMouseReleased

    private void configGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        this.dispose();
        GUI_Config frameConfig = new GUI_Config(this, s);
        frameConfig.setVisible(true);
    }//GEN-LAST:event_configGameMouseReleased

    private void btnGameSizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameSizeMouseEntered
        if (gameBoardSize == 1) {
            btnGameSize.setIcon(imgBtnGameS.get(1));
        } else {
            btnGameSize.setIcon(imgBtnGameS.get(4));
        }
    }//GEN-LAST:event_btnGameSizeMouseEntered

    private void btnGameSizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameSizeMouseExited
        if (gameBoardSize == 1) {
            btnGameSize.setIcon(imgBtnGameS.get(0));
        } else {
            btnGameSize.setIcon(imgBtnGameS.get(3));
        }
    }//GEN-LAST:event_btnGameSizeMouseExited

    private void btnGameSizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameSizeMousePressed
        if (gameBoardSize == 1) {
            gameBoardSize = 0;
            btnGameSize.setIcon(imgBtnGameS.get(2));
        } else {
            gameBoardSize = 1;
            btnGameSize.setIcon(imgBtnGameS.get(5));
        }
    }//GEN-LAST:event_btnGameSizeMousePressed

    private void btnGameSizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGameSizeMouseReleased
        if (gameBoardSize == 1) {
            btnGameSize.setIcon(imgBtnGameS.get(1));
        } else {
            btnGameSize.setIcon(imgBtnGameS.get(4));
        }
    }//GEN-LAST:event_btnGameSizeMouseReleased

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        this.dispose();
        a.stop();
        start();
        s.newGame(s);
    }//GEN-LAST:event_newGameMouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (s.getAltTheme()) {
            altTheme.setVisible(true);
        } else {
            altTheme.setVisible(false);
        }
        if (s.getAudioOn()) {
            btnAudio.setIcon(imgVolume.get(0));
        } else {
            btnAudio.setIcon(imgVolume.get(1));
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnAudioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAudioMouseReleased
        if (s.getAudioOn()) {
            btnAudio.setIcon(imgVolume.get(1));
            a.stop();
            s.setAudioOn(false);
        } else {
            btnAudio.setIcon(imgVolume.get(0));
            a.play(true);
            s.setAudioOn(true);
        }
    }//GEN-LAST:event_btnAudioMouseReleased

    private void start() {
        if (gameBoardSize == 1) {
            s.setBoardSize(3);
        } else {
            s.setBoardSize(4);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Inicializar menu">
    private void initMenu() {
        menuItems = new ArrayList<JLabel>() {
            {
                add(exitGame);
                add(newGame);
                add(configGame);
            }
        };

        // Para inicializar as opções de menu desativadas
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Inicializar áudio">
    private void initAudio() {
        URL url = this.getClass().getResource("/audio/menuMusic.wav");
        a.setAudioPath(url);
        if (s.getAudioOn()) {
            a.play(true);
            btnAudio.setIcon(imgVolume.get(0));
        } else {
            btnAudio.setIcon(imgVolume.get(1));
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Carregar imagens">
    private void loadImages() {
        imgBtnStart.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btnDefault.png")));
        imgBtnStart.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btnHover.png")));
        imgBtnStart.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btnPressed.png")));

        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn3x3Def.png")));
        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn3x3Hover.png")));
        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn3x3Pressed.png")));
        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn4x4Def.png")));
        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn4x4Hover.png")));
        imgBtnGameS.add(new ImageIcon(this.getClass().getResource("/imgs/buttons/btn4x4Pressed.png")));

        imgVolume.add(new ImageIcon(this.getClass().getResource("/imgs/elements/volumeOn.png")));
        imgVolume.add(new ImageIcon(this.getClass().getResource("/imgs/elements/volumeOff.png")));

        s.setFrameIcon(this);
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altTheme;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnAudio;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnGameSize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnStart;
    private javax.swing.JLabel configGame;
    private javax.swing.JLabel exitGame;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel newGame;
    // End of variables declaration//GEN-END:variables
}
