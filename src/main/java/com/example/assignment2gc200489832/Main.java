package com.example.assignment2gc200489832;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("nft-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("GET NFT!");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/logo.png")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //APIUtility.getNFTFromDB("WOM #466");
        APIResponse apiResponse = APIUtility.getNFTFromFile();
        launch();
    }
}