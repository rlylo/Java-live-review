package week10;

import java.util.*;

/*
calculateSales(300000, 200000, 250000, 1000000, 1500000) -> true
calculateSales(3000000, 5000, 250000, 1000000, 3500000) -> false

The company had a goal to earn a total of 5,000,000 in sales this year.
    Return true if the company reached their goal and false if they did not.
 */
public class CalculateSales {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(300000.0,300000.0, 200000.0, 250000.0, 1000000.0, 1500000.0));
        System.out.println(calculateSales(list));
    }


    public static boolean calculateSales(ArrayList<Double> sales) {
        double sum = 0;
        for (Double sale : sales) {
            sum += sale;
        }
        System.out.println(sum);
        return sum >= 5_000_000;
    }

}
