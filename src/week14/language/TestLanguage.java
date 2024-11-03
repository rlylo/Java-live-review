package week14.language;

public class TestLanguage {
    public static void main(String[] args) {
        //Not polymorphism
        English english = new English();
        Spanish spanish = new Spanish();
        Turkish turkish = new Turkish();

        //polymorphism:
        Language romanian = new Romanian();
        Language language = new Russian();
        language = new English();

        System.out.println(english.hello());
        System.out.println(spanish.hello());
        System.out.println(turkish.hello());
        System.out.println(romanian.hello());
        System.out.println(language.hello());
        System.out.println(new Russian().hello());

        System.out.println(spanish.hello()+", "+romanian.hello());
    }
}