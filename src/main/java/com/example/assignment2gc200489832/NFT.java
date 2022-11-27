package com.example.assignment2gc200489832;

import com.google.gson.annotations.SerializedName;

public class NFT {
    public String name;
    @SerializedName("image_url")
    public String image;
    public String description;

    public String getImage() {
        return image;
    }

    public String toString(){
        return String.format("%s", name);
    }

    public Trait[] traits;

}
