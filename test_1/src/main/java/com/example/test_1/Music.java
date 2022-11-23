package com.example.test_1;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Music {

    private static MediaPlayer myPlayer;

    public Music(String name){
        try {
            this.myPlayer=new MediaPlayer(new Media(new File(name).toURI().toString()));
            //this.myPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


    public void start(){
        try{
            this.myPlayer.play();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
