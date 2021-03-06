package edu.uvg.map;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */
// se importan nuestras otras clases
import edu.uvg.coins.PileOfCoins;
import edu.uvg.robot.Robot;
import edu.uvg.wall.Wall;

import java.util.ArrayList;

public class Map {
    // atributos
    private int width;
    private int height;
    private Robot robot;
    private ArrayList<Wall> walls;
    private ArrayList<PileOfCoins> piles;
// constructor
    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.walls = new ArrayList<Wall>();
        this.piles = new ArrayList<PileOfCoins>();
    }
// getters & setters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Robot getRobot() {
        return robot;
    }

    // coloca un robot en el mapa
    public void addRobot(Robot robot) {
        this.robot = robot;
    }
// agrega paredes al mapa
    public void addWall(Wall wall) {
        this.walls.add(wall);
    }
// coloca monedas en el mapa
    public void addPileOfCoins(PileOfCoins pile) {
        this.piles.add(pile);
    }

    // verifica si hay pared en la posicion indicada
    public boolean hasWallAt(int x, int y) {
        for(Wall wall : this.walls) {
            if (wall.getX() == x && wall.getY() == y) {
                return true;
            }
        }

        return false;
    }

    // verifica si hay monedas en la posicion indicada
    public PileOfCoins getCoinsAt(int x, int y) {
        for(PileOfCoins pile : this.piles) {
            if (pile.getX() == x && pile.getY() == y) {
                return pile;
            }
        }

        return null;
    }


    private boolean hasCoin(int x, int y) {
        return this.getCoinsAt(x, y) != null;
    }
// toma monedas
    private boolean executePick() {
        PileOfCoins foundPile = getCoinsAt(
                this.robot.getX(),
                this.robot.getY()
        );

        if (foundPile != null) {
            if (foundPile.removeCoin()) {
                robot.addCoin();
                return true;
            }
        }

        return false;
    }
// relaiza los movimientos
    private boolean executeMove() {
        int rx = this.robot.getX();
        int ry = this.robot.getY();
        int rd = this.robot.getDirection();

        switch(rd) {
            case 0:
                if (ry > 0 && !this.hasWallAt(rx, ry - 1)) {
                    this.robot.move();
                    return true;
                }

                return false;
            case 1:
                if (rx < (this.width - 1) && !this.hasWallAt(rx + 1, ry)) {
                    this.robot.move();
                    return true;
                }

                return false;
            case 2:
                if (ry < (this.height - 1) && !this.hasWallAt(rx, ry + 1)) {
                    this.robot.move();
                    return true;
                }

                return false;
            default:
                if (rx > 0 && !this.hasWallAt(rx - 1, ry)) {
                    this.robot.move();
                    return true;
                }

                return false;
        }
    }
// realiza una instruccion
    public boolean executeAction(String action) {
        if (this.robot == null) {
            return false;
        }

        switch(action) {
            case "MOVE":
                return this.executeMove();
            case "PICK":
                return this.executePick();
            case "ROTATE":
                this.robot.rotate();
                return true;
            default:
                return false;
        }
    }
// imprime el mapa y todos sus componentes
    @Override
    public String toString() {
        String result = "";
        for (int row = 0; row < this.height; row++) {
            for (int col = 0; col < this.width; col++) {
                if (this.robot.getX() == col && this.robot.getY() == row) {
                    result += this.robot;
                } else if (hasCoin(col, row)) {
                    PileOfCoins pile = getCoinsAt(col, row);
                    result += pile;
                } else if (hasWallAt(col, row)) {
                    result += "*";
                } else {
                    result += " ";
                }
            }

            result += "\n";
        }

        return result;
    }
}
