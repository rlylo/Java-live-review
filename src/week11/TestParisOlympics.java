package week11;

import static week11.ParisOlympics.searchByCountry;
import static java.lang.Math.*;
import static java.lang.Character.*;

public class TestParisOlympics {
    public static void main(String[] args) {
        System.out.println(ParisOlympics.allMedals.size());
        ParisOlympics.addAllMedals();
        System.out.println(ParisOlympics.allMedals.size());

        ParisOlympics.searchByCountry("France");
        ParisOlympics.searchByCountry("Brazil");

        System.out.println("_____________________________________-");
        ParisOlympics.searchByTotalMedals(50);
        System.out.println("_____________________________________-");
        searchByCountry("Ukraine");

        System.out.println(max(2, 4));
        System.out.println(isLetter('A'));

    }
}
