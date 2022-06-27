package net.zedzimz;

import java.util.ArrayList;
import java.util.List;

public class TGV4QAH {
    public TGV4QAH() {

        String[] questions = new String[5];
        questions[0] = "Which undead mob shoots a bow and arrow?";
        questions[1] = "How many dimensions are there?";
        questions[2] = "What dimension are Endermen from?";
        questions[3] = "What type of metal do piglins like?";
        questions[4] = "How many diamonds do you need for a diamond pickaxe?";

        String[] answers = new String[5];
        answers[0] = "Skeleton";
        answers[1] = "3";
        answers[2] = "End";
        answers[3] = "Gold";
        answers[4] = "3";

        String[] hints = new String[5];
        hints[0] = "Hint!: He's made of bones!";
        hints[1] = "Hint!: A dimension is a place you need to go through a portal to get to!";
        hints[2] = "Hint!: It might be in his name!";
        hints[3] = "Hint!: It's shiny!";
        hints[4] = "Hint!: It's less than boots but more than a sword!";
    }
    public static void introLines() {
        System.out.println("Welcome to the Minecraft Trivia Game!");
        System.out.println("This Trivia Game will consist of 5 questions.");
        System.out.println("Good Luck!");
    }
    public static void printQuestion(String question) { System.out.println(question); }

    public static boolean isCorrectAnswer(String correctAnswer, String userAnswer) {
        return userAnswer.equals(correctAnswer);
    }
    public static void printCurrentPoints (int points) { System.out.println("Current points: " + points + "."); }
    public static void printYouHadCorrect() { System.out.println("Correct."); }
    public static void printYouHadIncorrect() { System.out.println("Incorrect."); }
    public static void printGoodbye() { System.out.println("Thanks for playing!"); }
    public static void printPlayAgain() { System.out.println("Play again? Y / N"); }
    public static int increasePointTotal(int points) { return points + 1; }
    public static void printCorrectAnswer(String question, String realAnswer) {
        System.out.println("For the question: '" + question + "', the correct answer was " + realAnswer + "."); }
    public static void printTotalPoints(int points) { System.out.println("You received a total of " + points + " Points!"); }
    public static void printFinishedTrivia() { System.out.println("Congratulations! You've finished the trivia!"); }
    public static void printHint(String hint) { System.out.println(hint); }
}
