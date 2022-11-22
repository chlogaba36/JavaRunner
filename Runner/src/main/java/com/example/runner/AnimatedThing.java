package com.example.runner;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.time.*;

public class AnimatedThing {
    private double x;
    private double y;
    private int attitude;
    private int frame;
    private ImageView sprite;
    private Image spriteSheet;
    private int z; //altitude
    private int index;
    private int maxIndex;
    private int sizeX;
    private int sizeY;
    private int offsetX;
    private int offsetY;
    private int durationBtwTwoFrames;

    public AnimatedThing(String fileName, double x, double y, int attitude){//ajouter frame
        this.x = x;
        this.y = y;
        this.attitude = attitude;
        //this.z = z;
        //this.index = index;
        //this.maxIndex = maxIndex;
        //this.sizeX = sizeX;
        //this.sizeY = sizeY;
        //this.offsetX = offsetX;
        //this.offsetY = offsetY;
        spriteSheet = new Image(fileName);
        this.sprite = new ImageView(spriteSheet);
        switch(attitude){
            case 0://still
                frame = 0;
                break;
            case 1://run
                frame = 2;
                break;
            case 2://jump up
                frame = 6;
                break;
            case 3://jump down
                frame = 7;
                break;
        }

        switch (frame){ // the frame are taken in the order from the image
            case 0:
                this.sprite.setViewport(new Rectangle2D(20,0,65,100));
                break;
            case 1:
                this.sprite.setViewport(new Rectangle2D(96,0,65,100));
                break;
            case 2://run
                this.sprite.setViewport(new Rectangle2D(170,0,85,100));
                break;
            case 3:
                this.sprite.setViewport(new Rectangle2D(264,0,65,100));
                break;
            case 4:
                this.sprite.setViewport(new Rectangle2D(350,0,65,100));
                break;
            case 5:
                this.sprite.setViewport(new Rectangle2D(420,0,85,100));
                break;
            case 6://jump up
                this.sprite.setViewport(new Rectangle2D(20,162,65,100));
                break;
            case 7://jump down
                this.sprite.setViewport(new Rectangle2D(96,162,65,100));
                break;
        }

        //for more attitudes: run&shoot: v 12 v1 364 jump&shoot v 20 v1 492
        this.sprite.setX(x);
        this.sprite.setY(y);

    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public int getAttitude(){
        return attitude;
    }

    public int getFrame(){
        return frame;
    }

    public ImageView getSprite(){
        return sprite;
    }

    public void setSprite(ImageView sprite){
        this.sprite = sprite;
    }

    public void setAttitude(int attitude){
        this.attitude = attitude;
    }

    public void setFrame(int frame){
        this.frame = frame;
    }

    public void update(){
        attitude = getAttitude();
        switch (attitude) {
            case 1:
                if (frame!=5){
                    frame += 1;
                }
                else{
                    frame =0;
                }
                break;
            case 2:
                frame = 0;
                attitude = 0;
                break;
            case 3:
                frame = 0;
                attitude = 0;
                break;
        }

    }

}
