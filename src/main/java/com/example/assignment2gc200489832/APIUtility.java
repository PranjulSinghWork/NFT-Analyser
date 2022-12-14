package com.example.assignment2gc200489832;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {


    public static void getNFTFromDB(String searchNFT) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://opensea13.p.rapidapi.com/assets?collection_slug=cryptopunks&order_direction=desc&limit=20&include_orders=false"))
                .header("X-RapidAPI-Key", "1d42b1040dmshc5cabe163cf0580p10aaadjsnb659d25ef11d")
                .header("X-RapidAPI-Host", "opensea13.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("nft.json")));
    }
    public static  APIResponse getNFTFromFile(){
        /**
         * Creating the GSON object.
         */
        Gson gson = new Gson();
        APIResponse apiResponse = null;
        try(
                FileReader fileReader = new FileReader("nft.json");
                        JsonReader jsonReader = new JsonReader(fileReader);

                        )
        {
            apiResponse = gson.fromJson(jsonReader, APIResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  apiResponse;
    }


}
