package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *@param someone the same of the persion
  *@return greeting string
  */
  public final String greet(final String someone) {
    return String.format("Hellooo, %s!", someone);
  }
}
