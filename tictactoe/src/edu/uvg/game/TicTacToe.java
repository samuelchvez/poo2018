package edu.uvg.game;

import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    Cell[][] board;
    boolean isPlayersOneTurn;

    public TicTacToe() {
        this.board = new Cell[3][3];
        isPlayersOneTurn = true;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                this.board[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean placeAt(int row, int column) {
        if ((0 <= row && row <= 2) && (0 <= column && column <= 2)) {
            boolean hasPlaced;
            Cell fetchedCell = this.board[row][column];

            if (this.isPlayersOneTurn) {
                hasPlaced = fetchedCell.placeX();
            } else {
                hasPlaced = fetchedCell.placeO();
            }

            if (hasPlaced) {
                this.isPlayersOneTurn = !this.isPlayersOneTurn;
            }

            return hasPlaced;
        }

        return false;
    }

    private int sumCells(Cell[] cells) {
        int result = 0;
        for (Cell cell : cells) {
            result += cell.getValue();
        }

        return result;
    }

    private Cell[][] reverseBoard() {
        Cell[][] result = new Cell[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                result[i][j] = this.board[j][i];
            }
        }

        return result;
    }

    public int checkWinner() {
        Cell[][] reversedBoard = this.reverseBoard();
        int[] sums = new int[8];
        for (int i = 0; i < 3; i++) {
            sums[i] = sumCells(this.board[i]);
            sums[i + 3] = sumCells(reversedBoard[i]);
        }

        sums[6] = this.board[0][0].getValue() + this.board[1][1].getValue() + this.board[2][2].getValue();
        sums[7] = this.board[0][2].getValue() + this.board[1][1].getValue() + this.board[2][0].getValue();

        List sumsList = Arrays.asList(sums);
        if (sumsList.contains(Cell.OCCUPIED_BY_X * 3)) {
            return Cell.OCCUPIED_BY_X;
        } else if (sumsList.contains(Cell.OCCUPIED_BY_O * 3)) {
            return Cell.OCCUPIED_BY_O;
        }

        return Cell.NOT_OCCUPIED;
    }

    public boolean hasSpace() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (this.board[i][j].getValue() == Cell.NOT_OCCUPIED) {
                    return true;
                }
            }
        }

        return false;
    }
}
