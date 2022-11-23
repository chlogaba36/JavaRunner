package com.example.test_1;

import javafx.scene.image.ImageView;

public class StaticThing {
    private int sizex,sizey;
    private ImageView imageview1;


    public StaticThing(int sizex, int sizey, ImageView imageview1) {
        this.sizex = sizex;
        this.sizey = sizey;
        this.imageview1 = imageview1;

    }

    public ImageView getImageview1() {
        return imageview1;
    }


}
