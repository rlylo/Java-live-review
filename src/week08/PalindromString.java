package week08;

public class PalindromString {
    public static void main(String[] args) {
        String word = "d ad";
        System.out.println(isPalindrome(word));
        System.out.println("=================================");

        String initial = "civic".toLowerCase().replace(" ", "");

        StringBuilder stb = new StringBuilder(initial);
        if (stb.reverse().equals(stb)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

    }

    public static boolean isPalindrome(String word) {
        word = word.replace(" ", "");
        String word1 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            word1 += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(word1);

        if (word1.equalsIgnoreCase(word)) {
            return true;
        } else {
            return false;
        }
    }
}
