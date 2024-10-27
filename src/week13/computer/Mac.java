package week13.computer;

public class Mac extends Computer{

    private String ssd;

    public Mac(int memory, String ssd) {
        super("Mac", memory);
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "ssd='" + ssd + '\'' +
                "os='" + getOs() + '\'' +
                ", memory=" + getMemory()+
                '}';
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void use(){
        System.out.println("Using Mac for coding and video editing");
    }
}
