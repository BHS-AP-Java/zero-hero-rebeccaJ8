// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: The entirety of the bakery including cake, customer, and more!!
 */

package edu.bhscs;

public class Bakery {

  // fields and properties
  String menu = "chocolate cake, new york cheesecake, matcha layered cake";
  Baker baker;

  // constructor
  public Bakery() {
    System.out.println("This is the bakery's menu: " + menu);
  }

  // methods
  public int sold() {
    return 5;
  }
}

/* object programming: so we can program for specific objects.
 * For example, for a bakery.
 * It is also easy to look at the code all at once
 */
