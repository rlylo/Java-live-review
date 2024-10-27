package week13.olympic_sport;

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


    }
}
