package edu.hawaii.ics613;

/**
 * A solution to the FizzBuzz problem.
 *
 * Created by Branden Ogata on 2/4/2015.
 *
 */

public class FizzBuzz {
  /**
   * Prints the results for FizzBuzz from 1 to 100.
   *
   * @param args    Not used.
   *
   */

  public static void main(String[] args) {
    // Assuming that "1 to 100" is inclusive
    for (int i = 1; i <= 100; i++) {
      System.out.format("%d: %s%n", i, convertToFizzBuzz(i));
    }
  }

  /**
   * Returns FizzBuzz values.
   *
   * @param input    The int equal to the number to use for the FizzBuzz problem.
   *
   * @return A String that is "Fizz" if the number is divisible by 3,
   *                          "Buzz" if the number is divisible by 5,
   *                          "FizzBuzz" if the number is divisible by 3 and 5,
   *                          the number itself (as a String) otherwise.
   *
   */

  public static String convertToFizzBuzz(int input) {
    String output = Integer.toString(input);

    if ((input % 3 == 0) && (input % 5 == 0)) {
      output = "FizzBuzz";
    }
    else if (input % 3 == 0) {
      output = "Fizz";
    }
    else if (input % 5 == 0) {
      output = "Buzz";
    }

    return output;
  }
}
