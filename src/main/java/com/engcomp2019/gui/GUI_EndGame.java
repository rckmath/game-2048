package com.engcomp2019.gui;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.core.Close;
import com.engcomp2019.core.DragWindow;
import com.engcomp2019.core.Session;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_EndGame extends JFrame {

    // ImageIcon
    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameVictory.png");
    private final ImageIcon imgMenu = new ImageIcon("imgs/elements/gameDropdown.png");
    private final ImageIcon imgWinGif = new ImageIcon("imgs/victory/victoryAnim.gif");
    private final ImageIcon imgLoseGif = new ImageIcon("imgs/victory/loseAnim.gif");
    private final ImageIcon imgFireworksGif = new ImageIcon("imgs/victory/fireworksAnim.gif");
    private final ImageIcon imgStarGif = new ImageIcon("imgs/victory/marioStar.gif");
    private final ArrayList<ImageIcon> imgHead = new ArrayList<>();
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
    // Score
    private Timer timer;

    /**
     * Inicializa e instancia a tela de vitória
     *
     * @param s Mantém a sessão inicializada
     */
    public GUI_EndGame(Session s) {
        this.s = s;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initMenu();
        loadImages();

        imgLoseGif.getImage().flush();
        imgWinGif.getImage().flush();

        starGif.setIcon(imgStarGif);
        this.add(starGif, new AbsoluteConstraints(740, 275, -1, -1));
        starGif.setVisible(false);

        if (s.getGameStatus() == 1) {
            headImage.setIcon(imgHead.get(0));
        } else {
            headImage.setIcon(imgHead.get(1));
        }

        this.add(headImage, new AbsoluteConstraints(255, 63, -1, -1));

        if (s.getGameStatus() == 1) {
            fireworksGif.add(new JLabel(imgFireworksGif));
            fireworksGif.add(new JLabel(imgFireworksGif));

            this.add(fireworksGif.get(0), new AbsoluteConstraints(600, 330, -1, -1));
            this.add(fireworksGif.get(1), new AbsoluteConstraints(45, 330, -1, -1));

            middleGif.setIcon(imgWinGif);
        } else {
            middleGif.setIcon(imgLoseGif);
        }

        btnReset.setIcon(imgBtnReset.get(0));
        this.add(btnReset, new AbsoluteConstraints(245, 456, -1, -1));

        btnMainMenu.setIcon(imgBtnMain.get(0));
        this.add(btnMainMenu, new AbsoluteConstraints(409, 456, -1, -1));
        btnMainMenu.setVisible(true);

        this.add(lblScore, new AbsoluteConstraints(83, 240, -1, -1));
        lblRecord.setText(String.format("%06d%n", s.getRecordScore()));
        this.add(lblRecord, new AbsoluteConstraints(633, 240, -1, -1));

        this.add(middleGif, new AbsoluteConstraints(271, 180, -1, -1));
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
        headImage = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();
        newRecord = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        starGif = new javax.swing.JLabel();
        middleGif = new javax.swing.JLabel();
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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
        getContentPane().add(headImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 63, -1, -1));

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
        lblRecord.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 250, -1, -1));

        newRecord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newRecord.setForeground(new java.awt.Color(255, 255, 255));
        newRecord.setToolTipText("");
        getContentPane().add(newRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        lblScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 250, -1, -1));
        getContentPane().add(starGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 275, 32, 32));
        getContentPane().add(middleGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

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
        getContentPane().add(frameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        setState(Frame.ICONIFIED);
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
        a.stop();
        this.dispose();
        new GUI_MainMenu(s).setVisible(true);
    }//GEN-LAST:event_mainMenuMouseReleased

    private void menuDropdownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_menuDropdownMouseReleased

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

    private void frameDragMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseReleased
        frameDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_frameDragMouseReleased

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        a.stop();
        this.dispose();
        s.newGame(s);
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
        a.stop();
        this.dispose();
        s.newGame(s);
    }//GEN-LAST:event_btnResetMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_formMouseReleased

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
        a.stop();
        this.dispose();
        new GUI_MainMenu(s).setVisible(true);
    }//GEN-LAST:event_btnMainMenuMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (Objects.equals(s.getRecordScore(), s.getRoundScore())) {
            newRecord.setText("NOVO RECORDE");
            starGif.setVisible(true);
        }
        if (s.getGameStatus() == 1) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3300);
                        loadScore();
                        count();
                    } catch (InterruptedException ex) {
                        System.err.println("ERRO: " + ex);
                    }
                }
            }.start();
        } else {
            lblScore.setText(String.format("%06d%n", s.getRoundScore()));
        }

    }//GEN-LAST:event_formWindowOpened

    // <editor-fold defaultstate="collapsed" desc="Inicializar menu">
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

    // <editor-fold defaultstate="collapsed" desc="Inicializar áudio">
    private void initAudio() {
        if (s.getGameStatus() == 1) {
            a.setAudioPath("src/main/resources/audio/youWin.wav");
        } else {
            a.setAudioPath("src/main/resources/audio/youLose.wav");
        }

        a.play(false);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Carregar imagens">
    private void loadImages() {
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetDef.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetHov.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetPre.png"));

        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuDef.png"));
        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuHov.png"));
        imgBtnMain.add(new ImageIcon("imgs/buttons/btnMenuPre.png"));

        imgHead.add(new ImageIcon("imgs/victory/victoryHead.png"));
        imgHead.add(new ImageIcon("imgs/victory/defeatedHead.png"));
        
        s.setFrameIcon(this);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Inicializar contador de score">
    private void loadScore() {
        // Ativa a progress bar quando a janela estiver ativa
        if (s.getRoundScore() != 0) {
            // Incrementa o score do zero até nosso score em 1 seg
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                int scoreIncrement = 0;

                @Override
                public void run() {
                    scoreIncrement += 1;
                    lblScore.setText(String.format("%06d%n", scoreIncrement));
                    if (scoreIncrement == s.getRoundScore()) {
                        timer.cancel();
                    }
                }
            }, 25, 25);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Contador auxiliar para score">
    private void count() {
        if (s.getRoundScore() != 0) {
            Timer counter = new Timer();
            counter.scheduleAtFixedRate(new TimerTask() {
                int timeRunning = 3;

                public void run() {
                    timeRunning -= 1;
                    if (timeRunning == 0) {
                        timer.cancel();
                        lblScore.setText(String.format("%06d%n", s.getRoundScore()));
                    }
                }
            }, 1000, 1000);
        }
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
    private javax.swing.JLabel headImage;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel middleGif;
    private javax.swing.JLabel newGame;
    private javax.swing.JLabel newRecord;
    private javax.swing.JLabel starGif;
    // End of variables declaration//GEN-END:variables
}
