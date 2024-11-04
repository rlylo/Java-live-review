package week14.exception;

import week13.final_keyword.Parent;

public class Unchecked {
    public static void main(String[] args) {
        try {
            String word = "java";
            System.out.println(word.charAt(5));
            System.out.println(word.charAt(5));
        }catch (Exception e){
            System.out.println("Exception happened");
        }
        System.out.println("After char at");

        System.out.println("===================================================");
        try {


        String str=  "Python";
        System.out.println(str.toUpperCase());


        int[] nums = {4,54,23,5};
        System.out.println(nums[10]);

        }catch (NullPointerException e){
            System.out.println("Caught NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }catch (Throwable e){
            System.out.println("Caught some other exception");
        }
    }
}
