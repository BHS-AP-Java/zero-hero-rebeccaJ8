// Rebecca Ji
// P2
// AWSOME
// 9/29/2025

/*
 * DESCRIPTION: AWESOME
 */

package edu.bhscs;

public class Awesome {
  // fields/properties/This is the stuff tht Awesome HAS!!!!
  String name;
  String knowledge;

  // we need to CONSTRUCT something AWESOME!!!!
  public Awesome(String name) {
    System.out.println("I AM THE MOST AWESOME " + name);
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getKnowledge() {
    return this.knowledge;
  }
}
