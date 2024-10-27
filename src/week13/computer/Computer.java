package week13.computer;

public class Computer {
    private String os;
    private int memory;

    public void use(){
        System.out.println("Using computer for general computer");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }
    public Computer() {
        this.os = "Unknown";
        this.memory = 0;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
