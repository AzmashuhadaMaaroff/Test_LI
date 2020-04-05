/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1_Array;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OddEvenNumber {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            List<Integer> cummulativeTotal = new ArrayList<Integer>();
            int even=0;
            int odd = 0;
            
            System.out.println("Enter any number (Enter 9 to stop the loop):"); // Asks for user input
            int num;
            while (true) {
                try {
                    num = input.nextInt();
                } catch (InputMismatchException ex) {
                    System.err.println("The entered value is not an integer.");
                    return;
                }
                if (num == 9) {  //terminate the loop
                    break;
                }
                if (num % 2 == 0) {  //operation to check if the input is even or odd number
                    even++;
                } else {
                    System.out.println("-Odd Number");
                    odd++;
                }
            }
        }
    }
}
