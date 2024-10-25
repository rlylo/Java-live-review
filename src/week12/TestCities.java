package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestCities {
    public static void main(String[] args) throws FileNotFoundException {
        City city = new City("Nashville-Davidson", 16.2, 634464, "Tennessee");
        System.out.println(city);


        String str = "Mesa,13.5,457587,Arizona";
        String[] cityArr = str.split(",");
        City mesa = new City(cityArr[0], Double.parseDouble(cityArr[1]), Integer.parseInt(cityArr[2]), cityArr[3]);

        File file = new File("src/week12/cities.txt");
        Scanner scan = new Scanner(file);
        ArrayList<City> cities = new ArrayList<>();

        //loop and read line by line
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArr = line.split(",");
            City eachCity = new City(lineArr[0], Double.parseDouble(lineArr[1]), Integer.parseInt(lineArr[2]), lineArr[3]);
            cities.add(eachCity);
        }
        System.out.println("count = "+cities.size());
        for (City city1 : cities) {
            if (city1.getState().equals("California")){
                System.out.println(city1);
            }
        }


    }
}
