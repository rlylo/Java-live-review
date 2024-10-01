package week09;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        //Find and print all the first and last characters
        for (String country : countries) {
            System.out.println(country.charAt(0) + "" + country.charAt(country.length() - 1));
        }
        //Find the largest and smaller countries based on the length of their names
        String largest = countries[0];
        String smallest = countries[0];
        for (String country : countries) {
            if (country.length() > largest.length()) {
                largest = country;
            }
            if (country.length()< smallest.length()){
                smallest = country;
            }
            if (country.toLowerCase().startsWith("c")){
                System.out.print(country+" ");
            }


        }
        System.out.println();
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
        for (String country : countries) {
            if (country.endsWith("s")){
                System.out.print(country+" ");
            }
        }



    }


}
