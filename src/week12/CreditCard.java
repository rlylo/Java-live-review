package week12;

public class CreditCard {

    private String type;
    private long cardNumber;
    private String name;
    private String expirationDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        switch (type.toLowerCase()) {
            case "visa", "mastercard", "discover", "amex" -> this.type = type;
            default -> {
                System.out.println("invalid card type " + type);
                System.exit(1);
            }
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if (type.equalsIgnoreCase("visa") || type.equalsIgnoreCase("discover") || type.equalsIgnoreCase("mastercard")
                && (String.valueOf(cardNumber).length() == 16)) {
            this.cardNumber = cardNumber;
        } else if (type.equalsIgnoreCase("amex") && (String.valueOf(cardNumber).length() == 15)) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number " + cardNumber + " for " + type);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("Invalid name - "+name);
        }
        this.name = name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CreditCard(String type, long cardNumber, String name, String expirationDate) {
        setType(type);
        setCardNumber(cardNumber);
        setName(name);
        setExpirationDate(expirationDate);
    }

    public String toString() {
        return "CreditCard{" +
                "type='" + type + '\'' +
                ", cardNumber=" + cardNumber +
                ", name='" + name + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
