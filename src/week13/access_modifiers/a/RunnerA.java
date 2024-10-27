package week13.access_modifiers.a;

public class RunnerA {
    public static void main(String[] args) {
        YouTube youTube = new YouTube();
        youTube.name = "YouTube";
        youTube.version = 43.5;
        youTube.platform = "iOS";
        youTube.isPremium = true;

        System.out.println("youTube = " + youTube);
        youTube.watchVideo();
    }
}
