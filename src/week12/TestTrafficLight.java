package week12;

public class TestTrafficLight {
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights("green");
        System.out.println(trafficLights.getColor());

        trafficLights.setColor("red");
        System.out.println(trafficLights.getColor());

//        trafficLights.setColor("A");
//        System.out.println(trafficLights.getColor());

        TrafficLights trafficLights1 = new TrafficLights("green");
        trafficLights1.action();

        trafficLights1.setColor("red");
        trafficLights1.action();

        trafficLights1.setColor("yeLlow");
        trafficLights1.action();



    }
}