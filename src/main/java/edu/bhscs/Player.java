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

  // properties
  Scanner scanner = new Scanner(System.in);
  String name;

  // constructor

  public Player(String name) {
    this.name = name;
    this.scanner = new Scanner(System.in);
  }

  // methods
  public String giveAnswer(String question) {
    System.out.println(question);
    String answer = scanner.nextLine();
    return answer;
  }
}
