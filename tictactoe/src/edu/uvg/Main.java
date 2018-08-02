package edu.uvg;

import edu.uvg.game.Cell;
import edu.uvg.game.TicTacToe;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
            Stream<String> lines = Files.lines(
                Paths.get("/Users/samuel/workspace/uvg/poo2018/tictactoe/src/example.txt"),
                StandardCharsets.UTF_8
            );
            lines.forEach(s -> System.out.println(s));
        } catch (IOException exception) {
            System.out.println("Error!");
        }

        TicTacToe myTicTacToe = new TicTacToe();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n" + myTicTacToe + "\n");

            System.out.print("Ingrese una fila (0 - 2): ");
            int row = input.nextInt();

            System.out.print("Ingrese una columna (0 - 2): ");
            int column = input.nextInt();

            boolean hasBeenPlaced = myTicTacToe.placeAt(row, column);
            if (!hasBeenPlaced) {
                System.out.println("Tiro incorrecto, repita su ingreso por favor!");
            }
        } while (myTicTacToe.hasSpace() && !myTicTacToe.hasWinner());

        int winner = myTicTacToe.checkWinner();
        switch (winner) {
            case Cell.OCCUPIED_BY_X:
                System.out.println("Ha ganado X!");
                break;
            case Cell.OCCUPIED_BY_O:
                System.out.println("Ha ganado O!");
                break;
            default:
                System.out.println("Han empatado -_-");
                break;
        }

        System.out.println("Fin");
    }
}
