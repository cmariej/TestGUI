package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private TextField textField1;

    public void buttonClick(ActionEvent event){
        String text = textField1.getText();
        System.out.println(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
