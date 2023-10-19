package fr.dampierre;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int lance = rand.nextInt(6) + 1;
            total += lance;
            System.out.println("Lancé " + (i + 1) + ": " + lance);
        }
        System.out.println("Total des lancés:" + total);
        if (total == 20) {
            System.out.println("Vous avez gagné!");
        } else {
            System.out.println("Vous avez perdu.");
        }
    }
}
