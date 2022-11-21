package com.example.assignment2gc200489832;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NFTViewController {

    @FXML
    private ListView<NFT> nftList;

    @FXML
    private TextField nftSearchTextField;

    @FXML
    private void search() throws IOException, InterruptedException {
        APIUtility.getNFTFromDB(nftSearchTextField.getText());
        APIResponse apiResponse = APIUtility.getNFTFromFile();
        nftList.getItems().addAll(apiResponse.getAssets());
    }

}
