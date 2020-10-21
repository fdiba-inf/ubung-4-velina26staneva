package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);

    int[] numbers = new int [5];
    
    System.out.println("Enter a number: ");
  //  char S = ' ';

    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextInt();
    }

    for(int i = 0; i<numbers.length; i++){
      for(int j = 0; j<i; j++){
        System.out.print(" ");
      }
      System.out.println(numbers[i]);
    }

    
  }

}

