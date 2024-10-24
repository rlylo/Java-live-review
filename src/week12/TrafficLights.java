package week12;

public class TrafficLights {

    private String color;

    public String getColor() {
        return color;
    }

    public TrafficLights(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        color = color.toLowerCase();

        if (color.equals("green") || color.equals("yellow") || color.equals("red")) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
    }

    public void action() {
        switch (color) {
            case "green" -> System.out.println("Go");
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Caution , prepare to stop");
        }

    }
}
