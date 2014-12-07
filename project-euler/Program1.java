/*
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.lang.System;
import java.util.Scanner;

public class Program1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a maximum number... ");

    long n = scanner.nextLong();
    long result = 0;
    if (n > 0) {
      for (int i = 1; i < n; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
          result = result + i;
        }
      }
    }
    System.out.println("Result is: "+result);
  }
}

