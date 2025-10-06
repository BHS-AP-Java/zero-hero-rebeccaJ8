// Rebecca Ji
// P2
// Bake Sell
// 9/30/2025

/*
 * DESCRIPTION: Flour and how flour works
 */

package edu.bhscs;

public class Flour {
  // fields and properties
  int lbs;
  int quality;

  // constructor

  public Flour(int lbs, int quality) {
    this.quality = quality;

    this.lbs = lbs;
    System.out.println(
        "The flour is quality " + quality + ". We have " + lbs + " pounds of flour.");
  }

  public void goesBad() {
    this.quality = 0;
  }
}
