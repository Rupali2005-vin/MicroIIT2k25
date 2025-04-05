import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!\n");

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("A. Mumbai");
        System.out.println("B. New Delhi");
        System.out.println("C. Kolkata");
        System.out.println("D. Chennai");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("B")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Who developed Java?");
        System.out.println("A. James Gosling");
        System.out.println("B. Dennis Ritchie");
        System.out.println("C. Bjarne Stroustrup");
        System.out.println("D. Guido van Rossum");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("A")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which planet is known as the Red Planet?");
        System.out.println("A. Earth");
        System.out.println("B. Mars");
        System.out.println("C. Venus");
        System.out.println("D. Jupiter");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("B")) {
            score++;
        }

        // Final Score
        System.out.println("\nQuiz Over!");
        System.out.println("Your score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent! You're a quiz master!");
        } else if (score == 2) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}