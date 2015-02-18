package tests;

import edu.hawaii.ics613.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the FizzBuzz class.
 *
 * Created by Branden Ogata on 2/18/2015.
 *
 */

public class FizzBuzzTest {

  /**
   * Tests the fizzBuzz method.
   *
   * @throws Exception when there is an error of some kind.
   *
   */

  @Test
  public void testFizzBuzz() throws Exception {
    assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    assertEquals("16", FizzBuzz.fizzBuzz(16));
  }
}