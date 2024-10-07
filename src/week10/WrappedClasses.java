package week10;

public class WrappedClasses {
    public static void main(String[] args) {

        System.out.println("Max integer = " + Integer.MAX_VALUE);
        System.out.println("Min integer = )" + Integer.MIN_VALUE);

        //convert String to primitive
        String price = "13.55";
        double dbPrice = Double.parseDouble(price);
        if (dbPrice > 0) {
            System.out.println("Price verification passed");
        } else {
            System.out.println("Price verification failed");
        }

        String temperature = "73";
        Integer temp = Integer.valueOf(temperature);
        System.out.println("temp = " + temp);
        //Autoboxing
        Integer myInt = 55;
        double d = 2.5;
        Double d2 = d;

        //Unboxing
        Integer int1 = Integer.valueOf(123);
        int int2 = int1;

        //Character class:
        char ch = 'a';
        System.out.println("isLetter = " + Character.isLetter(ch));
        System.out.println("isUpperCase = "+Character.isUpperCase(ch));




    }
}
