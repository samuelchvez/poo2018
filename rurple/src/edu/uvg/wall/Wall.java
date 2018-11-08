package edu.uvg.wall;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

public class Wall {
    //atributos
    private int x;
    private int y;
// constructor
    public Wall(int x, int y) {
        this.x = x;
        this.y = y;
    }
// getters ant toString
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "*";
    }
}
