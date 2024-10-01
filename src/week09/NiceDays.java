package week09;

public class NiceDays {
    public static void main(String[] args) {
        int[] temps = {    66,        75,         78,        92,         72,         80,        90};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Nice weather days ->(70-80)
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] >= 70 && temps[i] <= 80) {
                System.out.println("Nice weather day " + temps[i] + " on " + days[i]);
            }
        }


    }
}
