package com.example.test_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    Heros myHero;
    Background myDesert;
    Background myRightDesert;
    Camera myCamera;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Music myMusic=new Music("Music.mp3");
        myMusic.start();
        myHero=new Heros(1050,300);
        myCamera=new Camera(700,0);

        myDesert=new Background(3000,3000);
        myRightDesert=new Background(3000,3000);



        primaryStage.setTitle("My Runner: use Q D and space to play");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 800, 400,true);
        primaryStage.setScene(theScene);
        primaryStage.show();
        AnimationController animationController=new AnimationController(myCamera, myHero,theScene,root,pane);
        animationController.setup();
        animationController.start();

        ImageView spriteSheet3 =myRightDesert.getImageview();
        ImageView spriteSheet2 =myDesert.getImageview();
        ImageView spriteSheet =myHero.getImageview();

        pane.getChildren().addAll(spriteSheet3);
        pane.getChildren().addAll(spriteSheet2);
        pane.getChildren().addAll(spriteSheet);
        //pane.getChildren().addAll(new ImageView(new Image("heros_left.png")));

    }

    public static void main(String[] args) {
        launch();
    }
}