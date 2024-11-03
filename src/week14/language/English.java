package week14.language;

public class English implements Language{

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String bye() {
        return "Bye";
    }
}
