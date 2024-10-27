package week13.access_modifiers.a;

public class App {
    public String name;
    protected double version;
    String platform;
    private double price;

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", platform='" + platform + '\'' +
                ", price=" + price +
                '}';
    }
}
