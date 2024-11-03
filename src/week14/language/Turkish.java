package week14.language;

public class Turkish implements Language{
    @Override
    public String hello() {
        return "Merhaba";
    }

    @Override
    public String bye() {
        return "Gule gule";
    }
}
