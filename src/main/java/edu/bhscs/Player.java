// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: the player and their info
 */

package edu.bhscs;

import java.util.Scanner;

public class Player {
  System.println("You are the player, you will control the baker and the customer")
  Scanner scanner = new Scanner(System.in);
  String name;

  public Player(String name) {
    this.name = name;
  }

  public void answerQuestions() {
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + ".");
  }

  public String giveAnswer(String question){

    return "yes";

  }
}
