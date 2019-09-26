package com.engcomp2019.core;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author erick / rckmath
 */
public class Engine {

    private int[][] gameBoard; // Board do jogo
    private int boardSize; // Tamanho da board

    /**
     * Construtor inicializando nossa board
     *
     * @param bSizeOp Tamanho da board, 1 para 3x3 e qualquer para 4x4
     */
    public Engine(int bSizeOp) {
        if (bSizeOp == 1) {
            this.boardSize = 3;
            this.gameBoard = new int[3][3];
        } else {
            this.boardSize = 4;
            this.gameBoard = new int[4][4];
        }
    }

    /* METODOS */
    // Getters and setters
    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] board) {
        this.gameBoard = board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    // Outros
    // Printa a matriz (para fins de debug)
    public void printGameBoard() {
        for (int[] b : gameBoard) {
            System.out.println(Arrays.toString(b));
        }
        System.out.println();
    }

    // Gera um número numa tile livre aleatória
    public void tileSpawn() {
        ArrayList<int[]> emptySpaces = new ArrayList<>();
        try {
            // Percorrendo nossa matriz e guardando a posição dos espaços em branco
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    if (gameBoard[i][j] == 0) {
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
                gameBoard[pos[0]][pos[1]] = x;
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
        }
    }
}
