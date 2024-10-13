package week11;

import java.util.ArrayList;

public class TestFoodsList {
    public static void main(String[] args) {
        //ArrayList of Food objects
        ArrayList<Food> foodsList = new ArrayList<>();
        foodsList.add(new Food("Apple", 10, 1.50));
        foodsList.add(new Food("Banana", 20, 0.75));
        foodsList.add(new Food("Carrot", 15, 0.60));
        foodsList.add(new Food("Donut", 5, 2.25));
        foodsList.add(new Food("Egg", 30, 0.10));
        foodsList.add(new Food("Fish", 8, 3.99));
        foodsList.add(new Food("avocado", 12, 2.50));
        foodsList.add(new Food("Hamburger", 7, 5.00));
        foodsList.add(new Food("Ice Cream", 4, 4.75));
        foodsList.add(new Food("Juice", 9, 2.99));

        System.out.println("size = " + foodsList.size());
        System.out.println(foodsList);

        for (Food food : foodsList) {
            System.out.println(food);
        }

        System.out.println("---Foods that starts with A---");
        for (Food food : foodsList) {
            if (food.name.toUpperCase().startsWith("A")) {
                System.out.println(food);
            }
        }
        System.out.println("---Foods with totalPrice over 20---");
        for (Food food : foodsList) {
            if (food.totalPrice >= 20.0) {
                System.out.println(food.name + " - " + food.totalPrice);
            }
        }

    }

}
