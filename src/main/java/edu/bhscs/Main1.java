// Rebecca Ji
// P1
// Zero-Hero
// 9/15/2025

/*
 * DESCRIPTION: Finding something interesting in this code INPUT: We don't know about the input yet
 * OUTPUT: Some cool words in the command lines terminal thing EDGE CASE: they are all edge cases
 */

package edu.bhscs;

class Main {
  // this is an example of a 'char' constant
  // because it is global, it should be in capital letters
  public static final char A = 'a';

  public static void main(String[] args) {

    int someNumber = 67;
    String fruit = " mango";
    System.out.println("I have " + A + fruit);
    System.out.println(A + someNumber + fruit);
    System.out.println(A + A + someNumber);
    System.out.println();
    System.out.println("this is neet");
    System.out.println();
    System.out.println();
    System.out.println("OK I am done");
  }
}


//*// Rebecca Ji
// P2
// Bake Sell
// 9/29/2025

/*
 * DESCRIPTION: MAKE A BAKE SELL. REQUIRED: A CAKE, A BAKER, A BAKERY, A CUSTOMER, PTSA(MONEY) PRINT
 * TO SCREEN
 */

package edu.bhscs;

import java.util.Scanner;


public class Main {
  // fields or properties: (something like hair)variable that modifies the instance
  // constructor: something that makes an instance of the class
  // methods: the instructions (recipe)

  // Example method to fix the error

  //*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    new Cake().draw();
    System.out.println("hello");
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
    new Cake().draw();
    scanner.close();
    *//