// Rebecca Ji
// P1
// Zero-Hero
// 9/16/2025

/*
 * DESCRIPTION:
 */

package edu.bhscs;

public class Main2 {

  public static float NAME_OF_THIS_FLOAT = 69.42f;
  public static char A = 'a';

  public static void main(String[] args) {
    System.out.println(A);
    System.out.println(pushup("Garlic"));
    pushup("garlic");

    Awesome steve = new Awesome("Steve");
    Awesome sue = new Awesome("Sue");
    Awesome linda = new Awesome("linda");
    Awesome ronda = new Awesome("hi Ronda");
    System.out.println(steve.getName());

    Greatness rebecca = new Greatness("Rebecca");
    Greatness grace = new Greatness("Grace");
    System.out.println(rebecca.getName1());
  }

  public static String pushup(String food) {
    return "sweat " + food;
  }
}
