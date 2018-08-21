package edu.uvg;

import bikes.Bike;
import bikes.MountainBike;

public class Main {

    private static void showBrand(Bike bike) {
        System.out.println("BRANDO: " + bike.getBrand());
    }

    public static void main(String[] args) {
	// write your code here

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
