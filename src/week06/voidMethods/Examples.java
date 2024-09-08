package week06.voidMethods;

public class Examples {
    public static void main(String[] args) {
        System.out.println("---Starting my day---");
        makeCoffe();
        exercise(5);
        studying("Java", 5);
        nap(80);
        dailyRoutine("Monday");

    }
    public static void dailyRoutine(String day){
        System.out.println("======="+day+"=======");
        switch (day){
            case "Monday","Tuesday","Wednesday"->{
                makeCoffe();
                studying("Java",1);
                exercise(20);
                studying("java modules",2);
                nap(22);
            }
            case "Thursday","Friday","Saturday"->{
                makeCoffe();
                exercise(50);
                studying("Soft skills",2);
                makeCoffe();
                nap(20);

            }
            case "Sunday"->{
                makeCoffe();
                exercise(30);
                studying("Java live review ",3);
                nap(45);
                studying("Soft skill live session",2);
            }
        }
    }

    public static void makeCoffe() {
        System.out.println("Making strong coffee.....");
    }

    public static void exercise(int minutes) {
        System.out.println("Exercising fo " + minutes + " minutes...");
    }

    public static void studying(String topic, int hours) {
        System.out.println("Studying " + topic + " for " + hours + " hours....");
    }

    public static void nap(int minutes) {
        if (minutes <= 10) {
            System.out.println("short nap for " + minutes + " minutes");
        } else if (minutes <= 30) {
            System.out.println("moderate nap for " + minutes + " minutes");
        } else if (minutes <= 60) {
            System.out.println("long nap for " + minutes + " minutes");
        } else {
            System.out.println("wake up and code java,i'ts been " + minutes + " minutes ");
        }
    }
}
