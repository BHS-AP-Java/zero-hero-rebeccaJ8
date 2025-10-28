package edu.bhscs;

public class Table {

  int seats;
  double price;

  public Table(int seats, double price) {
    this.seats = seats;
    this.price = price;
  }

  public void draw() {

    for (int j = 0; j < 20; j++) {
      System.out.print("=");
    }
    System.out.println();
    for (int i = 0; i < 8; i++) {
      System.out.println("|                  |");


    }
  }
}
