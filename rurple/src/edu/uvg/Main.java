package edu.uvg;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */
// importamos nuestras clases
import edu.uvg.coins.PileOfCoins;
import edu.uvg.map.Map;
import edu.uvg.robot.Robot;
import edu.uvg.wall.Wall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
// funcion para leer el archio con la descripion del mapa
    private static ArrayList<String[]> readMap(String mapFilePath) {
        ArrayList<String[]> inputMap = new ArrayList<String[]>();
        try {
            Scanner scan = new Scanner(new File(mapFilePath));
            // mientras haya una linea se lee
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                inputMap.add(line.trim().split(""));
            }
        } catch (FileNotFoundException ex) {

        }

        return inputMap;
    }
// construye el mapa
    private static Map buildMap(ArrayList<String[]> inputMap) {
        Map myMap = new Map(inputMap.get(0).length, inputMap.size());
        Robot robot;
        // analiza cada coluymna y fila segun el simbolo encontrado crea el tipo de objeto
        for (int row = 0; row < myMap.getHeight(); row++) {
            for (int col = 0; col < myMap.getWidth(); col++) {
                String toEvaluate = inputMap.get(row)[col];
                switch (toEvaluate) {
                    case " ":
                        break;
                    case "*":
                        Wall myWall = new Wall(col, row);
                        myMap.addWall(myWall);
                        break;
                    case "^":
                        robot = new Robot(col, row, 0);
                        myMap.addRobot(robot);
                        break;
                    case ">":
                        robot = new Robot(col, row, 1);
                        myMap.addRobot(robot);
                        break;
                    case "V":
                        robot = new Robot(col, row, 2);
                        myMap.addRobot(robot);
                        break;
                    case "<":
                        robot = new Robot(col, row, 3);
                        myMap.addRobot(robot);
                        break;
                    default:
                        int quantity = Integer.parseInt(toEvaluate);
                        PileOfCoins myPile = new PileOfCoins(col, row, quantity);
                        myMap.addPileOfCoins(myPile);
                        break;
                }
            }
        }

        return myMap;
    }
// aqui inicia el programa
    public static void main(String[] args) {
        ArrayList<String[]> inputMap = Main.readMap("/Users/samuel/workspace/uvg/poo2018/rurple/map1.txt");
        Map myMap = Main.buildMap(inputMap);

        try {
            // para que paresca que es una animacion
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("MOVE");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("PICK");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("PICK");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("ROTATE");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("ROTATE");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("ROTATE");
            Thread.sleep(500);
            System.out.println(myMap);
            myMap.executeAction("MOVE");
            Thread.sleep(500);
            System.out.println(myMap);
        } catch(InterruptedException ex) {

        }
    }
}
