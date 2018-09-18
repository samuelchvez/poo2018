package bikes;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

public class Bike {
    // atributos
    private String brand;
    private String color;
    private int speed;
// constructores, cada constructor tiene una firma distinta
// a esto se le conoce como sobrecarga de metodos
    public Bike() {
        //valores predetetminados
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
// setters y getters
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
// metodo que incrementa en 1 la aceleracion
    public void accelerate() {
        this.speed += 1;
    }
// metodo que coloca la aceleracion en un valor indicadoi
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
