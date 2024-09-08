package week03;
/*TipOptions [variables, operators, concatenation]

    Declare and assign the following variables
        String food (list of all the food items),
        double item1Price, item2Price, item3Price
        double total (amount you owe) includes all item prices

    show the receipt of all the items and total cost of the bill
    then display 3 tip options and how much they would cost.
    show the tip for 10%, 18% and 25%*/
public class TipOptions {
    public static void main(String[] args) {
        String food = "Burger, Fries, Drink";
        double item1Price = 7.50;
        double item2Price = 3.0;
        double item3Price = 2.50;

        double total = item1Price+item2Price+item3Price;

        System.out.println("Your order: "+food);
        System.out.println("Total price = $"+total);

        System.out.println("Select one of tip options:");
        System.out.println("10% = $"+total * 0.10);
        System.out.println("18% = $"+total * 0.18);
        System.out.println("25% = $"+total * 0.25);
    }
}
