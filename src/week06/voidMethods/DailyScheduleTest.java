package week06.voidMethods;

public class DailyScheduleTest {
    public static void main(String[] args) {
        Examples.dailyRoutine("Sunday");
        System.out.println(MethodsWithLoops.printInRange('!', '8'));
        for (int i = 1; i <=10 ; i++) {
            MethodsWithLoops.multiplicationTable(i);
            System.out.println();
        }
    }
}
