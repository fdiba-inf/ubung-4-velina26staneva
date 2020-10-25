package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double [] numbers = new double[a];

         
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
        int Min=0;
      double Min1=numbers[0];
       for ( int index=1 ; index<numbers.length ; index++){
         if (Min1>numbers[index]){
           Min1=numbers[index];
           Min = index;
         }
        
  
       }
       System.out.println("Min index: " + Min);
    }
}


