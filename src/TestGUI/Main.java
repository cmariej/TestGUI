package TestGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private static BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("GUI Test");

        showMainView();
        showMainItems();
    }

    private void showMainView() throws IOException{
        mainLayout = FXMLLoader.load(Main.class.getResource("View/MainView.fxml"));
        primaryStage.setScene(new Scene(mainLayout));
        primaryStage.show();
    }

    private void showMainItems() throws IOException{
        FlowPane mainItems = FXMLLoader.load(Main.class.getResource("View/MainItems.fxml"));
        mainLayout.setCenter(mainItems);
    }

    public static void showElectricalScene() throws IOException{
        BorderPane electricalDep = FXMLLoader.load(Main.class.getResource("electrical/electricalDep.fxml"));
        mainLayout.setCenter(electricalDep);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
