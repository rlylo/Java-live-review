package week10;

public class GoogleSearch {
    public static void main(String[] args) {
        String searchResult = "About 40,000,000 result (0.39 seconds)";
        String[] resultParts = searchResult.split(" ");

        String numberOfResults = resultParts[1];

        long count = Long.parseLong(numberOfResults.replace(",", ""));
        System.out.println("count = " + count);

        if (count < 100_000_000) {
            System.out.println("Good search");
        } else {
            System.out.println("Narrow your search, too many result");
        }
        String numberOfSeconds = resultParts[3].replace("(", "");
        System.out.println("numberOfSeconds = " + numberOfSeconds);
        if (Double.parseDouble(numberOfSeconds) < 0.85) {
            System.out.println("Result speed check passed");
        } else {
            System.out.println("Result speed check failed");
        }
    }


}
