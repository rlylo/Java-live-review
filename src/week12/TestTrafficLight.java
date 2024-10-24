package week12;

public class TestTrafficLight {
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights("green");
        System.out.println(trafficLights.getColor());

        trafficLights.setColor("red");
        System.out.println(trafficLights.getColor());

        trafficLights.setColor("A");
        System.out.println(trafficLights.getColor());



    }
}
