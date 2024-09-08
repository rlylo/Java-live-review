package week04;

public class Overdraft {
    public static void main(String[] args) {
        double balance = 2;
        double price = 12.99;
        balance-=price;

        if (balance<0){
            balance -= 35;
            System.out.println("Your balance is negative, $35 overdraft fee applied");
        }
        System.out.println("balance = " + balance);




    }
}
