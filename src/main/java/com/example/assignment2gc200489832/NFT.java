package com.example.assignment2gc200489832;

import com.google.gson.annotations.SerializedName;

public class NFT {
    public String name;
    @SerializedName("image_url")
    public String image;
    public String description;

    @SerializedName("token_id")
    public String tokenID;

    public String getTokenID() {
        return tokenID;
    }

    public String getImage() {
        return image;
    }



    public String toString(){
        return String.format("%s", name);
    }

    public Trait[] traits;

    @SerializedName("asset_contract")
    public NFTContract assetContract;

    public NFTContract getAssetContract() {
        return assetContract;
    }
}
