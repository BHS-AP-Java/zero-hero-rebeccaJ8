// Rebecca Ji
// P2
// Zero-Hero
// 9/15/2025

/*
 * DESCRIPTION: ptsa that takes all the money
  */

package edu.bhscs;

public class PTSA {
  int totalDonations;

  public PTSA() {
    this.totalDonations = 0;
  }

  public void donate(int proceeds) {
    this.totalDonations += proceeds;
  }
}

