package org.example;

public class SuperProGame extends ProGame {

   @Override
    public String players(String s)
   {
       return "superProGame: superstar " + player1 + "vs" + player2 + "- Mode: " + s;
   }
   public void showInfo()
   {
       System.out.println("This is a super pro game");
   }
}
