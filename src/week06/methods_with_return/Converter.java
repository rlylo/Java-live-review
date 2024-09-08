package week06.methods_with_return;

public class Converter {
    public static void main(String[] args) {
        System.out.println(convertDollars("JPY", 200));
    }





    public static double convertDollars(String currency,double USDAmount){
        double convertedAmount = 0.0;
        switch (currency){
            case "EUR" -> convertedAmount = USDAmount * 0.93;
            case "JPY" -> convertedAmount = USDAmount * 124.29;
            case "TRY" -> convertedAmount = USDAmount * 27.01;
            case "KRW" -> convertedAmount = USDAmount * 1320.12;
            case "INR" -> convertedAmount = USDAmount * 83.17;
            default -> System.out.println("Conversion not available to "+currency);
        }
        return convertedAmount;
    }
}
