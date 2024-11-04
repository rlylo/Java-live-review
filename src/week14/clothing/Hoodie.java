package week14.clothing;

public class Hoodie extends Clothes implements  HasHood,SportsWear{
    @Override
    public void wear() {
        System.out.println("Wearing a jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on jacket hood");
    }



}
