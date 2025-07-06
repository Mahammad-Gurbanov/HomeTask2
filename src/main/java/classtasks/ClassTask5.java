package classtasks;

import java.util.Random;
import java.util.Scanner;

public class ClassTask5 {
    public static void main(String[] args) {
        // Task 1:
//        for (int i = 1; i < 21; i++)
//            System.out.println(i);

        // Task 2:
//        for (int i = 2; i <= 50; i+=2)
//            System.out.println(i);

        // Task 3:
//        for (int i=0; i < 10; i++)
//            System.out.println("I'm learning Java");

        // Task 4 (I used both approaches):
//        Random random = new Random();
//        int randomNum = random.nextInt(0, 10);
//        System.out.println(randomNum);
//
//        int rndNum = (int) (Math.random() * 10);
//        System.out.println(rndNum);

        // Task 5:
//        Random random = new Random();
//        for (int i = 0; i < 10; i++){
//            int randomNum = random.nextInt(1, 101);
//            System.out.println(randomNum);
//        }

        // Task 6(Number guessing game) and Task 8(Track the number of
        // guesses in guessing game):

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int compGuess = random.nextInt(1, 11);
//        int remainingAttempts = 3;
//        boolean isGuessCorrect = false;
//        while (remainingAttempts > 0){
//            System.out.println("Number of remaining attempts: " + remainingAttempts);
//            System.out.print("Please type a number between 1 and 10: ");
//            int userGuess = scanner.nextInt();
//
//            if (userGuess == compGuess){
//                System.out.println("Congratulations! Your guess is correct!");
//                isGuessCorrect = true;
//                break;
//            } else if (userGuess < compGuess && remainingAttempts > 1) {
//                System.out.println("Please, guess a higher number.\n");
//            } else if (userGuess > compGuess && remainingAttempts > 1){
//                System.out.println("Please, guess a lower number.\n");
//            }
//            remainingAttempts--;
//
//        }
//        if (!isGuessCorrect) {
//            System.out.println("The secret number was " + compGuess);
//        }

        // Task 7:
//        for (int i = 2; i < 101; i++){
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++){
//                if (i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime)
//                System.out.println(i);
//        }

        // Task 8:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a word: ");
//        String word = scanner.nextLine();
//
//        int counter = 0;
//        for (int i = 0; i < word.length(); i++){
//            if (word.charAt(i) == 'a') {
//                counter++;
//            }
//        }
//        System.out.println("The number of characters 'a' in " + word + " is: " + counter);

    }
}
