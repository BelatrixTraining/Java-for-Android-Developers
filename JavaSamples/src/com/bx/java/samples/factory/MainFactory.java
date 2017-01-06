package com.bx.java.samples.factory;

/**
 * Created by eduardo on 06/01/17.
 */
public class MainFactory {
    //psvm https://www.jetbrains.com/help/idea/2016.3/generating-code.html
    public static void main(String[] args) {
        System.out.println("Factory Pattern");
        GameFactory gameFactory= new GameFactory();

        //football field
        Field footballField= gameFactory.createGame(GameFactory.TYPE_FOOTBALL);
        footballField.drawField();

        //basketball field
        Field basketbakkField= gameFactory.createGame(GameFactory.TYPE_BASKETBALL);
        basketbakkField.drawField();
    }
}
