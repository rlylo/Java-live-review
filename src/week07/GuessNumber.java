package week07;
//hello from local
//abc from github
import java.util.Scanner;
import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        Scanner input = new Scanner(System.in);
        int number;
        int tries = 5;
        System.out.println("Guess the number:");
        do {
            number = input.nextInt();
            tries--;
            if (number > secretNumber) {
                System.out.println("Number too big");
            } else if (number < secretNumber) {
                System.out.println("Number too small");
            } else {
                System.out.println("Gongratulation , you won!");
            }
        } while (secretNumber != number && tries != 0);
        if (tries == 0 && secretNumber != number) {
            System.out.println("You lost");
        }
    }
}