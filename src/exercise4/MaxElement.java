package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    double [] numbers = new double[a];

    System.out.print("Enter a number: ");

    for(int index = 0; index < numbers.length; index++) {
        numbers[index] = input.nextDouble();
    }
    double Max = numbers[0];
    for(int index = 1; index < numbers.length; index++) {
      if(Max < numbers[index]) {
        Max = numbers[index];
      }
    }
    System.out.print("Max Element: " + Max);
  }
}