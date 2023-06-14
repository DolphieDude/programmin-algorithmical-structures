package cherevatyi.andrii;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        int max = 1000, min = 1;
        System.out.println("Welcome! Let me try to guess your number");
        System.out.println("If my guess is right input 1\nIf your number is smaller input 2\nIf your number is bigger input 3");
        Scanner input = new Scanner(System.in);
        boolean guessed = false;
        int guess, userReply, attempts = 0;
        do {
            guess = getRandomNumberInRange(max, min);
            System.out.println("My guess is " + guess);
            System.out.print("Reply: ");
            userReply = input.nextInt();
            if (userReply == 2) max = guess - 1;
            else if (userReply == 3) min = guess + 1;
            attempts++;
        } while (!(userReply == 1));
        input.close();
        System.out.println("Amount of attempts: " + attempts);
    }

    static int getRandomNumberInRange(int max, int min) { return ((int) (Math.random() * (max - min + 1)) + min); }
}
