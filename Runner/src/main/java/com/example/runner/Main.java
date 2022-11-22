package com.example.runner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;


import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Runner");
        Group root = new Group();
        Camera firstCamera = new Camera(800, 400);
        GameScene theScene = new GameScene(root, 800, 400, firstCamera);
        primaryStage.setScene(theScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}