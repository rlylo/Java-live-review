package week13.olympic_sport;

import java.util.Scanner;

public class SportsRunner {
    public static void main(String[] args) {
        OlympicSport olympicSport = new OlympicSport("Wresling",100);
        System.out.println(olympicSport);
        System.out.println(OlympicSport.YEAR_OF_FIRST_OLYMPICS);

        Surfing surfing = new Surfing(65);
        System.out.println(surfing);
        System.out.println(Surfing.YEAR_OF_FIRST_OLYMPICS);
        olympicSport.compete();
        surfing.compete();

        Track track = new Track(145);
        System.out.println(track);
        track.compete();
        System.out.println(Track.YEAR_OF_FIRST_OLYMPICS);
        System.out.println(track.YEAR_OF_FIRST_OLYMPICS);

        Soccer soccer = new Soccer(133);
        Soccer football = new Soccer("Football",132);

        System.out.println("soccer = " + soccer);
        System.out.println("football = " + football);
        soccer.compete();


    }
}
