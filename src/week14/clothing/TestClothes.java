package week14.clothing;

public class TestClothes {
    public static void main(String[] args) {

        Hoodie hoodie = new Hoodie();
        hoodie.putOnHood();
        hoodie.wear();
        System.out.println("hoodie instanceof SportsWear = " + (hoodie instanceof SportsWear));


        //Polymorphism
        Clothes tshirt = new TShirt();
        tshirt.wear();
        System.out.println(tshirt instanceof SportsWear);

        Clothes jacket = new Jacket();
        jacket.wear();
        ((Jacket)jacket).putOnHood();

    }
}
