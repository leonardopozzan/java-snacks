package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class FirstSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita un numero intero:");

        int number = Integer.parseInt(scanner.nextLine());

        scanner.close();

        Random random = new Random();

        if(number % 2 == 0){
            System.out.println(number);
        }else{
            System.out.println(number+1);
        }
    }
}
