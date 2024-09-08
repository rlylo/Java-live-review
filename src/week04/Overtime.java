package week04;

public class Overtime {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int hours = 40;
        int salary = 0;
        int overtime = (hours - 40) * 55;
        if (hours <= 40) {
            salary = hours * hourlyRate;
            System.out.println("Your weekly salary pay = $" + salary);
        } else {
            salary = hours * hourlyRate + overtime;
            System.out.println("Your weekly salary pay = $" + salary + " (including $" + overtime + " overtime)");

        }
        double tax = salary * 0.25;
        System.out.println("Tax = $" + tax);
        System.out.println("Net pay is $" + (salary - tax));


    }

}
