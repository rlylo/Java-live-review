package week11;

public class Planet {
    public String name;
    public long distanceFromSun;

    public Planet(String name, long distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                '}';
    }
}
