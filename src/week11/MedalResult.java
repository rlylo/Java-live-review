package week11;

public class MedalResult {
    public static String event = "Olympic Games Paris 2024";
    public static int totalMedalsOfOlympics;


    public String country;
    public int gold;
    public int silver;
    public int bronze;
    public int total;

    public MedalResult(String country, int gold, int silver, int bronze) {
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.total = gold + silver + bronze;
        totalMedalsOfOlympics += total;
    }

    public String toString() {
        return "MedalResult{" +
                "country='" + country + '\'' +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", total=" + total +
                '}';
    }
}
