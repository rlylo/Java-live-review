package week15;

public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 13;

        if (age<18){
            throw new RuntimeException("Cannot buy tobacco");
        }else {
            System.out.println("Allowed to buy tobacco");
        }


        double balance = 255.66;
        double price = 300.00;

        balance-=price;
        if (balance<0){
            throw new NegativeBalanceException("Balance is less than 0");
        }
    }
}
