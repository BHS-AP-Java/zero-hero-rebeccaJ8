// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION:
 * MAKE A BAKE SELL.
 * REQUIRED: A CAKE, A BAKER, A BAKERY, A CUSTOMER, PTSA(MONEY)
 * PRINT TO SCREEN
 */

package edu.bhscs;


public class Main {
  public static void main(String[]args){

    Player user = new Player("rebecca");
    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("how old are you?");

    //Constructor
    Cake cake = new Cake();

    //PROPERTIES
    cake.color = "blue";
    cake.ingredient = "chocolate";


    new Cake().draw(name,age);

  }
}


