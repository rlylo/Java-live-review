package week08;

public class StringIntro {
    public static void main(String[] args) {
        //creating string objects
        String str = "java string review";//String pool
        String str2 = new String("java string review");

        //==will check reference for objects. If both variables point to same object
        System.out.println(str == str2);
        //equals() will check if both strings contain same characters
        System.out.println(str.equals(str2));

        System.out.println("java".equalsIgnoreCase("Java"));

        //length of characters
        System.out.println(str.length());
        System.out.println("java".length());

        System.out.println("===========================================");
        int len = str.length();
        System.out.println("len = " + len);

        System.out.println("========================================");
        String str3 = "hi";
        System.out.println(str3.charAt(0));
        System.out.println("second char = " + str3.charAt(1));
        char secondLetter = str3.charAt(1);
        System.out.println(secondLetter);
        System.out.println("Hello".charAt(3));
        //get last character of any string: length + charAt
        String word = "string manipulation";
        System.out.println(word.length());
        System.out.println(word.charAt(word.length() - 1));

        System.out.println("java".toUpperCase());


    }
}
