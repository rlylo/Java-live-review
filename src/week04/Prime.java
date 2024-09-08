package week04;

public class Prime {
    public static void main(String[] args) {
        double totalPrice = 35;
        boolean primeMember = false;
        if (totalPrice >= 35) {
            if (primeMember) {
                System.out.println("You are eligible for free sameday shipping");
            } else {
                System.out.println("You are eligible for free shipping");
            }
        } else {
            if (primeMember) {
                System.out.println("You are eligible for free shipping");
            } else {
                System.out.println("Shipping cost is $4.99");
                totalPrice += 4.99;

            }
        }
        System.out.println("Total price = $" + totalPrice);


    }
}
