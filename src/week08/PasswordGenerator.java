package week08;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        //length -> min8
        //lowercase and uppercase
        //at least 1 digit
        //at least 1 spectial character

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specail = "!@#$%^&*()_+=";

        //5 lowercase, 1 uppercase, 1 digit, 1 special

        String password = "";

        password += letters.charAt(4);
        password += letters.charAt(1);
        password += letters.charAt(5);
        password += letters.charAt(2);
        password += letters.charAt(8);
        password += letters.toUpperCase().charAt(3);
        password += digits.charAt(5);
        password += specail.charAt(2);
        System.out.println(password);

        System.out.println("====================================================");

        String randomPwd = "";
        for (int i = 1; i <= 5; i++) {
            randomPwd += letters.charAt(random.nextInt(letters.length()));
        }
        randomPwd += letters.toUpperCase().charAt(random.nextInt(letters.length()));
        randomPwd += digits.charAt(random.nextInt(digits.length()));
        randomPwd += specail.charAt(random.nextInt(specail.length()));
        System.out.println(randomPwd);


    }
}
