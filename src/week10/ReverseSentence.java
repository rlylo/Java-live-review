package week10;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Sunday October 6th 2024";
        String reversed = "";

        String[] allWords = sentence.split(" ");
        System.out.println("count of words " + allWords.length);

        //removing spaces then comparing the length
        int length = sentence.length() - sentence.replace(" ", "").length();
        System.out.println("count of words " + (length + 1));

        for (int i = allWords.length - 1; i >= 0; i--) {
            reversed+=allWords[i]+" ";
        }
        System.out.println(reversed.trim());


    }
}
