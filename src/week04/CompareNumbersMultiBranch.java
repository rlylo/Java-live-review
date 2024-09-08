package week04;

public class CompareNumbersMultiBranch {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greter");
        } else {
            System.out.println("Numbers are equal");
        }
        System.out.println("---------------------------------------");

        a = 10;
        b = 5;
        int c = 3;
        if (a > b && a > c) {
            System.out.println(a + " is biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is biggest number");
        } else {
            System.out.println(c + " is biggest number");
        }


    }
}
