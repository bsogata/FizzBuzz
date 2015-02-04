package edu.hawaii.ics613;

/**
 * Created by Branden Ogata on 2/4/2015.
 */
public class FizzBuzz {
  public static void main(String[] args)
  {
    // Assuming that "1 to 100" is inclusive
    for (int i = 1; i <= 100; i++)
    {
      System.out.format("%d: %s%n", i, fizzBuzz(i));
    }
  }

  public static String fizzBuzz(int input)
  {
    String output = Integer.toString(input);

    if ((input % 3 == 0) && (input % 5 == 0))
    {
      output = "FizzBuzz";
    }
    else if (input % 3 == 0)
    {
      output = "Fizz";
    }
    else if (input % 5 == 0)
    {
      output = "Buzz";
    }

    return output;
  }
}
