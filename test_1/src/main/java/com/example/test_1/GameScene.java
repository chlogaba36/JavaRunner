package com.example.test_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;


public class GameScene extends Scene{
    private Camera camera1;

    public GameScene(Parent parent, double v, double v1, Camera camera1) {
        super(parent, v, v1);
        this.camera1 = camera1;

    }



}
