package week11;

public class TestParisOlympics {
    public static void main(String[] args) {
        System.out.println(ParisOlympics.allMedals.size());
        ParisOlympics.addAllMedals();
        System.out.println(ParisOlympics.allMedals.size());

        ParisOlympics.searchByCountry("France");
        ParisOlympics.searchByCountry("Brazil");

        System.out.println("_____________________________________-");
        ParisOlympics.searchByTotalMedals(50);
    }
}
