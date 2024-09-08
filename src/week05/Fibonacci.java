package week05;

public class Fibonacci {
    public static void main(String[] args) {
        int fib = 200;
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; sum <= fib; i++) {
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }


    }
}
