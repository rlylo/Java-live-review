package week06.voidMethods;

public class MethodsWithLoops {
    /*
    Print in range
    printInRange(1,5);1 2 3 4 5
    printInRange(100,103)
     */
    public static void main(String[] args) {
        System.out.println(printInRange(1, 7));
        System.out.println(printInRange('A', 'G'));
    }

    public static String printInRange(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += i + " ";

        }
        return result;
    }

    public static String printInRange(char start, char end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += (char) i + " ";

        }
        return result;
    }

    public static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);

        }

    }


}
