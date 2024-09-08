package week03;

public class SecondToMinute {
    public static void main(String[] args) {
        int totalSeconds = 550;

        int minutes = totalSeconds/60;

        int remainingSeconds = totalSeconds%60;

        System.out.println("In "+totalSeconds+" seconds - there are "+minutes+" minutes and "+remainingSeconds+" seconds");




    }
}
