package week07;

import java.util.Scanner;
//test
public class BreakTimer {
    public static void main(String[] args) throws InterruptedException {
        //create scanner object/instance
        Scanner input = new Scanner(System.in);

        System.out.println("How long is the break?");
        int minutes = input.nextInt();
        input.close();
        for (int mins = minutes-1; mins >= 0; mins--) {
            for (int seconds = 59; seconds >=0 ; seconds--) {
                //pause code for one second
                Thread.sleep(1000);
                System.out.println(mins+" minutes "+seconds+" seconds");
            }

        }
        System.out.println("Break is over , please comeback to class");
    }


}
