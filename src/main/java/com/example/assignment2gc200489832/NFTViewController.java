package com.example.assignment2gc200489832;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NFTViewController implements Initializable {

    @FXML
    private ListView<NFT> nftList;

    @FXML
    private TextField nftSearchTextField;
    @FXML
    private ImageView nftImageArt;
    @FXML
    private Button detailsBtn;

    @FXML
    private void search() throws IOException, InterruptedException {
        APIUtility.getNFTFromDB(nftSearchTextField.getText());
        APIResponse apiResponse = APIUtility.getNFTFromFile();
        nftList.getItems().addAll(apiResponse.getAssets());
        nftList.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nftList.setVisible(false);

        nftList.getSelectionModel().selectedItemProperty().addListener((obs, old, nftSelected)->{
            nftImageArt.setImage(new Image(nftSelected.getImage()));
        });
    }
}
