package net.zedzimz;

import java.util.Scanner;

public class TRIVIAGAMEV3 {
    public static void main(String[] args) {
        while(true) {
        String[] questions = new String[5];
        questions[0] = "Which undead mob shoots a bow and arrow?";
        questions[1] = "How many dimensions are there?";
        questions[2] = "What dimension are Endermen from?";
        questions[3] = "What type of precious metal do piglins love?";
        questions[4] = "How many diamonds do you need for a diamond pickaxe";

        String[] answers = new String[5];
        answers[0] = "Skeleton";
        answers[1] = "3";
        answers[2] = "End";
        answers[3] = "Gold";
        answers[4] = "3";
        int x = 0;
        
        String[] score = new String[6];
        score[0] = "Ouch, no points? Better luck next time.";
        score[1] = "Well at least you didn't get 0.";
        score[2] = "You know a little bit, try brushing up on your Minecraft knowledge a little more.";
        score[3] = "Not bad, you got more than half correct!";
        score[4] = "Good work, You only missed 1!";
        score[5] = "Great job, You managed to get all questions correct!";

        String[] response = new String[6];
        response[0] = "Incorrect! Correct answer was: Skeleton";
        response[1] = "Incorrect! Correct answer was: 3";
        response[2] = "Incorrect! Correct answer was: End";
        response[3] = "Incorrect! Correct answer was: Gold";
        response[4] = "Incorrect! Correct answer was: 3";

        System.out.println("Welcome to the Minecraft Trivia Game!");
        System.out.println("This Trivia Game will consist of 5 questions.");
        System.out.println("In order to win you must get all questions correct!");
        System.out.println("Good Luck!");

        Scanner scanner = new Scanner(System.in);
        System.out.println(questions[0]);
        answers[0] = scanner.next();
        if (answers[0].equals("Skeleton")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println(response[0]);
        }
        System.out.println("You currently have " + x + " out of 5 points.");
        System.out.println(questions[1]);
        answers[1] = scanner.next();
        if (answers[1].equals("3")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println(response[1]);
        }
        System.out.println("You currently have " + x + " out of 5 points.");
        System.out.println(questions[2]);
        answers[2] = scanner.next();
        if (answers[2].equals("End")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println(response[2]);
        }
        System.out.println("You currently have " + x + " out of 5 points.");

        System.out.println(questions[3]);
        answers[3] = scanner.next();
        if (answers[3].equals("Gold")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println(response[3]);
        }
        System.out.println("You currently have " + x + " out of 5 points.");
        System.out.println(questions[4]);
        answers[4] = scanner.next();
        if (answers[4].equals("3")) {
            System.out.println("Correct!");
            x++;
        } else {
            System.out.println(response[4]);
        }
        System.out.println("Congratulations on finishing the trivia! Please wait while your score is calculated.");
        System.out.println("Your final score is: " + x + " out of 5 points.");
        if (x == 0) {
            System.out.println(score[0]);
        } else {
            if (x == 1) {
                System.out.println(score[1]);
            } else {
                if (x == 2) {
                    System.out.println(score[2]);
                } else {
                    if (x == 3) {
                        System.out.println(score[3]);
                    } else {
                        if (x == 4) {
                            System.out.println(score[4]);
                        } else {
                            if (x == 5) {
                                System.out.println(score[5]);
                            }
                        }
                    }
                }
            }
        }

            System.out.println("Thanks for playing! Would you like to play again? y/n");
            if (scanner.next().equals("y")) {
                continue;
            } else {
                System.out.println("See you next time!");
                break;
            }
        }
    }
}
