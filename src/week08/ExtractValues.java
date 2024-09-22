package week08;

public class ExtractValues {
    public static void main(String[] args) {
        String str = "Address = 123 7th ave";
        int indexA = str.indexOf("=") + 2;
        System.out.println(str.substring(indexA));

        String etsy = "1,000+ results,with Ads";
        String count = etsy.substring(0, etsy.indexOf(" "));
        System.out.println("count = " + count);


    }
}
