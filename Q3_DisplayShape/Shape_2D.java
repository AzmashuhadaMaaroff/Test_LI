/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3_DisplayShape;

import java.util.*;

/**
 *
 * @author user
 */
public class Shape_2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        int count = 0;
        while (repeat) {
            System.out.println("Hello, please select which shape to be displayed:");
            System.out.println("[Option: 'S' = Square, 'T' = Triangle, 'D' = Diamond}");
            char shape = input.next().charAt(0);
            System.out.println("Please key in the size of the shape:");
            int size = input.nextInt();

            //Diamond Shape
            if (shape == 'D') {
                for (int i = 0; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                for (int i = size - 1; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } //Triangle Shape
            else if (shape == 'T') {
                int t = 0;
                for (int i = 1; i <= size; ++i, t = 0) {
                    for (int space = 1; space <= size - i; ++space) {
                        System.out.print("  ");
                    }
                    while (t != 2 * i - 1) {
                        System.out.print("* ");
                        ++t;
                    }
                    System.out.println();
                }
            } //Square Shape
            else if (shape == 'S') {
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }

            }
            count++; //Loop to display another shape
            System.out.println();
            System.out.println("Do you want to display another shape? (y/n)");
            char another = input.next().charAt(0);
            if (another == 'y') {
                repeat = true;
            } else if (another == 'n') {
                break;
            } else {
                System.out.println("Please input 'y' or 'n' only:");
                another = input.next().charAt(0);
            }
        }

    }
}
