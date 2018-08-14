package edu.uvg.coins;

public class PileOfCoins {
    private int quantity;
    private int x;
    private int y;

    public PileOfCoins(int x, int y, int quantity) {
        this.x = x;
        this.y = y;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean removeCoin() {
        if (this.quantity > 0) {
            this.quantity--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "" + this.quantity;
    }
}
