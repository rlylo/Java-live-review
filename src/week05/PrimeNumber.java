package week05;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print("P"+i+" ");
            }else {
                System.out.print(i+" ");
            }
        }

    }
}
