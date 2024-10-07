package week10;

import java.text.DecimalFormat;
import java.util.*;

public class ProfitCalculator {
    public static void main(String[] args) {
        ArrayList<Double> lastYear = new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));
        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9, 11.57, 9.14, 10.42, 21.56, 14.16, 42.49, 54.5));
        ArrayList<Double> profits = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < lastYear.size(); i++) {
            profits.add(Double.parseDouble(df.format(lastYear.get(i) - currentYear.get(i))));

        }
        System.out.println("profits = " + profits);
        System.out.println("max profit = " + Collections.max(profits));
        System.out.println("max loss = " + Collections.min(profits));

        double minProfit = Collections.min(profits);
        int deptIndex = profits.indexOf(minProfit);
        System.out.println("Department "+deptIndex + " made the lowest profit");
        //avarage profit
        double sum = 0;
        for (Double profit : profits) {
            sum+=profit;
        }
        System.out.println("sum = " + df.format(sum));
        System.out.println("av profit = "+df.format(sum/profits.size()));



    }

}

