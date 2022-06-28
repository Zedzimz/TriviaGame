package net.zedzimz;

public class Trivia {
    public String question;
    public String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public boolean isCorrectAnswer(String input) {
        input = input.toLowerCase();
        return this.answer.toLowerCase().equals(input);
    }
    public void printQuestion() {
        System.out.print(question);
    }
    public void printAnswer(){
        System.out.println(answer);
    }
    private void printCorrect() {
        System.out.println("Correct!");
    }
    private void printIncorrect() {
        System.out.println("Incorrect!");
    }
    private void printCorrectAnswer() {
        System.out.println("The correct answer was " + this.answer);
    }
    public boolean validateAnswer(String input) {
        boolean valid = isCorrectAnswer(input);

        if(valid) {
            printCorrect();
        } else {
            printIncorrect();
            printCorrectAnswer();
        }
        return valid;
    }
}
