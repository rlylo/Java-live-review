package week14.language;

public class Romanian implements Language {

    @Override
    public String hello() {
        return "Salut";
    }

    @Override
    public String bye() {
        return "La revedere";
    }
}
