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
  int cash = 0;
  int skill = 0;
  Player p; // Added field for Player reference
  public boolean employed;
  String customerName;

  // constructor
  public Baker(String name) {

    this.name = name;

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

  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  public void learn(int amount) {
    this.skill += amount;
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("What cake do you want?");
    Flour flour = new Flour(10, 1); // or use appropriate parameters as defined in Flour class
    Cake c = new Cake(answer, flour, this.skill);
    return c;
  }

  void takeJob() {
    String doYouWantToWorkHere = this.p.giveanswer("Do you want to work here?");
    if (doYouWantToWorkHere.equals("yes")) {
      this.employed = true;
      System.out.println("Yay I have a job now I can buy more flour");
    }
  }

  public void getMood() {
    System.out.println("*" + name + " is " + this.mood + "*");
  }

  public Cake whatCake(Player player) {
    return new Cake(
        giveAnswer("What ingredient do you want in your cake?"),
        giveAnswer("What color do you want your cake to be?"));
  }

  public void bakeCake(String ingredient, String color) {
    this.cake = new Cake(ingredient, color);
    System.out.println(
        "The baker bakes a "
            + color
            + " cake with "
            + ingredient
            + "... And with flour of course.");
  }

  public Cake bakes(int size, String customerName) {
    return new Cake(size, customerName);

  }

  public Cake getCake() {
    return this.cake;
  }
}
