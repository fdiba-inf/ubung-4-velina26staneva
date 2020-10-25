package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {
  public static void main (String [] args) {

    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int[] numbers = new int[a];

    System.out.print("Enter a number: ");

    for(int index = 0; index < numbers.length; index++){
      numbers[index] = input.nextInt();
     }
    for(int index = 0; index < numbers.length; index++){
    for(int j = 0; j < index; j++) {
      System.out.print(" ");
    }
    System.out.println(numbers[index]);
    }
  }
}