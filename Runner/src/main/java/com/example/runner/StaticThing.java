package com.example.runner;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView sprite;

    public StaticThing(String fileName, double sizeX, double sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image spriteSheet = new Image(fileName);
        this.sprite = new ImageView(spriteSheet);
        this.sprite.setX(sizeX);
        this.sprite.setY(sizeY);
    }

    public double getSizeX(){
        return sizeX;
    }

    public double getSizeY(){
        return sizeY;
    }

    public ImageView getSprite(){
        return sprite;
    }

    public void setSizeX(double sizeX){
        this.sizeX = sizeX;
    }

    public void setSizeY(double sizeY){
        this.sizeY = sizeY;
    }

    public void setSprite(ImageView sprite){
        this.sprite = sprite;
    }
}
