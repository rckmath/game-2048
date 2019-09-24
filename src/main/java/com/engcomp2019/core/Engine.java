package com.engcomp2019.core;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author erick / rckmath
 */
public class Engine {

    private final int[][] board; // Board do jogo
    private final int boardSize; // Tamanho da board

    /**
     * Construtor inicializando nossa board
     *
     * @param boardSize Tamanho da board, 1 para 3x3 e qualquer para 4x4
     */
    public Engine(int boardSize) {
        if (boardSize == 1) {
            this.boardSize = 3;
            this.board = new int[3][3];
        } else {
            this.boardSize = 4;
            this.board = new int[4][4];
        }
    }

    public void printArray() {
        for (int[] b : board) {
            System.out.println(Arrays.toString(b));
        }
        System.out.println();
    }

    public void tileSpawn() {
        ArrayList<int[]> emptySpaces = new ArrayList<>();
        try {
            // Percorrendo nossa matriz e guardando a posição dos espaços em branco
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    if (board[i][j] == 0) {
                        int[] pos = {i, j};
                        emptySpaces.add(pos);
                    }
                }
            }
            // Se houver espacos vazios, prossegue com a geracao
            if (!emptySpaces.isEmpty()) {
                // Gerando prox. numero a spawnar
                int x = (int) (Math.random() * ((10 - 0) + 1));
                if (x < 2) {
                    x = 4;
                } else {
                    x = 2;
                }
                // Sorteando índice onde o numero gerado sera posto
                int index;
                index = (int) (Math.random() * ((emptySpaces.size() - 0)));
                int[] pos = emptySpaces.get(index);
                board[pos[0]][pos[1]] = x;
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
        }
    }
}
