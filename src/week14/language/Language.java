package week14.language;

public interface Language {
    ///variables -> only public static final
    String DEFAULT_ENCODING = "ETF-8";

    //abstract methods -> public only
    public abstract String hello();
    String bye();

    //public static method:
    static void description(){
        System.out.println("Languages are used for communication");
    }

    //public default method:
    default void translate(String from , String to){
        System.out.println("Translating from "+from+" to "+to);
    }

    private void read(){
        System.out.println("Reading");
    }
//test


}
