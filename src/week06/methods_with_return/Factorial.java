package week06.methods_with_return;

public class Factorial {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Factorial from number "+number+" is = "+factorial(number));
    }





    public static int factorial(int number){
        int factorial = 1;
        for (int i = number; i != 0 ; i--) {
            factorial*=i;
        }
        return factorial;
    }
}
