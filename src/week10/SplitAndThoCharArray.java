package week10;

import java.util.Arrays;

public class SplitAndThoCharArray {
    public static void main(String[] args) {
        String word = "Sunday";

        char[] allletters = word.toCharArray();

        System.out.println("count = " + allletters.length);
        System.out.println(Arrays.toString(allletters));

        for (char allletter : allletters) {
            System.out.println(allletter);
        }
        for (int i = allletters.length - 1; i >= 0; i--) {
            System.out.println(allletters[i]);
        }

        //Split
        String reports = "CF32;CF11;CF33;CF99";
        String[] allReports = reports.split(";");
        System.out.println(Arrays.toString(allReports));

        for (String report : allReports) {
            System.out.println("Testing - " + report);
            switch (report){
                case "CF32" ->{
                    //automation code to test that report
                }
            }

        }


    }
}
