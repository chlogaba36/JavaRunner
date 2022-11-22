package com.example.runner;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.Group;
import javafx.animation.AnimationTimer;

public class GameScene extends Scene {
    private Group parent;
    private Camera firstCamera;
    private StaticThing left;
    private StaticThing right;
   //private StaticThing numberOfLives;

    private Hero hero;
    private AnimationTimer timer;

    public GameScene(Group parent, double v, double v1, Camera firstCamera){
        super(parent, v, v1);
        this.parent = parent;
        this.firstCamera = firstCamera;
        this.left = new StaticThing("desert.png",0,0);
        this.right = new StaticThing("desert.png",800,0);
        this.hero = new Hero("heros.png",50,250,1,3); //setX:scroll horizontal setY:scroll vertical
        parent.getChildren().add(this.left.getSprite());
        parent.getChildren().add(this.right.getSprite());
        parent.getChildren().add(this.hero.getSprite());

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long time) {
                hero.update();
            };
        };
        timer.start();

    }
    public void renderGameScene(int x, int y){
        firstCamera.setX(x);
        firstCamera.setY(y);
    }

}
