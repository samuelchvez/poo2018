package people;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    SimpleStringProperty firstName;
    SimpleStringProperty lastName;

    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty();
        this.lastName = new SimpleStringProperty();

        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }

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

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
