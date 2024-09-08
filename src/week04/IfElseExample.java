package week04;

public class IfElseExample {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry){
            System.out.println("Let's get some snack");
            System.out.println("Keep coding Java");
        }else {
            System.out.println("Not hungry , lets keep coding Java");
        }
        System.out.println("=========================================================");
        int year = 2020;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown){
            System.out.println("Stay home");
            System.out.println("Wear mask");
            System.out.println("Keep coding Java");
        }else {
            System.out.println("Meet friends and family");
            System.out.println("Keep coding Java");
        }





    }



}
