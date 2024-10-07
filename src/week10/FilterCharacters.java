package week10;

import java.util.Arrays;

public class FilterCharacters {
    public static void main(String[] args) {
        String str = "ab#c12 de3!2_12ac_java";
        String letter = "";
        String digits = "";
        String special = "";
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letter += each;
            } else {
                special += each;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

    }
}