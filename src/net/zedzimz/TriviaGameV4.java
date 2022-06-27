package net.zedzimz;

import java.util.Scanner;

public class TriviaGameV4 extends TGV4QAH {
    public static void main(String[] args) {
        while(true) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        introLines();
        for(int i = 0; i < questions.length; i++) { // This loops all code within its brackets until 'i' is no longer less than the amount of questions in the string 'questions'
            printQuestion(questions[i]); // Prints questions from Array questions
            String userAnswer = scanner.next(); // Requests user answer input for question
            if(isCorrectAnswer(userAnswer, answers[i])) { // Compares if the user inputted answer is equal to the actual answer
                printYouHadCorrect(); // Message is printed if answer is correct
                points = increasePointTotal(points); // Points are increased if answer is correct
                printCurrentPoints(points); // Current amount of points is printed
            } else {
                printYouHadIncorrect(); // Message is printed if incorrect
                printHint(hints[i]); // Hint is given if incorrect
                printCurrentPoints(points); // Current amount of points is printed
            }
        }
        printFinishedTrivia(); // Finished trivia message is printed
        printTotalPoints(points); // Total amount of points is printed
        printPlayAgain(); // Request to play again is printed
        if (scanner.next().equals("y")) { // Loop created so if player wants to play again they input 'y', their points are reset, and the loop begins from the beginning
            points = 0;
            continue;
        } else {
            System.out.println("Would you like to see all answers? Y / N"); { // Request for user to see correct answers if they want.
                if(scanner.next().equals("y")) {
                    for(int x = 0; x < hints.length; x++) {
                        printCorrectAnswer(questions[x], answers[x]); // Prints all questions and their correct answers in sequence
                    }
                }
            }
            printGoodbye(); // Goodbye message is printed and the program terminates
            break;
        }
    }
}

    }
}