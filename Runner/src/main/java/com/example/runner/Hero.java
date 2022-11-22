package com.example.runner;

public class Hero extends AnimatedThing {
    private int attitude;
    private int frame;

    public Hero(String fileName, double setX, double setY, int attitude, int frame) {
        super(fileName, setX, setY, attitude);

    }
}
