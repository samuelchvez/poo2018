package edu.uvg.coins;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

public class PileOfCoins {
    //atributos
    private int quantity;
    private int x;
    private int y;
    //  constructor
    public PileOfCoins(int x, int y, int quantity) {
        this.x = x;
        this.y = y;
        this.quantity = quantity;
    }
// getters and setters
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
// metodo to string
    @Override
    public String toString() {
        return "" + this.quantity;
    }
}
