// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: the cake and its flavors and everything!
 */

package edu.bhscs;

public class Cake {

  // Properties of cake!
  String ingredient;
  String toppings;
  String color;
  int weight;
  Flour flour;

  // I have to make a constructor
  public Cake(String ingredient, String color) {

    System.out.println("baking the cake with... " + ingredient);
    System.out.println("the cake is " + color);
  }

  public Cake(int toppings) {
    System.out.println("this cake has" + toppings + "toppings!");
  }

  public void eaten() {
    this.weight = this.weight - 2;
  }

  // to be weighed
  public int getweight() {
    return this.weight;
  }
}
