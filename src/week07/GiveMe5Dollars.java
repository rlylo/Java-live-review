package week07;

import java.util.Scanner;
//simple change here and there

public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars;
        do {
            System.out.println("Please enter 5 dollars");
            dollars = input.nextInt();
        } while (dollars != 5);
        input.close();

        System.out.println("Thank you for $5");


    }
}
