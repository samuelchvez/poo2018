package people;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */

import javafx.beans.property.SimpleStringProperty;

public class Person {
    //atributos
    SimpleStringProperty firstName;
    SimpleStringProperty lastName;

    // constructor
    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty();
        this.lastName = new SimpleStringProperty();

        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
//getter y setters
    public String getFirstName() {
        return this.firstName.get();
    }
    public void setFirstName(String fName) {
        this.firstName.set(fName);
    }

    public String getLastName() {
        return this.lastName.get();
    }
    public void setLastName(String fName) {
        this.lastName.set(fName);
    }
// metodo to string
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
