package com.engcomp2019.prj2048;

import com.engcomp2019.core.Session;
import com.engcomp2019.gui.GUI_MainMenu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author erick / rckmath
 */

/* Splash meramente visual e não condiz com o tempo de carregamento do jogo */
public class Splash extends JFrame {

    private static JLabel lblArt;   // Label que definiremos nossa imagem
    private final JProgressBar progressBar = new JProgressBar();   // Progress bar
    private final ImageIcon imgArt;
    private final Session s;

    public Splash(Session s) {
        this.s = s;
        if (!s.getAltTheme()) {
            imgArt = new ImageIcon("imgs/elements/gameLogoFinal.gif");
        } else {
            System.out.println(s.getAltTheme());
            imgArt = new ImageIcon("imgs/easteregg/leoSplash.gif");
        }

        loadingBar();

        // Padrao de layout do pane ativo como nulo
        this.setLayout(null);

        // Adicionando a imagem no label e definindo o tamanho
        lblArt = new JLabel(imgArt);
        lblArt.setBounds(0, 0, 580, 145);

        // Adicionando a label (nossa imagem) na janela/frame
        this.add(lblArt);

        // Setando nossa barra de progresso
        progressBar.setStringPainted(false);
        progressBar.setBorderPainted(false);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(new Color(255, 255, 255));
        progressBar.setBounds(0, 145, 580, 5);
        this.add(progressBar); // Adicionando a barra de progresso na janela/frame 
    }

    // Fechar splash e chamar nossa tela principal do jogo
    @Override
    public void dispose() {
        super.dispose();
        GUI_MainMenu oFrame = new GUI_MainMenu(this.s);
        oFrame.setVisible(true);
    }

    private void loadingBar() {
        // Ativa a progress bar quando a janela estiver ativa
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent arg0) {
                // Carrega nossa barra em 1,5 seg
                final Timer t = new Timer(15, (ActionEvent e) -> {
                    // Incrementa a progress bar a cada "rodada" de timer
                    progressBar.setValue(progressBar.getValue() + 1);
                    if (progressBar.getValue() == 100) {
                        ((Timer) e.getSource()).stop();
                    }
                });
                t.start();
            }
        });
    }
}
