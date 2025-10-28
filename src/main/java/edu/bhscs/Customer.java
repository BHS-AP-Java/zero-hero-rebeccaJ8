package edu.bhscs;

public class Customer {
  // fields and properties
  String name;
  int money;

  // constructor

  public Customer(String name, int money) {
    this.name = name;
    this.money = money;
    System.out.println("Customer " + name + " has $" + money + ".");
  }

  public void buys(int cost) {
    this.money -= cost;
  }

  public void takeCake(Cake bakeCake) {}

  public int pay(int price) {
    this.money -= price;
    return price;
  }
}
