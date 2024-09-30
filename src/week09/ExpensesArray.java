package week09;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExpensesArray {
    public static void main(String[] args) {
        double accountBalance = 255.43;

        double[] expenses = {5.0, 12.33, 55.0, 121.90, 76.34};
        //read some values from array
        System.out.println(expenses[0]);
        System.out.println(expenses[1]);

        //total number of transactions:
        System.out.println(expenses.length);
        int count = expenses.length;
        System.out.println("count = " + count);

        //print each expense using a loop
        int count1 = 1;
        for (double each : expenses) {
            System.out.println(count1);
            System.out.println(each + " ");
            count1++;
        }
        System.out.println("--- TRANSACTION HISTORY ---");

        for (double expens : expenses) {
            accountBalance -= expens;
            System.out.println("Transaction $"+expens+" - $"+accountBalance);
            System.out.println("accountBalance = " + accountBalance);
        }


    }
}
