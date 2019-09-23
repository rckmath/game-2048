package com.engcomp2019.prj2048;

import com.engcomp2019.audio.Audio;
import com.engcomp2019.gui.*;
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
public class Main extends JFrame {

    private final ImageIcon imgArt = new ImageIcon("src/main/java/com/engcomp2019/imgs/elements/gameLogoFinal.gif");     // Onde carregaremos nossa imagem
    //private final ImageIcon imgArt = new ImageIcon("src/main/java/com/engcomp2019/imgs/leoSplash.gif");     // Onde carregaremos nossa imagem
    private static JLabel lblArt;   // Label que definiremos nossa imagem
    private JProgressBar progressBar = new JProgressBar();   // Progress bar

    public static void main(String arg[]) {
        // Criando janela do nosso splash
        Main s = new Main();

        // Propriedades da nossa janela splash (tamanho, etc)
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setSize(580, 150);
        s.setUndecorated(true);
        s.setLocationRelativeTo(null);
        s.setVisible(true);

        // Sleep de 2,475 segundos
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            System.err.println("ERRO: " + ex);
        }

        // Da um dispose/fecha nosso frame splash
        s.dispose();
    }

    /* Construtor contendo a função responsável por carregar
    os dados da janela (layout, imagem) além de definir o timer */
    public Main() {
        //Ativa a progress bar quando a janela estiver ativa
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent arg0) {
                // Carrega nossa barra em 2,3 seg
                final Timer t = new Timer(23, (ActionEvent e) -> {
                    // Incrementa a progress bar a cada "rodada" de timer
                    progressBar.setValue(progressBar.getValue() + 1);
                    if (progressBar.getValue() == 100) {
                        ((Timer) e.getSource()).stop();
                    }
                });
                t.start();
            }
        });

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
        GUI_MainMenu oFrame = new GUI_MainMenu();
        oFrame.setVisible(true);
    }
}
