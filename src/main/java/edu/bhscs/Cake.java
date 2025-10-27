// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: the cake and its flavors and everything!
 */

package edu.bhscs;

public class Cake {

  // PROPERTIES
  String ingredient;
  String toppings;
  String color;
  int weight;
  Flour flour;

    //Drawing
  String frosting = "#";
  int height = 6;
  int width = 15;

  // CONSTRUCTORS
  public Cake(String color) {
    this.color = color;
    System.out.println("the cake is " + color);
  }


  public Cake(int toppings) {
    System.out.println("this cake has" + toppings + "toppings!");
  }

  public Cake(String answer, Flour flour2, int skill) {
    this.ingredient = answer;
    this.flour = flour2;
    this.weight = 5 + skill;
    System.out.println("baking the cake with... " );
    System.out.println("the cake is " + color);
    System.out.println("the cake weighs " + weight + " pounds");
  }

  public Cake(int size, String customerName){}

  public String color(){
    this.color = "pink";
    return color;
  }




  // METHODS

  public void draw(int height, int width){
    System.out.println("/Making your cake/");

    //Top frosting slope
    for (int i =0; i<height/2; i++){

      for (int s =0; s<height/2-i; s++){
        System.out.print(" ");
      }

      System.out.print("/");

      for (int f= 0; f<i*2;f++){
        System.out.print("^");
      }

      System.out.println("/|");

      System.out.print(this.frosting);
    }

    //Awesome Middle Border!

    for (int i=0;i<width;i++){
      System.out.print("=");
    }

    System.out.println("|///|");

    //Cake Body
    for (int i=0; i<height; i++){

      for (int s=0; s<1;s++){
        System.out.print(frosting);
      }

      System.out.print("|///| ");

    //Bottom Border
  for (int j=0; j<width; j++){
      System.out.print("=");
    }

      System.out.println("|/");
  }

      System.out.print(this.color);

      for (int j=0; j<width-2;j++){
        System.out.print(" ");

      }

      System.out.println(this.color);
    }

    // User input feature

  void draw(int x, int y, int z, int slope) {
    System.out.println("Drawing a cake!");
    int transAxis = Math.min(z, y);
    int maxWidth = x + transAxis + 3;
  }






      //Cake Drawing
  public void draw(String name, String age){
    System.out.println("Drawing a cake for " + name + " who is " + age + " years old!");
    System.out.println("Ingredient: " + ingredient + ", color: " +color);
    System.out.println("");

    draw(height, width);
  }


  public void draw(Table t){
    this.draw(7, 16);
    t.draw();
  }

}

