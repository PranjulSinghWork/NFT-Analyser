package com.example.assignment2gc200489832;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScenes(ActionEvent event, String fxmlFileName,String name,  String description,String dateCreated, String image, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        DetailsViewController controller = fxmlLoader.getController();
        controller.getNFTDetails(name,description,dateCreated,image);

        //This code has derived from the in class code by the professor.
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    public static void sceneShift(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        //This code has derived from the in class code by the professor.
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
