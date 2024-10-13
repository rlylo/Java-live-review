package week11;

import java.util.ArrayList;

public class TestMedals {
    public static void main(String[] args) {
        System.out.println(MedalResult.event);
        System.out.println(MedalResult.totalMedalsOfOlympics);

        MedalResult usa = new MedalResult("United States", 40, 44, 42);
        System.out.println(usa.total);
        System.out.println(usa);

        MedalResult china = new MedalResult("China", 40, 27, 24);
        System.out.println(china);
        System.out.println("China total medals" + china.total);
        System.out.println(MedalResult.totalMedalsOfOlympics);

        System.out.println(usa.event);
        System.out.println(china.event);

        //Create arrayList of MedalResults
        ArrayList<MedalResult> medalResults = new ArrayList<>();
        medalResults.add(usa);
        medalResults.add(china);
        medalResults.add(new MedalResult("Japan",20,12,13));
        medalResults.add(new MedalResult("Australia",18,19,16));
        System.out.println(medalResults);
        System.out.println(medalResults.get(2));
        System.out.println(MedalResult.totalMedalsOfOlympics);
        System.out.println(china.total);

        //store Japan object into a variable
        MedalResult japan = medalResults.get(2);
        System.out.println(japan);
        System.out.println(MedalResult.totalMedalsOfOlympics);





    }
}
