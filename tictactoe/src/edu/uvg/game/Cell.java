package edu.uvg.game;

public class Cell {
    private int row = 0;
    private int column = 0;
    private int value = 0;
    public static final int OCCUPIED_BY_X = 1;
    public static final int OCCUPIED_BY_O = -1;
    public static final int NOT_OCCUPIED = 0;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.value = Cell.NOT_OCCUPIED;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    public boolean placeX() {
        if (this.value == NOT_OCCUPIED) {
            this.value = OCCUPIED_BY_X;
            return true;
        }

        return false;
    }

    public boolean placeO() {
        if (this.value == NOT_OCCUPIED) {
            this.value = OCCUPIED_BY_O;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        switch (this.value) {
            case Cell.OCCUPIED_BY_O: return "O";
            case Cell.OCCUPIED_BY_X: return "X";
            default: return ".";
        }
    }
}
