package bikes;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

// esta clase hereda de la clase pader Bike
public class MountainBike extends Bike {
    //atributos propios de esta clase
    private int velocities;
    private int suspension;
    private double friction;

    public MountainBike(
            String brand,
            String color,
            int velocities,
            int suspension,
            double friction
    ) {
        // se les da valor a los atributos heredados
        super(brand, color);
        // se le da valor a los atributos propios
        this.velocities = velocities;
        this.suspension = suspension;
        this.friction = friction;
    }
// getters y setters
    public int getVelocities() {
        return velocities;
    }

    public void setVelocities(int velocities) {
        this.velocities = velocities;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }
// se sobre escribe el metodo del pader, agretgandole un String mas.
    @Override
    public String getBrand() {
        return "MOUNTAIN BIKE - " + super.getBrand();
    }
}
