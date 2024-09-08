package week04;

public class OxygenLevel {
    public static void main(String[] args) {
        int oxygenLevel = 40;
        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you at 50%");
        } else {
            System.out.println("Low level , head back asap");
        }


    }
}
