package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import people.Person;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Controller {
    @FXML
    TableView<Person> peopleTable;

    @FXML
    TableColumn firstNameCol;

    @FXML
    TableColumn lastNameCol;

    @FXML
    public void initialize() {

        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown"),
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown"),
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown"),
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown"),
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown"),
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams"),
                new Person("Emma", "Jones"),
                new Person("Michael", "Brown")
        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Person,String>("firstName")
        );

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Person,String>("lastName")
        );

        peopleTable.setItems(data);

    }

    public void openNewWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestScene.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Seleccion");
            stage.setScene(new Scene(root, 450, 450));

            // Manda la persona seleccionada
            TestSceneController testSceneController = loader.getController();
            Person selectedPerson = peopleTable.getSelectionModel().getSelectedItem();
            if (selectedPerson != null) {
                testSceneController.setName("" + selectedPerson);
            } else {
                testSceneController.setName("Mano, no hay nadie seleccionado!");
            }

            // Muestra la ventana
            stage.show();
            // Hide this current window (if this is what you want)
            // ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
