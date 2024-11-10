package week15;

public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 13;

        if (age<18){
            throw new RuntimeException("Cannot buy tobacco");
        }else {
            System.out.println("Allowed to buy tobacco");
        }
    }
}
