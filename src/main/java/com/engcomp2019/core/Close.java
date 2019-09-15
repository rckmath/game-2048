package com.engcomp2019.core;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author erick / rckmath
 */
public class Close {

    private JFrame frame;
    private Boolean closeAll;

    /* CONSTRUTOR(ES) */
    /**
     * Construtor usado para manipular o menu
     */
    public Close() {
    }

    /**
     * Fecha o frame ou programa de acordo com os parametros
     *
     * @param pFrame Recebe o frame atual
     * @param pCloseAll Variavel de controle, "false" para fechar somente o
     * frame, "true" para fechar o programa todo
     */
    public Close(JFrame pFrame, Boolean pCloseAll) {
        this.frame = pFrame;
        this.closeAll = pCloseAll;
    }

    /* METODOS */
    /**
     * Fecha o frame ou o programa de acordo com o booleano closeAll
     */
    public void frame() {
        // Fecha o frame atual
        frame.dispose();

        // Fecha tudo se o valor do parametro closeAll for true
        if (closeAll) {
            // Garante o fechamento completo do nosso programa
            WindowEvent wev = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
            System.exit(0);
        }
    }

    /**
     * Fecha ou abre o menu de acordo com o parâmetro
     *
     * @param op 0 para executar ação apenas se o menu estiver ativo e 1 para se
     * estiver ativo ou desativo
     * @param pMenuActive Menu active, responsavel pelo status do menu (ativo e
     * desativo)
     * @param pMenuDropdown Label do menu
     * @param menuItems Itens do menu, pode receber n itens
     * @return Retorna menuActive atualizado para a chamada
     */
    public Boolean menu(Integer op, Boolean pMenuActive, JLabel pMenuDropdown, ArrayList<JLabel> menuItems) {
        try {
            // Se menu ativo, desativa ele
            if (pMenuActive) {
                pMenuActive = false;
                pMenuDropdown.setVisible(false);
                // Percorre os items do menu desativando-os
                for (Iterator<JLabel> iterator = menuItems.iterator(); iterator.hasNext();) {
                    iterator.next().setVisible(false);
                }
                // Se menu desativo e opção for 1, ativa ele
            } else if (op == 1) {
                pMenuDropdown.setVisible(true);
                pMenuActive = true;
                // Percorre os items do menu ativando-os
                for (Iterator<JLabel> iterator = menuItems.iterator(); iterator.hasNext();) {
                    iterator.next().setVisible(true);
                }
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
        }
        return pMenuActive;
    }
}
