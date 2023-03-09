package org.lessons.java;
import java.util.Random;
public class SecondSnack {
    public static void main(String[] args) {

        String[] names = {"marco", "mattia", "sofia", "laura", "stefano", "giada"};
        String[] surnames = { "fochesato", "chiesa", "giorgetti", "boldrin", "manenti", "felice"};

        Random random = new Random();
        System.out.println("\nLista Invitati:\n");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[random.nextInt(names.length)]+" "+surnames[random.nextInt(surnames.length)]);
        }

    }
}
