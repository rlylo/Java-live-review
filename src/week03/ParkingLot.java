package week03;

public class ParkingLot {
    public static void main(String[] args) {
        System.out.println("Welcome to ABT!");
        int cars = 0;
        int parkingSpots;
        System.out.println("1 car just parked");
        cars++;
        parkingSpots = 100 - cars;

        System.out.println("Cars in the parking lot "+cars);
        System.out.println(parkingSpots+" available parking spots");
        cars+=5;
        parkingSpots = 100 - cars;
        System.out.println("Cars in the parking lot "+cars);
        System.out.println(parkingSpots+" available parking spots");


    }
}
