package week13.olympic_sport;

public class Surfing extends OlympicSport {


    public Surfing( int participants) {
        super("Surfing", participants);
    }

    @Override
    public void compete() {
        System.out.println("Surfing the waves");
    }
}
