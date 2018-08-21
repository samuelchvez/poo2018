package bikes;

public class MountainBike extends Bike {
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
        super(brand, color);
        this.velocities = velocities;
        this.suspension = suspension;
        this.friction = friction;
    }

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

    @Override
    public String getBrand() {
        return "MOUNTAIN BIKE - " + super.getBrand();
    }
}
