package com.example.runner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Camera {
    private int x;
    private int y;

    public Camera(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(int x){
        return x;
    }

    public int getY(int y){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    @Override
    public String toString(){
        return this.x+","+this.y;
    }

}

