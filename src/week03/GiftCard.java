package week03;
/*`GiftCard
    declare and assign a gift card with 200.0
    declare and assign String variable items and assign ""
    buy 2 items.
    buy item 1 for x price and subtract from your gift card,
        also add item name to items
    buy item 2 for x price and subtract from your gift card,
        also add item name to items
    print the remaining balance of your gift card and all items`*/
public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200;
        String items = "";
        System.out.println("Buying sneakers for $88.50");
        giftCard -= 88.50;
        items = "sneakers";

        System.out.println("Buying computeer bag for $"+40.0);
        giftCard -=40;
        items += ", computer bag";

        System.out.println("Remaining balance = $"+giftCard);
        System.out.println("items = " + items);

    }

}
