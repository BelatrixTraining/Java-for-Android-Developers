package com.bx.java.samples.factory;

/**
 * Created by eduardo on 06/01/17.
 */
public class GameFactory {

    public final static int TYPE_FOOTBALL= 1;
    public final static int TYPE_BASKETBALL= 2;
    public final static int TYPE_BASEBALL= 3;

    public  Field createGame(int gameType){

       switch (gameType){
           case TYPE_FOOTBALL:
               return new FootballField();

           case TYPE_BASKETBALL:
               return new BasketBallField();

           case TYPE_BASEBALL:
               return  new BaseBallField();

            default:
                return new FootballField();
       }
    }
}
