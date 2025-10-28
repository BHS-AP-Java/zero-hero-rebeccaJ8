package edu.bhscs;

public class Table {

  int legs;
  int width;
  int height = 8;

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
  }

  public void draw() {

    for (int j = 0; j < width; j++) {
      System.out.print("=");
    }
    System.out.println();

       for (int i = 0; i < height; i++) {
      System.out.print("|");
      for (int s = 0; s < width-2; s++) {
      System.out.print(" ");
      }
      System.out.println("|");


    }
  }
}
