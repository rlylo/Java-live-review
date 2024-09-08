package week05;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (j * i)+"\t");


            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + (j * i)+"\t");


            }
            System.out.println();
        }


    }
}
