package week13.olympic_sport;

public class Track extends OlympicSport{

    //
    public Track( int participants) {
        super("Track", participants);
    }

    @Override
    public void compete() {
        super.compete();
        System.out.println("Running, Jumping in Track");
    }
}
