/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2_VowelsAndConssonants;

import java.util.*;
import java.lang.*;


/**
 *
 * @author user
 */
public class StringCategories {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Text: (press 'Return' to mark end of input)");
        String text = input.nextLine();
        text = text.toLowerCase();

        //Vowels Characters
        char[] vowels = "aeiou".toCharArray();
        int[] vowelsCount = new int[vowels.length];
        for (char textChar : text.toCharArray()) {
            for (int i = 0; i < vowels.length; i++) {
                char vowel = vowels[i];

                if (vowel == textChar) {
                    vowelsCount[i]++;
                    break;
                }
            }
        }
        System.out.print("Vowels:");
        for (int i = 0; i < vowelsCount.length; i++) {
            if (vowelsCount[i] >= 1) {
                System.out.print(vowels[i] + "(" + vowelsCount[i] + ")");
            }
        }

        //Consonants Characters 
        char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
        int[] consonantsCount = new int[consonants.length];
        for (char textChar : text.toCharArray()) {
            for (int j = 0; j < consonants.length; j++) {
                char consonant = consonants[j];

                if (consonant == textChar) {
                    consonantsCount[j]++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("Consonants: ");
        for (int j = 0; j < consonantsCount.length; j++) {
            if (consonantsCount[j] >= 1) {
                System.out.print(consonants[j] + "(" + consonantsCount[j] + ")");
            }
        }

        //Other Characters
        char[] other = " .,;-+!@#$%^&*()?".toCharArray();
        int[] otherCount = new int[other.length];
        for (char textChar : text.toCharArray()) {
            for (int k = 0; k < other.length; k++) {
                char others = other[k];

                if (others == textChar) {
                    otherCount[k]++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("Other Characters: ");
        for (int k = 0; k < otherCount.length; k++) {
            if (otherCount[k] >= 1) {
                System.out.print(other[k] + "(" + otherCount[k] + ")");
            }
        }

        //Longest Words
        System.out.println();
        System.out.println("The longest word: " + Arrays.stream(text.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));

    }
}
