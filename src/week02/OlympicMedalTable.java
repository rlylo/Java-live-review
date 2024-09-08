package week02;

public class OlympicMedalTable {
    public static void main(String[] args) {
        int rank = 1;
        String country = "United States";
        String flag = "\uD83C\uDDFA\uD83C\uDDF8";
        int gold = 40;
        int silver = 44;
        int bronze = 42;
        int totalMedals = gold+silver+bronze;
        String goldMedalEmoji = "\uD83C\uDFC5";
        String silverMedalEmoji = "\uD83E\uDD48";
        String bronzeMedalEmoji = "\uD83E\uDD49";
        String trophyEmoji = "\uD83C\uDFC6";


        System.out.println("Rank    Team\t\t "+goldMedalEmoji+" "+silverMedalEmoji+" "+bronzeMedalEmoji+" "+trophyEmoji);
        System.out.println("  "+rank+" "+flag+country+"  "+gold+" "+silver+" "+bronze+" "+totalMedals);
        rank = 2;
        country = "China";
        flag = "\uD83C\uDDE8\uD83C\uDDF3";
        gold = 40;
        silver = 27;
        bronze = 24;
        totalMedals = gold+silver+bronze;

        System.out.println("  "+rank+" "+flag+country+"\t\t\t "+gold+" "+silver+" "+bronze+" "+totalMedals);
        rank = 3;
        country = "Japan";
        flag = "\uD83C\uDDEF\uD83C\uDDF5";
        gold = 20;
        silver = 12;
        bronze = 13;
        totalMedals = gold+silver+bronze;
        System.out.println("  "+rank+" "+flag+country+"\t\t\t "+gold+" "+silver+" "+bronze+" "+totalMedals);
        rank = 4;
        country = "Australia";
        flag = "\uD83C\uDDE6\uD83C\uDDEA";
        gold = 18;
        silver = 19;
        bronze = 16;
        totalMedals = gold+silver+bronze;
        System.out.println("  "+rank+" "+flag+country+"\t\t "+gold+" "+silver+" "+bronze+" "+totalMedals);



    }
}
