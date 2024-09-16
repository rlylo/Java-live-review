package week07.custom_classes;

public class AppTest {
    public static void main(String[] args) {
        App newApp = new App();
        newApp.name = "Test app";
        newApp.version = 0.1;
        newApp.isFree = true;
        System.out.println(newApp);
        newApp.run();
        newApp.currentVersion();
        newApp.update();
        newApp.currentVersion();
        newApp.update();
        newApp.currentVersion();
        System.out.println(newApp);


    }
}
