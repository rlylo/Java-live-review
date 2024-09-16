package week07.custom_classes;

public class App {
    public String name;
    public double version;
    public boolean isFree;

    public void run(){
        System.out.println(name + " is running");
    }
    public void update(){
        System.out.println(name + " is updating");
        version += 1.1;
    }
    public void currentVersion(){
        System.out.println("Current version: "+version);
    }

    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                '}';
    }
}
