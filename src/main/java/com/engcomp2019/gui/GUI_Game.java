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
public class GUI_Game extends javax.swing.JFrame {

    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameGame.png");
    private final ImageIcon imgMenu = new ImageIcon("imgs/elements/gameDropdown.png");
    private final ImageIcon imgTileDef;
    private final ArrayList<ImageIcon> imgPad = new ArrayList<>();
    private final ArrayList<ImageIcon> imgBtnReset = new ArrayList<>();
    private final ArrayList<JLabel> gameTiles = new ArrayList<>();
    private final ArrayList<JLabel> menuItems;
    private final DragWindow drag = new DragWindow();
    private final Close close = new Close();
    private Boolean menuActive = true;
    private final Audio a = new Audio();
    private final Session s;

    /**
     * Inicializa e instancia a tela de jogo
     *
     * @param s Mantém a sessão inicializada
     */
    public GUI_Game(Session s) {
        this.s = s;
        s.setRoundScore(0);
        s.tileSpawn();
        s.tileSpawn();
        s.printGameBoard();
        
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        menuItems = new ArrayList<JLabel>() {
            {
                add(exitGame);
                add(newGame);
                add(mainMenu);
            }
        };

        lblScore.setText(String.format("%06d%n", s.getRoundScore()));
        lblRecord.setText(String.format("%06d%n", s.getRecordScore()));

        // Define as tiles de acordo com o status do tema
        if (!s.getAltTheme()) {
            a.play("src/main/java/com/engcomp2019/audio/gameMusic.wav", true);
            imgTileDef = new ImageIcon("imgs/tiles/def.png");
        } else {
            a.play("src/main/java/com/engcomp2019/audio/leoMusic.wav", true);
            imgTileDef = new ImageIcon("imgs/tiles/leo.gif");
        }

        gerarTiles();

        // Para inicializar as opções de menu desativadas
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);

        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadDef.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadU.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadD.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadL.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadR.png"));

        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetDef.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetHov.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetPre.png"));

        btnReset.setIcon(imgBtnReset.get(0));
        this.add(btnReset, new AbsoluteConstraints(634, 417, -1, -1));

        btnPad.setIcon(imgPad.get(0));
        this.add(btnPad, new AbsoluteConstraints(474, 252, -1, -1));

        menuDropdown.setIcon(imgMenu);
        this.add(menuDropdown, new AbsoluteConstraints(39, 20, -1, -1));
        menuDropdown.setVisible(false);

        frameBackground.setIcon(imgFrame);
        this.add(frameBackground, new AbsoluteConstraints(0, 0, -1, -1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitGame = new javax.swing.JLabel();
        newGame = new javax.swing.JLabel();
        mainMenu = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        btnFile = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        padU = new javax.swing.JLabel();
        padD = new javax.swing.JLabel();
        padL = new javax.swing.JLabel();
        padR = new javax.swing.JLabel();
        btnPad = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        frameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameGame"); // NOI18N
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
        getContentPane().add(exitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 18));

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

        menuDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuDropdownMouseReleased(evt);
            }
        });
        getContentPane().add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, 131, 77));

        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAboutMouseReleased(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 0, 50, 18));

        btnFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFileMouseReleased(evt);
            }
        });
        getContentPane().add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, 70, 18));

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
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 447, -1, -1));

        lblRecord.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(77, 77, 77));
        getContentPane().add(lblRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 265, -1, -1));

        lblScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(77, 77, 77));
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 150, -1, -1));

        padU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                padUMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                padUMouseReleased(evt);
            }
        });
        getContentPane().add(padU, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 254, 28, 42));

        padD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                padDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                padDMouseReleased(evt);
            }
        });
        getContentPane().add(padD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 328, 28, 42));

        padL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                padLMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                padLMouseReleased(evt);
            }
        });
        getContentPane().add(padL, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 298, 42, 28));

        padR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                padRMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                padRMouseReleased(evt);
            }
        });
        getContentPane().add(padR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 298, 42, 28));
        getContentPane().add(btnPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 252, -1, -1));

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
        setState(Frame.ICONIFIED);  // Minimize our frame
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        new Close(this, true).frame();
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseReleased
        GUI_AboutUs frameAbout = new GUI_AboutUs(this);
        frameAbout.setVisible(true);
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnAboutMouseReleased

    private void btnFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseReleased
        menuActive = close.menu(1, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_btnFileMouseReleased

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

    private void menuDropdownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_menuDropdownMouseReleased

    private void mainMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenuMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        // Chamar frame para confirmar ação
        GUI_MainConfirm frameConfirm;
        frameConfirm = new GUI_MainConfirm(this, s);
        frameConfirm.setVisible(true);
    }//GEN-LAST:event_mainMenuMouseReleased

    private void exitGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        GUI_Exit frameExit = new GUI_Exit(this);
        frameExit.setVisible(true);
    }//GEN-LAST:event_exitGameMouseReleased

    private void padUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padUMousePressed
        btnPad.setIcon(imgPad.get(1));
    }//GEN-LAST:event_padUMousePressed

    private void padUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padUMouseReleased
        btnPad.setIcon(imgPad.get(0));
    }//GEN-LAST:event_padUMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        a.stop();
    }//GEN-LAST:event_formWindowClosed

    private void padDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padDMousePressed
        btnPad.setIcon(imgPad.get(2));
    }//GEN-LAST:event_padDMousePressed

    private void padDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padDMouseReleased
        btnPad.setIcon(imgPad.get(0));
    }//GEN-LAST:event_padDMouseReleased

    private void padLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padLMousePressed
        btnPad.setIcon(imgPad.get(3));
    }//GEN-LAST:event_padLMousePressed

    private void padLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padLMouseReleased
        btnPad.setIcon(imgPad.get(0));
    }//GEN-LAST:event_padLMouseReleased

    private void padRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padRMousePressed
        btnPad.setIcon(imgPad.get(4));
    }//GEN-LAST:event_padRMousePressed

    private void padRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padRMouseReleased
        btnPad.setIcon(imgPad.get(0));
    }//GEN-LAST:event_padRMouseReleased

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        restart();
    }//GEN-LAST:event_newGameMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_formMouseReleased

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
        restart();
    }//GEN-LAST:event_btnResetMouseReleased

    // Gera as tiles nas respectivas posições
    private void gerarTiles() {
        int[] pos = {41, 106};
        int k = 0;

        for (int i = 0; i < s.getBoardSize(); i++) {
            pos[0] = 41;
            for (int j = 0; j < s.getBoardSize(); j++) {
                gameTiles.add(new JLabel(imgTileDef));
                this.add(gameTiles.get(k), new AbsoluteConstraints(pos[0], pos[1], -1, -1));
                pos[0] += 100;
                k++;
            }
            pos[1] += 100;
        }
    }

    private void restart() {
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        // Chamar frame para confirmar ação
        GUI_RestartConfirm frameConfirm;
        frameConfirm = new GUI_RestartConfirm(this, s);
        frameConfirm.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnPad;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel exitGame;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel newGame;
    private javax.swing.JLabel padD;
    private javax.swing.JLabel padL;
    private javax.swing.JLabel padR;
    private javax.swing.JLabel padU;
    // End of variables declaration//GEN-END:variables
}
