package edu.uvg.game;

public class Cell {
    private int row = 0;
    private int column = 0;
    private int value = 0;
    public static int OCCUPIED_BY_X = 1;
    public static int OCCUPIED_BY_O = -1;
    public static int NOT_OCCUPIED = 0;

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
}
