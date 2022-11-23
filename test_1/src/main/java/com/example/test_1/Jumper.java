package com.example.test_1;

import java.util.Timer;
import java.util.TimerTask;

public class Jumper {
    private Heros myHeros;
    private Timer myTimer;
    private TimerTask myTask;
    private int nbJump;

    public Jumper(Heros myHeros){
        this.myHeros=myHeros;
        this.nbJump=12;
        myTimer=new Timer();
        this.myTask=new TimerTask() {
            @Override
            public void run() {
                if (nbJump != 0) {
                    if (myHeros.isIsrunning()) {
                        if(myHeros.isRight()){
                            myHeros.setX(myHeros.getX()+10);
                            myHeros.setY(myHeros.getY()-10);
                        }
                        else{
                            myHeros.setX(myHeros.getX()-10);
                            myHeros.setY(myHeros.getY()-10);
                        }

                    } else {
                        myHeros.setY(myHeros.getY()-10);

                    }
                    nbJump--;
                }
                else{
                    myTimer.cancel();

                    myHeros.setIsjumping(false);
                    myHeros.toggleGrav(true);

                }
            }
        };
    }
    public void jump(){
        myHeros.setIsjumping(true);
        myTimer.schedule(myTask,0,25);
    }

}
