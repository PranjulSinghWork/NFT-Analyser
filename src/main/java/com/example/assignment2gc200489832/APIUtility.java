package com.example.assignment2gc200489832;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {


    public static void getNFTFromDB(String searchNFT) throws IOException, InterruptedException {
        String uri = "https://api.opensea.io/api/v1/assets?format=json";

        /**
         * configuring the environment to make an HTTp request
         */
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<Path> saveFile = client.send(httpRequest, HttpResponse
                .BodyHandlers
                .ofFile(Paths.get("nft.json")));
    }
}
