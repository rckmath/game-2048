package com.engcomp2019.prj2048;

import com.engcomp2019.core.Session;
import javax.swing.JFrame;

/**
 *
 * @author erick / rckmath - R.A. 18711630
 * @author leonardo / LeoSanavio - R.A. 18054395
 */

/* Main utilizada para inicializar nossa sessão e chamar o splash */
public class Main {

    private Session s;

    public static void main(String arg[]) {
        Main m = new Main(new Session(1));
    }

    /* Construtor contendo a função responsável por carregar
    os dados da janela (layout, imagem) além de definir o timer */
    public Main(Session s) {
        this.s = s;
        this.s.initializeSession();
        Splash splash = new Splash(s);
        // Propriedades da nossa janela splash (tamanho, etc)
        splash.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        splash.setSize(580, 150);
        splash.setUndecorated(true);
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);

        // Sleep de 1,375 segundos
        try {
            Thread.sleep(1375);
        } catch (InterruptedException ex) {
            System.err.println("ERRO: " + ex);
        }

        // Da um dispose/fecha nosso frame splash
        splash.dispose();
    }
}
