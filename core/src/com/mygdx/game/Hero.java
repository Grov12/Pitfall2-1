package com.mygdx.game;

/**
 * Created by Kottejimmy on 2016-11-18.
 */
public class Hero extends Figure{

    public Hero (String textureFilePath, float x, float y, int size){
        super(textureFilePath,x,y,size);
    }

    public void goRight(){
        setSpeedX(3);
    }
    public void goLeft(){
        setSpeedX(-3);
    }
}