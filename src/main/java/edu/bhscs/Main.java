// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION:
 * MAKE A BAKE SELL.
 * REQUIRED: A CAKE, A BAKER, A BAKERY, A CUSTOMER, PTSA(MONEY)
 * PRINT TO SCREEN
 */

package edu.bhscs;

import java.util.Scanner;

public class Main {
  // fields or properties: (something like hair)variable that modifies the instance
  // constructor: something that makes an instance of the class
  // methods: the instructions (recipe)

  // Example method to fix the error

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // create the instance bakery
    Bakery myBakery = new Bakery();
    // initialize baker
    Baker myBaker = new Baker("Ashaalmital");
    myBaker.getMood();
    // initialize ingredients
    Flour flour = new Flour(5, 0);
    // First check the flour
    myBaker.checkFlour(flour);
    myBaker.getMood();
    int myProceeds = myBakery.sold();
    myProceeds += myBakery.sold();
    System.out.println("The bakery made $" + myProceeds);
    // Donate the money to PTSA
    System.out.println("*The money is automatically being donated to PTSA*");
    PTSA myPTSA = new PTSA();
    myPTSA.donate(myProceeds);
    System.out.println("The PTSA now has $" + myPTSA.totalDonations);

    scanner.close();
  }
}
