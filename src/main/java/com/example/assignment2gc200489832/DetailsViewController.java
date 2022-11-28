package com.example.assignment2gc200489832;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        descriptionLabel.setWrapText(true);
    }
    public void getNFTDetails(String name,String description, String dateCreated){
//        dateCreatedLabel.setText(name);

        nameLabel.setText(name);

        descriptionLabel.setText(description);

        dateCreatedLabel.setText(dateCreated);
//        dateCreatedLabel.setText(dateCreated);


    }
}
