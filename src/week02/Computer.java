package week02;

public class Computer {
    public static void main(String[] args) {
        String brand = "Lenovo";
        String processor = "Intel i7";
        int ram = 32;
        String storage = "512 GB";
        double price = 999.99;
        byte usb = 8;
        boolean hasBluetooth = true;
        boolean hasWifiCard = true;

        System.out.println("My computer brand is: "+brand);
        System.out.println("It has "+processor+" processor");
        //it has 8 GB of RAM memory

        System.out.println("It has "+ ram+" memory");
        System.out.println(storage+" SSD Storage");
        System.out.println("$"+ price);
        System.out.println("It has "+usb+" USB slots and bluetooth is "+hasBluetooth+" and wifi has "+hasWifiCard);




    }
}
