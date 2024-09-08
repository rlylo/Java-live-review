package week04;

public class CharCaseChecker {
    public static void main(String[] args) {
        char character = '2';
        if (character >= 'A' && character <= 'Z') {
            System.out.println("Uppercase " + character);
        } else if (character >= 'a' && character <= 'Z') {
            System.out.println("Lowercase " + character);
        } else {
            System.out.println("It is not a letter " + character);
        }


    }
}
