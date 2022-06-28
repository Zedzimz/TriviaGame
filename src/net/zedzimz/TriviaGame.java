package net.zedzimz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TriviaGame {
    public List<Trivia> trivias;
    private Scanner scanner = new Scanner(System.in);
    private int score = 0;
    private int maxScore;

    public void startGame() {
        populateTriviaList();
        gameLoop();
    }
    public void gameLoop() {
        while (true) {
            for(Trivia trivia : trivias) {
                trivia.printQuestion();
                if(trivia.validateAnswer(getUserInput())) {
                    score++;
                }
                printScore();
            }
            if(shouldEndGame()) {
                break;
            }
        }
        printTotalScore();
    }
    private void printTotalScore() {
        System.out.println("Your total score is " + score);
    }
    public boolean shouldEndGame() {
        askForAbort();
        return endGame(getUserInput());
    }
    private String getUserInput() {
        return scanner.nextLine();
    }
    private boolean endGame(String input) {
        return !input.toLowerCase().equals("y");
    }
    private void askForAbort() {
        System.out.println("Would you like to play again? Y/N");
    }
    private void printScore() {
        System.out.println("Your score is " + score);
    }
    private void resetScore() {
        score = 0;
    }
    private void populateTriviaList() {
        trivias = new ArrayList<>();

        trivias.add(new Trivia("What mob shoots a bow and arrow?", "Skeleton", "He's made of bones!"));
        trivias.add(new Trivia("How many diamonds do you need for a diamond sword?", "2", "It's more than a shovel but less than a pickaxe!"));
        trivias.add(new Trivia("How many dimensions are there?", "3", "A dimension is a place that requires a portal to get to!"));
        trivias.add(new Trivia("What metal do piglins love?", "Gold", "It's shiny!"));
        trivias.add(new Trivia("Where are endermen from?", "End", "Maybe it's in his name?"));

        maxScore = trivias.size();
        Collections.shuffle(trivias);
    }
}