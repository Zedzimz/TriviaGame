package net.zedzimz;

import java.util.Scanner;

public class TRIVIAGAMEV1 {
    public static void main(String[] args) {

        int answer1 = 5;
        int answer2 = 24;
        String answer3 = "Obsidian";
        int x = 0;

        System.out.println("Welcome to Minecraft Trivia!");
        System.out.println("This game will consist of 3 questions! Good Luck!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many neutral mobs are in vanilla Minecraft?");
        answer1 = scanner.nextInt();
        if (answer1 == 5) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println("Incorrect! The correct answer was 5.");
        }
        System.out.println("How many diamonds do you need to make a full set of diamond armor?");
        answer2 = scanner.nextInt();
        if (answer2 == 24) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println("Incorrect! The correct answer was 24.");
        }
        System.out.println("What type of block do you use to make a nether portal? (Make sure to capitalize the first letter of your answer!");
        answer3 = scanner.next();
        if (answer3.equals("Obsidian")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println("Incorrect! The correct answer was Obsidian.");
        }
        System.out.println("You received a total of: " + x + " points!");
        if (x == 0) {
            System.out.println("That's too bad! Better luck next time!");
        }
        if (x == 1) {
            System.out.println("Only 1 point? You can do better than that!");
        }
        if (x == 2) {
            System.out.println("So close to a perfect score! Good Job!");
        }
        if (x == 3) {
            System.out.println("A perfect score! NICE COCK!");
        }
    }
}
