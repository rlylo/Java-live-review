package week13.computer;

public class TestComputers {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer("Windows",200);
        System.out.println(comp1);
        System.out.println(comp2);

        comp1.setOs("mcOS");
        comp1.setMemory(100);
        System.out.println(comp1);
        comp1.use();

        System.out.println("===================================================");

        Windows windows = new Windows(36,"Intel12");
        System.out.println("windows = " + windows);
        windows.use();

        System.out.println(windows.getCpu());

        Mac mac = new Mac(18,"1TB");
        mac.use();
        System.out.println("mac = " + mac);


    }
}
