package sample;
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */
//importar librerias necesaias
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TestSceneController {
    @FXML
    Label nameLabel;

    public void setName(String name) {
        this.nameLabel.setText(name);
    }
}
