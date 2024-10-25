package week12;

public class TestCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("Visa", 1234567812345678L, "Mike Smith", "10/25");
        System.out.println(card1);

        card1.setExpirationDate("11/25");
        System.out.println(card1);

        CreditCard card2 = new CreditCard("Amex", 123123121232222L, "Mike Smith", "10/22");
        System.out.println(card2);

        card2.setType("visa");
        System.out.println(maskCreditCard(card2));
        System.out.println(card2);


    }

    //return encrypted card number
    public static String maskCreditCard(CreditCard card) {
        String cardNumber = String.valueOf(card.getCardNumber());
        // return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        return "****-****-****-" + card.getCardNumber() % 10000;
    }
}
