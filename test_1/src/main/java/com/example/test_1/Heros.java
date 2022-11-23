package com.example.test_1;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros {
    private double x;
    private double y;

    private ImageView imageview;
    private boolean right,left,isjumping,isrunning;
    private boolean triggerGrav;

    public Heros(double x, double y) {
        this.x = x;
        this.y = y;
        this.imageview = new ImageView(new Image("heros_right.png"));
        imageview.setViewport(new Rectangle2D(20,0,65,100));
        this.triggerGrav=false;
        imageview.setX(300);
    }

    public boolean isRight() {
        return right;
    }
    public void swapToRightIMGVIew(){
        if(left){
            this.imageview=new ImageView(new Image("heros_right.png"));
        }

    }
    public void swapToLeftIMGVIew(){
        if(right){
            this.imageview=new ImageView(new Image("heros_left.png"));
        }

    }
    public void toggleGrav(boolean grav){
        triggerGrav=grav;
    }

    public boolean isTriggerGrav() {
        return triggerGrav;
    }

    public boolean isIsrunning() {
        return isrunning;
    }
    public void setRunning(boolean run){
        isrunning=run;
    }

    public void setRight(boolean right) {
        this.right = right;
        this.left=false;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
        this.right=false;
    }

    public boolean isIsjumping() {
        return isjumping;
    }

    public void setIsjumping(boolean isjumping) {
        this.isjumping = isjumping;
    }

    /*

            public void updateImageViewinscene(Camera man, long time){
                imageview.setX(x-man.getX());
                imageview.setY(y-man.getY());

                int index=(int)((time/1000000)/250)%6;
                imageview.setViewport(new Rectangle2D(10+(85*index),0,65,100));
                if (x==750){x=0;};
            }

         */
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double newx){this.x=newx;}
    public void setY(double newy){this.y=newy;}

    public ImageView getImageview(){return imageview;}




}
