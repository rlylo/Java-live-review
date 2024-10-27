package week13.computer;

public class Windows extends Computer {
    private String cpu;

    public Windows(int memory, String cpu) {
        super("Windows",memory);
        this.cpu = cpu;
    }

    @Override
    public void use() {
        System.out.println("Using Windows for coding and gaming");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "cpu='" + cpu + '\''+
                "os='" + getOs() + '\'' +
                ", memory=" + getMemory() +
                '}';
    }
}
