package TestGUI.View.MainItems;

import TestGUI.Main;
import javafx.fxml.FXML;

import java.io.IOException;

public class Controller {

    private Main main;

    @FXML
    private void goElectrical() throws IOException {
        main.showElectricalScene();
    }
}