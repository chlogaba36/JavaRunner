package com.example.test_1;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class AnimationController extends AnimationTimer {
    private Camera myCamera;
    private Heros myHero;
    private Scene myScene;
    //EXPERIMENTAL
    private Group myGroup;
    private Pane myPane;
    private Gravity myGravity;

    //

    public AnimationController(Camera myCamera, Heros myHero,Scene myScene,Group myGroup,Pane myPane){
        this.myCamera=myCamera;
        this.myHero=myHero;
        this.myScene=myScene;
        this.myGroup=myGroup;
        this.myPane=myPane;
        this.myGravity=new Gravity(myHero);
    }
    @Override
    public void handle(long currentNanoTime){
        myHero.getImageview().setX(myHero.getX()-myCamera.getX());
        myHero.getImageview().setY(myHero.getY()-myCamera.getY());

        int index=(int)((currentNanoTime/1000000)/250)%6;
        if(myHero.isRight()) {
            myHero.getImageview().setViewport(new Rectangle2D(10 + (85 * index), 0, 65, 100));
        }
        else{
            myHero.getImageview().setViewport(new Rectangle2D(10 + (85 * (index+1)), 0, 65, 100));
        }

    }
    public void setup(){
        myGravity.startGrav();
        this.myScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode code=keyEvent.getCode();
                if(code==KeyCode.D){
                    myHero.setRunning(true);
                    myPane.getChildren().remove(myHero.getImageview());//OPTIONNEL
                    myHero.swapToRightIMGVIew();//OPTIONNEL
                    myHero.setRight(true);//OPTIONNEL
                    myPane.getChildren().add(myHero.getImageview());
                    myHero.setX(myHero.getX()+10);
                }
                if(code==KeyCode.Q){
                    myHero.setRunning(true);
                    myPane.getChildren().remove(myHero.getImageview());//OPTIONNEL
                    myHero.swapToLeftIMGVIew();//OPTIONNEL
                    myHero.setLeft(true);//OPTIONNEL

                    myPane.getChildren().add(myHero.getImageview());
                    myHero.setX(myHero.getX()-10);

                }
                if(code==KeyCode.SPACE){
                    Jumper myJump=new Jumper(myHero);
                    myJump.jump();
                }
                if(code==KeyCode.S){
                    myHero.setY(myHero.getY()+10);
                }
                if(code==KeyCode.Z){
                    System.out.println("player y"+myHero.getY());
                }
            }
        });
        this.myScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode code=keyEvent.getCode();
                if(code==KeyCode.D){
                    if(!myHero.isIsjumping()){
                        myHero.setRunning(false);
                    }
                }
                if(code==KeyCode.Q){
                    if(!myHero.isIsjumping()){
                        myHero.setRunning(false);
                    }
                }

            }
        });

    }

}
