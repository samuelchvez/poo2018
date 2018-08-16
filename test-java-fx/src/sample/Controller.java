package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;


public class Controller {
    @FXML
    private ListView<String> myList;


    public void pressButton(ActionEvent event) {
        System.out.println("hola viteh");
        ObservableList<String> items = myList.getItems();
        if (items != null) {
            items.add("hola" + Math.random());
        } else {
            items = FXCollections.observableArrayList();
            myList.setItems(items);
        }
    }

    public void listItemClicked(MouseEvent event) {
        System.out.println("clicked in: " + myList.getSelectionModel().getSelectedItem());
    }
}
