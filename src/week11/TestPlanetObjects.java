package week11;

import week10.PlanetsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPlanetObjects {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth",149_600_000L);
        System.out.println(earth);

        Planet mercury = new Planet("Mercury",57_900_000L);
        System.out.println(mercury);

        Planet[] planetsArr = {earth,mercury,new Planet("Venus",108_200_000L)};
        System.out.println(Arrays.toString(planetsArr));
        System.out.println(planetsArr.length);
        System.out.println(planetsArr[0]);
        System.out.println(planetsArr[1].name);



        //ArrayList of Planet objects:
        ArrayList<Planet> planetsList = new ArrayList<>();
        planetsList.add(new Planet("Mercury", 57_900_000L));
        planetsList.add(new Planet("Venus", 108_200_000L));
        planetsList.add(new Planet("Earth", 149_600_000L));
        planetsList.add(new Planet("Mars", 227_900_000L));
        planetsList.add(new Planet("Jupiter", 778_500_000L));
        planetsList.add(new Planet("Saturn", 1_430_000_000L));
        planetsList.add(new Planet("Uranus", 2_870_000_000L));
        planetsList.add(new Planet("Neptune", 4_500_000_000L));

        //print total number of planets
        System.out.println("Total number of planets = "+planetsList.size());

        //print first and last planet names
        System.out.println("First = "+ planetsList.get(0).name+"\nLast = "+planetsList.get(planetsList.size()-1).name);

        planetsList.forEach(each-> System.out.print(each.name+" "));
        System.out.println();

        //find the planet closest to sun:
        Collections.shuffle(planetsList);
        long min = planetsList.get(0).distanceFromSun;

        String closestToSun  = "";
        for (Planet planet : planetsList) {
            if (planet.distanceFromSun<=min){
                min = planet.distanceFromSun;
                closestToSun = planet.name;
            }
        }
        System.out.println("closestToSun = " + closestToSun);



    }
}
