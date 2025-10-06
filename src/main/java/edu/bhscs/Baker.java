// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: baker whos super grumpy
 */

package edu.bhscs;

public class Baker {

  // fields and properties
  String name;
  String mood;
  Cake cake;

  // constructor
  public Baker(String name) {
    System.out.println("I am baker " + name + " and I hate working.");
    this.name = name;
    this.mood = "grumpy";
    return;
  }

  public void checkFlour(Flour flour) {
    if (flour.quality == 0) {
      this.mood = "Extra grumpy";
      System.out.println("aw shucks the flour went bad now I will scream at the customers.");
    } else {
      System.out.println(this.mood = "medium happy sorta grumpy");
      System.out.println(
          "the flour is good for the first time in 10 years I think I will be a bit nicer to the customers.");
    }
  }

  public void getMood() {
    System.out.println("*" + name + " is " + this.mood + "*");
  }

  public Cake whatCake(Player player){
    return new Cake(giveAnswer("What ingredient do you want in your cake?"), giveAnswer("What color do you want your cake to be?"));
  }



  public void bakeCake(String ingredient, String color) {
    this.cake = new Cake(ingredient, color);
    System.out.println("The baker bakes a " + color + " cake with " + ingredient + "... And with flour of course.");
  }



  public Cake getCake() {
    return this.cake;
  }
}
