package week04;

public class IphonePrices {
    public static void main(String[] args) {
        String iphoneModel = "iPhone 15 Pro";

        switch (iphoneModel){
            case "iPhone 15 Pro" -> System.out.println(iphoneModel+ "From $999 or $41.62/mo. for 24 mo.*");
            case "iPhone 15" -> System.out.println(iphoneModel+ "From $799 or $33.29/mo. for 24 mo.*");
            case "iPhone 14" -> System.out.println(iphoneModel+ "From $699 or $29.12/mo. for 24 mo.*");
            case "iPhone 13" -> System.out.println(iphoneModel+ "From $599 or $24.95/mo. for 24 mo.*");
            default -> System.out.println(iphoneModel+ "We don't sell such model");
        }
    }
}
