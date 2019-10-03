package com.engcomp2019.gui;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.core.*;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author erick / rckmath
 */
public class GUI_Game extends JFrame {

    // ImageIcon
    private final ImageIcon imgFrame = new ImageIcon("imgs/frames/frameGame.png");
    private final ImageIcon imgMenu = new ImageIcon("imgs/elements/gameDropdown.png");
    private final ArrayList<ImageIcon> imgVolume = new ArrayList<>();
    private final ArrayList<ImageIcon> imgLeoHead = new ArrayList<>();
    private final ArrayList<ImageIcon> imgPad = new ArrayList<>();
    private final ArrayList<ImageIcon> imgBtnReset = new ArrayList<>();
    private final ArrayList<ImageIcon> imgUndo = new ArrayList<>();
    // Labels
    private final ArrayList<JLabel> gameTiles = new ArrayList<>();
    private ArrayList<JLabel> menuItems;
    // Outros
    private final DragWindow drag = new DragWindow();
    private final DragTile move = new DragTile();
    private final Close close = new Close();
    private Boolean menuActive = true;
    private final Audio a = new Audio();
    private final Session s;
    private int undoBuffer = 1;
    int[][] gameAux;

    /**
     * Inicializa e instancia a tela de jogo
     *
     * @param s Mantém a sessão inicializada
     */
    public GUI_Game(Session s) {
        this.s = s;
        gameAux = new int[s.getBoardSize()][s.getBoardSize()];
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        initArrowPadListener();
        initKeyboardListener();
        initGame();
        initAudio();
        initMenu();

        this.add(btnAudio, new AbsoluteConstraints(32, 525, -1, -1));

        btnUndo.setIcon(imgUndo.get(0));
        this.add(btnUndo, new AbsoluteConstraints(510, 140, -1, -1));

        easterEgg.setIcon(imgLeoHead.get(0));
        this.add(easterEgg, new AbsoluteConstraints(511, 422, -1, -1));

        btnReset.setIcon(imgBtnReset.get(0));
        this.add(btnReset, new AbsoluteConstraints(634, 417, -1, -1));

        btnPad.setIcon(imgPad.get(0));
        this.add(btnPad, new AbsoluteConstraints(473, 252, -1, -1));

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
        btnUndo = new javax.swing.JLabel();
        arrowPadU = new javax.swing.JLabel();
        arrowPadD = new javax.swing.JLabel();
        arrowPadL = new javax.swing.JLabel();
        arrowPadR = new javax.swing.JLabel();
        btnPad = new javax.swing.JLabel();
        easterEgg = new javax.swing.JLabel();
        btnAudio = new javax.swing.JLabel();
        mouseMove = new javax.swing.JLabel();
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

        btnUndo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUndoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUndoMouseReleased(evt);
            }
        });
        getContentPane().add(btnUndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));
        getContentPane().add(arrowPadU, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 254, 28, 42));
        getContentPane().add(arrowPadD, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 328, 28, 42));
        getContentPane().add(arrowPadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 298, 42, 28));
        getContentPane().add(arrowPadR, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 298, 42, 28));
        getContentPane().add(btnPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 252, -1, -1));

        easterEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                easterEggMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                easterEggMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                easterEggMouseReleased(evt);
            }
        });
        getContentPane().add(easterEgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 422, -1, -1));
        easterEgg.getAccessibleContext().setAccessibleName("easterEgg");

        btnAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAudioMouseReleased(evt);
            }
        });
        getContentPane().add(btnAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 515, 32, 32));

        mouseMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mouseMoveMouseDragged(evt);
            }
        });
        mouseMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mouseMoveMouseReleased(evt);
            }
        });
        getContentPane().add(mouseMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 73, 422, 418));

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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (s.getAudioOn()) {
            a.stop();
        }
    }//GEN-LAST:event_formWindowClosed

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        s.restart(this);
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
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
        s.restart(this);
    }//GEN-LAST:event_btnResetMouseReleased

    private void easterEggMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easterEggMouseEntered
        easterEgg.setIcon(imgLeoHead.get(1));
    }//GEN-LAST:event_easterEggMouseEntered

    private void easterEggMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easterEggMouseExited
        easterEgg.setIcon(imgLeoHead.get(0));
    }//GEN-LAST:event_easterEggMouseExited

    private void easterEggMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easterEggMouseReleased
        int[][] array2D = new int[s.getBoardSize()][s.getBoardSize()];
        array2D[1][0] = 1024;
        array2D[1][1] = 1024;
        s.setGameBoard(array2D);
        updateInfo(true);
    }//GEN-LAST:event_easterEggMouseReleased

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

    private void mouseMoveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMoveMouseReleased
        if (move.getBuffer() != 0) {
            move.setFinalCoordenates(evt);
            move.setBuffer(0);
            doMove((char) move.setCoord());
        }
        menuActive = close.menu(0, menuActive, menuDropdown, menuItems);
    }//GEN-LAST:event_mouseMoveMouseReleased

    private void mouseMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMoveMouseDragged
        if (move.getBuffer() == 0) {
            move.setInitialCoordenates(evt);
            move.setBuffer(1);
        }
    }//GEN-LAST:event_mouseMoveMouseDragged

    private void btnUndoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUndoMouseReleased
        btnUndo.setIcon(imgUndo.get(0));
        if (undoBuffer == 0) {
            for (int i = 0; i < s.getBoardSize(); i++) {
                System.arraycopy(gameAux[i], 0, s.getGameBoard()[i], 0, s.getBoardSize());
            }
            updateInfo(true);
            undoBuffer = 1;
        }
    }//GEN-LAST:event_btnUndoMouseReleased

    private void btnUndoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUndoMousePressed
        btnUndo.setIcon(imgUndo.get(1));
    }//GEN-LAST:event_btnUndoMousePressed

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
        if (!s.getAltTheme()) {
            a.setAudioPath("src/main/resources/audio/gameMusic.wav");
        } else {
            a.setAudioPath("src/main/resources/audio/leoMusic.wav");
        }

        if (s.getAudioOn()) {
            a.play(true);
            btnAudio.setIcon(imgVolume.get(0));
        } else {
            btnAudio.setIcon(imgVolume.get(1));
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Inicializar game">
    private void initGame() {
        s.setRoundScore(0);
        s.tileSpawn();
        s.tileSpawn();
        s.printGameBoard();
        // Depois de inicializar as tiles, status do jogo se torna 0
        updateTiles();
        s.setGameStatus(0);
        loadImages();

        lblScore.setText(String.format("%06d%n", s.getRoundScore()));
        lblRecord.setText(String.format("%06d%n", s.getRecordScore()));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Carregar imagens">
    private void loadImages() {
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadDef.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadU.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadD.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadL.png"));
        imgPad.add(new ImageIcon("imgs/buttons/pad/bntPadR.png"));

        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetDef.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetHov.png"));
        imgBtnReset.add(new ImageIcon("imgs/buttons/btnResetPre.png"));

        imgLeoHead.add(new ImageIcon("imgs/easteregg/leoHead.png"));
        imgLeoHead.add(new ImageIcon("imgs/easteregg/leoHeadTwo.png"));

        imgVolume.add(new ImageIcon("imgs/elements/volumeOn.png"));
        imgVolume.add(new ImageIcon("imgs/elements/volumeOff.png"));

        imgUndo.add(new ImageIcon("imgs/elements/btnUndoDef.png"));
        imgUndo.add(new ImageIcon("imgs/elements/btnUndoPre.png"));

        s.setFrameIcon(this);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Keyboard listener">
    private void initKeyboardListener() {
        addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                int key = evt.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_W:
                    case KeyEvent.VK_UP:
                        doMove('U');
                        break;
                    case KeyEvent.VK_A:
                    case KeyEvent.VK_LEFT:
                        doMove('L');
                        break;
                    case KeyEvent.VK_S:
                    case KeyEvent.VK_DOWN:
                        doMove('D');
                        break;
                    case KeyEvent.VK_D:
                    case KeyEvent.VK_RIGHT:
                        doMove('R');
                        break;
                    default:
                        break;
                }
            }
        });
    } // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Arrow pad listener">
    private void initArrowPadListener() {
        // Mouse listeners p/ as setas na tela
        arrowPadU.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(1));
            }

            public void mouseReleased(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(0));
                doMove('U');
            }
        });

        arrowPadD.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(2));
            }

            public void mouseReleased(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(0));
                doMove('D');
            }
        });

        arrowPadL.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(3));
            }

            public void mouseReleased(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(0));
                doMove('L');
            }
        });

        arrowPadR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(4));
            }

            public void mouseReleased(MouseEvent evt) {
                btnPad.setIcon(imgPad.get(0));
                doMove('R');
            }
        });
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Atualizar tiles">
    // Gera as tiles nas respectivas posições
    private void updateTiles() {
        int[] pos = {41, 106};  // Posição XY da primeira tile
        int k = 0;  // Índice contador de tiles geradas p/ posicionar uma a uma

        // Dispoe o ArrayList na tela em formato de matriz
        for (int i = 0; i < s.getBoardSize(); i++) {
            pos[0] = 41;
            for (int j = 0; j < s.getBoardSize(); j++) {
                if (s.getGameStatus() == -1) {
                    gameTiles.add(new JLabel(s.getTileImg(i, j)));
                    this.add(gameTiles.get(k), new AbsoluteConstraints(pos[0], pos[1], -1, -1));
                } else {
                    gameTiles.get(k).setIcon(s.getTileImg(i, j));
                }
                pos[0] += 100;
                k++;
            }
            pos[1] += 100;
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Atualizar informações na tela">
    /**
     *
     * @param easterEgg Se notSpawnTile true, não spawna nova tile
     */
    private void updateInfo(Boolean notSpawnTile) {
        updateTiles();
        if (!notSpawnTile) {
            s.tileSpawn();
            updateTiles();
        }
        if (s.getRoundScore() > s.getRecordScore()) {
            s.setRecordScore(s.getRoundScore());
        }
        // s.printGameBoard();
        lblScore.setText(String.format("%06d%n", s.getRoundScore()));
        lblRecord.setText(String.format("%06d%n", s.getRecordScore()));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Executar movimentos">
    /**
     * Executa o movimento
     *
     * @param id 'U' para cima, 'D' para baixo, 'L' para esquerda, 'R' para
     * direita
     */
    private void doMove(char id) {
        Boolean notSpawnTile;
        Boolean invalidMove = false;
        s.arrayCopy(gameAux);

        if (s.getGameStatus() != 2) {
            switch (id) {
                case 'U':
                    s.setRoundScore(s.getRoundScore() + s.moveUp(s.getGameBoard()));
                    break;
                case 'D':
                    s.setRoundScore(s.getRoundScore() + s.moveDown(s.getGameBoard()));
                    break;
                case 'L':
                    s.setRoundScore(s.getRoundScore() + s.moveLeft(s.getGameBoard()));
                    break;
                case 'R':
                    s.setRoundScore(s.getRoundScore() + s.moveRight(s.getGameBoard()));
                    break;
                default:
                    System.err.println("\nMovimento inválido.");
                    invalidMove = true;
                    break;
            }

            verifyGameOver();
            notSpawnTile = isGameFinished();

            // Se notSpawnTile negado = true, verifica se deve spawnar tile
            if (!notSpawnTile) {
                notSpawnTile = verifyTileSpawn(gameAux);
            }

            if (!invalidMove) {
                undoBuffer = 0;
                updateInfo(notSpawnTile);
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Verificar vitória">
    private Boolean isGameFinished() {
        if (s.getGameStatus() != 1) {
            for (int i = 0; i < s.getBoardSize(); i++) {
                for (int j = 0; j < s.getBoardSize(); j++) {
                    if (s.getGameBoardValue(i, j) == 2048) {
                        new Thread() {
                            public void run() {
                                try {
                                    setEnabled(false);
                                    Thread.sleep(500);
                                    s.setGameStatus(1);
                                    dispose();
                                    if (s.getAudioOn()) {
                                        a.stop();
                                    }
                                    if (s.getAltTheme()) {
                                        new GUI_EasterEgg(s).setVisible(true);
                                    } else {
                                        new GUI_EndGame(s).setVisible(true);
                                    }
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(GUI_Game.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }.start();
                        return true;
                    }
                }
            }
        }
        return false;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Verificar game over">
    public void verifyGameOver() {
        if (s.getGameStatus() != 2) {
            if (s.isGameOver()) {
                try {
                    Thread.sleep(350);
                    s.setGameStatus(2);
                    dispose();
                    if (s.getAudioOn()) {
                        a.stop();
                    }
                    new GUI_EndGame(s).setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GUI_Game.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Verificar spawn de tile">
    /**
     * Se a matriz permaneceu igual pós-movimento, retorna true
     *
     * @param array2D Matriz a comparar com a original
     * @return True para caso forem iguais, false para se forem diferentes
     */
    public Boolean verifyTileSpawn(int array2D[][]) {
        if (s.areEqual(array2D)) {
            return true;
        }
        return false;
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowPadD;
    private javax.swing.JLabel arrowPadL;
    private javax.swing.JLabel arrowPadR;
    private javax.swing.JLabel arrowPadU;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnAudio;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnPad;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel btnUndo;
    private javax.swing.JLabel easterEgg;
    private javax.swing.JLabel exitGame;
    private javax.swing.JLabel frameBackground;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JLabel menuDropdown;
    private javax.swing.JLabel mouseMove;
    private javax.swing.JLabel newGame;
    // End of variables declaration//GEN-END:variables
}
