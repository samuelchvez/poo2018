package bikes;

public class Bike {
    private String brand;
    private String color;
    private int speed;

    public Bike() {
        this.speed = 0;
        this.brand = "";
        this.color = "gray";
    }

    public Bike(String brand) {
        this.speed = 0;
        this.brand = brand;
    }

    public Bike(String brand, String color) {
        this.speed = 0;
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        this.speed += 1;
    }

    public void accelerate(int acceleration) {
        this.speed += acceleration;
    }
}

/*
*
*  Bike myBike1 = new Bike();
*  Bike myBike2 = new Bike("shimano");
*  Bike myBike3 = new Bike("shimano", "red");
*  myBike3.accelerate();
*  myBike3.accelerate(100);
*
*
* */
