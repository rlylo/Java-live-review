package week13.olympic_sport;

public class Soccer extends OlympicSport{

    public Soccer( int participants) {
        super("Soccer", participants);
    }
    public Soccer( String name,int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        super.compete();
        System.out.println("Playing Soccer");
    }
}
