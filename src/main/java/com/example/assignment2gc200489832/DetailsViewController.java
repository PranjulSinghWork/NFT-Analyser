package com.example.assignment2gc200489832;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class DetailsViewController implements Initializable {
    @FXML
    private Label dateCreatedLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private ImageView posterImageView;
    @FXML
    void backBtn(ActionEvent event) throws IOException {
        SceneChanger.sceneShift(event,"nft-view.fxml");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        descriptionLabel.setWrapText(true);
    }
    public void getNFTDetails(String name, String description, String dateCreated, String image){

        nameLabel.setText(name);

        descriptionLabel.setText(description);

        dateCreatedLabel.setText(dateCreated);

        posterImageView.setImage(new Image(image));


    }
}
