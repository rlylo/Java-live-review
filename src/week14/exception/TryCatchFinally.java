package week14.exception;

import java.util.*;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter 2 numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println(num1/num2);
        }catch (InputMismatchException | ArithmeticException e){
            System.out.println("Exception caught");
            System.out.println(e.getStackTrace());
        }catch (Exception e){
            System.out.println("Some other exception");
            e.printStackTrace();
        }finally {
            System.out.println("Finnaly block");
        }
        scan.close();
        System.out.println("DONE");


    }
}
