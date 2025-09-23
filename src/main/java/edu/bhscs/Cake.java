package edu.bhscs;

public class Cake {

  // Properties of cake!
  String ingredient;
  String toppings;
  String color;
  String fruitflavor;
  int weight;

  // I have to make a constructor
  public Cake(String ingredient, String color) {

    System.out.println("baking the cake with... " + ingredient);
    System.out.println("the cake is " + color);

  }

  

  public Cake(int toppings){
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
