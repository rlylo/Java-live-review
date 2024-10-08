package week09;

public class DailySteps {
    public static void main(String[] args) {
        //array that stores number of steps for a week
        int[] dailySteps = new int[7];//0,0,0,0,0,0,0
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        dailySteps[0] = 4321;
        dailySteps[1] = 2345;
        dailySteps[2] = 7654;
        dailySteps[3] = 234;
        dailySteps[4] = 1768;
        dailySteps[5] = 12320;
        dailySteps[6] = 4678;
        int maxSteps = 0;
        int minSteps = dailySteps[0];
        int totalSteps = 0;
        int maxStepsIndex = 0;
        int minStepsIndex = 0;

        for (int i = 0; i < dailySteps.length; i++) {
            if (maxSteps < dailySteps[i]) {
                maxSteps = dailySteps[i];
                maxStepsIndex = i;
            }
            if (minSteps > dailySteps[i]) {
                minSteps = dailySteps[i];
                minStepsIndex = i;
            }
            totalSteps += dailySteps[i];
        }
        System.out.println("maxSteps was done on " + days[maxStepsIndex] + " you did " + maxSteps);
        System.out.println("minSteps = " + minSteps);
        System.out.println("avg steps per day = " + totalSteps / 7);


    }
}

