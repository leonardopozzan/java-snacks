package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class ThirdSnack {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            sum += numbers[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + sum);
    }
}
