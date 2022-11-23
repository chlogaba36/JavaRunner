package com.example.test_1;

import java.util.Timer;
import java.util.TimerTask;

public class Gravity {
    private Heros myHero;
    private int gravityIterations;
    private Timer myTimer;
    private TimerTask myTask;
    public Gravity(Heros myHero){
        this.myHero=myHero;
        myTimer=new Timer();
        myTask=new TimerTask() {
            @Override
            public void run() {
                if(myHero.getY()<300&&myHero.isTriggerGrav()){//LES COORDONNES SONT CHELOU

                    if(myHero.isIsrunning()){
                        if(myHero.isRight()){
                            myHero.setX(myHero.getX()+10);
                            myHero.setY(myHero.getY()+10);
                        }
                        else{
                            myHero.setX(myHero.getX()-10);
                            myHero.setY(myHero.getY()+10);
                        }
                    }
                    else{
                        myHero.setY(myHero.getY()+10);
                    }
                }
                else{
                    myHero.toggleGrav(false);
                    //myHero.setRunning(false);
                }
            }
        };
    }
    public void startGrav(){
        myTimer.schedule(myTask,0,25);
    }
}