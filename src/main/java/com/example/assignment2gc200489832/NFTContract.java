package com.example.assignment2gc200489832;

import com.google.gson.annotations.SerializedName;

public class NFTContract {
    @SerializedName("created_date")
    public String dateCreated;

    public String description;
    @SerializedName("image_url")
    public String image;

    public String name;
}
