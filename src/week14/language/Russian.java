package week14.language;

public class Russian implements Language{


    @Override
    public String hello() {
        return "Здравствуй";
    }

    @Override
    public String bye() {
        return "Пока";
    }
}
