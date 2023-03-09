package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class FourthSnack {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10, 14};
        int[] array2 = {1, 3, 5};

        Random random = new Random();

        int[] smallestArray = array1.length > array2.length ? array2 : array1;
        int[] greaterArray = array1.length > array2.length ? array1 : array2;
        int maxDiff = Math.abs(array1.length - array2.length);

        int length = smallestArray.length + maxDiff;
        int[] newArray = Arrays.copyOf(smallestArray, length);

        for (int i = 0; i < maxDiff; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Nuovo elemento: " + randomNumber);
            newArray[smallestArray.length + i] = randomNumber;
        }
        System.out.println("Array rimasto uguale: " + Arrays.toString(greaterArray));
        System.out.println("Array modificato: " + Arrays.toString(newArray));



    }
}
