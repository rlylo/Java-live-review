package week07;

import java.util.Scanner;
//test
//hehe

public class CreateShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String items = "";
        String answer = "";
        do {
            System.out.println("Enter item name:");
            String item = input.nextLine();
            items += item + ", ";
            System.out.println("Would you like to add more items");
            answer = input.next();
            input.nextLine();
        } while (answer.equals("yes"));

        System.out.println("All items = " + items);

    }
}
