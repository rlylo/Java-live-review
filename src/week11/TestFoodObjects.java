package week11;

public class TestFoodObjects {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.name = "Tuna sandwich";
        food1.quantity = 3;
        food1.unitPrice = 7.99;
        food1.totalPrice = food1.quantity*food1.unitPrice;

        System.out.println(food1.name);
        System.out.println(food1.totalPrice);

        Food tacos = new Food("Tacos",3);

        Food apples = new Food("Apples",3,0.99);

        System.out.println(food1);
        System.out.println(tacos);
        System.out.println(apples);

        Food bananas = new Food("Bananas",5);
        bananas.unitPrice = 1.5;
        bananas.calculatePrice();
        System.out.println(bananas);

        buy(apples);






    }
    public static void buy(Food food){
        System.out.println("Buying -> "+food);
    }
}
