package edu.uvg.robot;

public class Robot {
    private int x;
    private int y;
    private int coinsCounter;
    private int direction;
    public static final String[] directions = {"^", ">", "V", "<"};

    public Robot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.coinsCounter = 0;
    }

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

    public void addCoin() {
        this.coinsCounter++;
    }

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

    @Override
    public String toString() {
        return Robot.directions[this.direction];
    }
}
