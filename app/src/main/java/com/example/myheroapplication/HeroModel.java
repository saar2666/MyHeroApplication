package com.example.myheroapplication;


public class HeroModel{

    String name;
    String shortDesc;
    String longDesc;
    int image;

    public HeroModel(String name, String shortDesc, String longDesc, int image){
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public String getShortDesc(){
        return shortDesc;
    }

    public String getLongDesc(){
        return longDesc;
    }

    public int getImage(){
        return image;
    }

}
