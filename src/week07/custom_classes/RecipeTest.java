package week07.custom_classes;

public class RecipeTest {
    public static void main(String[] args) {
        Recipe pizza = new Recipe();
        pizza.name = "Pizza";
        pizza.ingredients = "Tomato,Cheese,Chicken,Mushroom";
        pizza.cost = 9.99;
        pizza.servingSize = 4;
        System.out.println(pizza);
        System.out.println("pizza.costPerPerson() = " + pizza.costPerPerson());
    }


}
