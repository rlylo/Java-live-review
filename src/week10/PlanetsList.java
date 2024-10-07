package week10;

import java.util.*;

public class PlanetsList {
    public static void main(String[] args) {
        //Create an araylist and add planet names in solar system:
        ArrayList<String> planets = new ArrayList<>();
        planets.addAll(Arrays.asList("Mercury", "Venus", "Mars", "Earth", "Jupiter", "Saturn", "Neptune", "Pluto", "Uranus"));


        //print first and last planet name
        System.out.println("First = " + planets.get(0));
        System.out.println("Last = " + planets.get(planets.size() - 1));
        //Print each planet in uppercase:
        System.out.println(planets);
        System.out.println(planets.toString().toUpperCase());

        //print each planet in uppercase in separate lines;
        for (String each : planets) {
            System.out.println("Planet = " + each.toUpperCase());
        }

        //print each planet in reverse order using loop:
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
        for (int i = planets.size() - 1; i >= 0; i--) {
            System.out.println(planets.get(i));
        }

        //print 2 planet at the time
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++==");
        for (int i = 0; i < planets.size(); i += 2) {
            if (i== planets.size()-1){
                System.out.println(planets.get(i));
            }else {
                System.out.println(planets.get(i) + " - " + planets.get(i + 1));
            }

        }


    }
}
