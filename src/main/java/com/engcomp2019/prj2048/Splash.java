package com.engcomp2019.prj2048;

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

/* Meramente visual e não condiz com o tempo de carregamento do jogo */
// Classe Splash que herda de JFrame
public class Splash extends JFrame {

    private static JLabel lblArt;   // Label que definiremos nossa imagem
    private final ImageIcon imgArt = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\originalSplash.gif");       // Onde carregaremos nossa imagem
    //private final ImageIcon imgArt = new ImageIcon("src\\main\\java\\com\\engcomp2019\\imgs\\leoSplash.gif");       // Onde carregaremos nossa imagem
    public JProgressBar progressBar = new JProgressBar();   // Progress bar

    public static void main(String arg[]) {
        // Criando janela do nosso splash
        Splash s = new Splash();

        // Propriedades da nossa janela splash (tamanho, etc)
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setSize(512, 201);
        s.setUndecorated(true);
        s.setLocationRelativeTo(null);
        s.setVisible(true);

        // Sleep de 3,75 segundos
        try {
            Thread.sleep(3750);
        } catch (InterruptedException ex) {
            System.err.println("ERROR: " + ex);
        }

        // Da um dispose/fecha nosso frame splash
        s.dispose();
    }

    // Construtor contendo a função responsável por carregar os dados da janela (layout e imagem)
    public Splash() {
        //Ativa a progress bar quando a janela estive ativa
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent arg0) {
                // Carrega nossa barra em 3,5 seg
                final Timer t = new Timer(35, (ActionEvent e) -> {
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
        getContentPane().setLayout(null);
        
        // Adicionando a imagem no label e definindo o tamanho
        lblArt = new JLabel(imgArt);
        lblArt.setBounds(0, 0, 512, 196);
        
        // Adicionando a label (nossa imagem) na janela/frame
        getContentPane().add(lblArt);
        
        // Setando nossa barra de progresso
        progressBar.setStringPainted(false);
        progressBar.setBorderPainted(false);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(new Color(51, 255, 51));
        progressBar.setBounds(0, 196, 512, 5);
        getContentPane().add(progressBar); // Adicionando a barra de progresso na janela/frame 
    }

    // Fechar splash e chamar nossa tela principal do jogo
    @Override
    public void dispose() {
        super.dispose();
        MainMenu frame = new MainMenu();
        frame.setVisible(true);
    }
}
