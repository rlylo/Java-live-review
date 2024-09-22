package week08;

public class ValidUrl {
    public static void main(String[] args) {
        String url = "www.hehe.com";
        String url1 = "";
        String url2 = "hehe.io";
        String url3 = "www.com";

        System.out.println(isValidUrl(url3));





    }
    public  static boolean isValidUrl(String url){
        if (url.isEmpty()){
            return false;
        }

        if (url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".org") || url.endsWith(".gov"))){
            return true;
        }
        return false;
    }
}
