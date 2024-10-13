package week11;

import java.util.ArrayList;

public class ParisOlympics {
    static {
        System.out.println("------- Welcome to Olympic Games Paris 2024!");
    }
    public static ArrayList<MedalResult> allMedals = new ArrayList<>();

    public static void addAllMedals() {
        allMedals.add(new MedalResult("United States", 40, 44, 42));
        allMedals.add(new MedalResult("China", 40, 27, 24));
        allMedals.add(new MedalResult("Japan", 20, 12, 13));
        allMedals.add(new MedalResult("Australia", 18, 19, 16));
        allMedals.add(new MedalResult("France", 16, 26, 22));
        allMedals.add(new MedalResult("Netherlands", 15, 7, 12));
        allMedals.add(new MedalResult("Great Britain", 14, 22, 29));
        allMedals.add(new MedalResult("South Korea", 13, 9, 10));
        allMedals.add(new MedalResult("Italy", 12, 13, 15));
        allMedals.add(new MedalResult("Germany", 12, 13, 8));
        allMedals.add(new MedalResult("Canada", 9, 7, 11));
        allMedals.add(new MedalResult("New Zealand", 10, 7, 3));
        allMedals.add(new MedalResult("Brazil", 3, 7, 10));
        allMedals.add(new MedalResult("Hungary", 6, 7, 6));
        allMedals.add(new MedalResult("Spain", 5, 4, 9));
        allMedals.add(new MedalResult("Uzbekistan", 8, 2, 3));
        allMedals.add(new MedalResult("Sweden", 4, 4, 3));
        allMedals.add(new MedalResult("Kenya", 4, 2, 5));
        allMedals.add(new MedalResult("Norway", 4, 1, 3));
        allMedals.add(new MedalResult("Ireland", 4, 0, 3));
        allMedals.add(new MedalResult("Iran", 3, 6, 3));
        allMedals.add(new MedalResult("Ukraine", 3, 5, 4));
        allMedals.add(new MedalResult("Romania", 3, 4, 2));
        allMedals.add(new MedalResult("Georgia", 3, 3, 1));
        allMedals.add(new MedalResult("Belgium", 3, 1, 6));
        allMedals.add(new MedalResult("Bulgaria", 3, 1, 3));
        allMedals.add(new MedalResult("Serbia", 3, 1, 1));
        allMedals.add(new MedalResult("Czech Republic", 3, 0, 2));
        allMedals.add(new MedalResult("Denmark", 2, 2, 5));
        allMedals.add(new MedalResult("Azerbaijan", 2, 2, 3));
        allMedals.add(new MedalResult("Cuba", 2, 1, 6));
        allMedals.add(new MedalResult("Bahrain", 2, 1, 1));
        allMedals.add(new MedalResult("Slovenia", 2, 1, 0));
        allMedals.add(new MedalResult("Chinese Taipei", 2, 0, 5));
        allMedals.add(new MedalResult("Austria", 2, 0, 3));
        allMedals.add(new MedalResult("Hong Kong", 2, 0, 2));
        allMedals.add(new MedalResult("Philippines", 2, 0, 2));
        allMedals.add(new MedalResult("Algeria", 2, 0, 1));
        allMedals.add(new MedalResult("Indonesia", 2, 0, 1));
        allMedals.add(new MedalResult("Israel", 1, 5, 1));
        allMedals.add(new MedalResult("Poland", 1, 4, 5));
        allMedals.add(new MedalResult("Kazakhstan", 1, 3, 3));
        allMedals.add(new MedalResult("Jamaica", 1, 3, 2));
        allMedals.add(new MedalResult("South Africa", 1, 3, 2));
        allMedals.add(new MedalResult("Thailand", 1, 3, 2));
        allMedals.add(new MedalResult("Ethiopia", 1, 3, 0));
        allMedals.add(new MedalResult("Switzerland", 1, 2, 5));
        allMedals.add(new MedalResult("Ecuador", 1, 2, 2));
        allMedals.add(new MedalResult("Portugal", 1, 2, 1));
        allMedals.add(new MedalResult("Greece", 1, 1, 6));
        allMedals.add(new MedalResult("Argentina", 1, 1, 1));
        allMedals.add(new MedalResult("Egypt", 1, 1, 1));
        allMedals.add(new MedalResult("Tunisia", 1, 1, 1));
        allMedals.add(new MedalResult("Botswana", 1, 1, 0));
        allMedals.add(new MedalResult("Chile", 1, 1, 0));
        allMedals.add(new MedalResult("Saint Lucia", 1, 1, 0));
        allMedals.add(new MedalResult("Uganda", 1, 1, 0));
    }

    public static void searchByCountry(String country) {
        for (MedalResult allMedal : allMedals) {
            if (allMedal.country.equalsIgnoreCase(country)) {
                System.out.println(allMedal);
                break;
            }
        }
    }

    public static void searchByTotalMedals(int totalMedals) {
        for (MedalResult allMedal : allMedals) {
            if (allMedal.total>=totalMedals){
                System.out.println(allMedal);
            }
        }

    }
}
