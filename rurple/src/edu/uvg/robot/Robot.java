package edu.uvg.robot;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

public class Robot {
    // atributos
    private int x;
    private int y;
    private int coinsCounter;
    private int direction;
    public static final String[] directions = {"^", ">", "V", "<"};
// constructor
    public Robot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.coinsCounter = 0;
    }
// getters y setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCoinsCounter() {
        return coinsCounter;
    }

    public int getDirection() {
        return direction;
    }

    public void rotate() {
        this.direction = (this.direction + 1) % 4;
    }

    // aumenta el contador de ficha que tiene el robot
    public void addCoin() {
        this.coinsCounter++;
    }
// cambia las coordenadas del robot
    public void move() {
        switch(this.direction) {
            case 0:
                this.y--;
                break;
            case 1:
                this.x++;
                break;
            case 2:
                this.y++;
                break;
            default:
                this.x--;
                break;
        }
    }
// toString
    @Override
    public String toString() {
        return Robot.directions[this.direction];
    }
}
