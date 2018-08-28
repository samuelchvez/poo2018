package edu.uvg;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

import bikes.Bike;
import bikes.MountainBike;

public class Main {

    private static void showBrand(Bike bike) {
        System.out.println("BRANDO: " + bike.getBrand());
    }
    // aca inicia la ejecuacion del programa
    public static void main(String[] args) {

        // se crea nuevo objeto de tipo Bike
        // se le pasan parametros al constructor

        Bike myBike = new Bike("Shimano", "red");
        MountainBike neatBike = new MountainBike(
                "Vecesa",
                "blue",
                5,
                2,
                5
        );

        System.out.println("COLOR: " + neatBike.getColor());
        System.out.println("BRAND: " + neatBike.getBrand());

        showBrand(myBike);

        Bike lolBike = (Bike) neatBike;

        System.out.println(lolBike.getVelocities());
        showBrand(lolBike);
    }
}
