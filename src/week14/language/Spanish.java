package week14.language;

public class Spanish implements Language{
    @Override
    public String hello() {
        return "Hola";
    }

    @Override
    public String bye() {
        return "Adios";
    }
}
