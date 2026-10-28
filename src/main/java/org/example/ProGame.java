package org.example;

public class ProGame extends Game {

    String player1 = "Bobby";
    String player2 = "FearGod";

    @Override
    public String players (String s)
    {
        return "proGame: " + player1 + " and " + player2 + " playing with " + s;
    }

    public void showInfo()
    {
        System.out.println("This is a pro Game");
    }


}
