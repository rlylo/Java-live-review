package week14.discord;

import java.time.LocalDate;

public class Admin extends DiscordUser {


    public Admin(String role, String name, String id, LocalDate accountCreationDate) {
        super(role, name, id, accountCreationDate);
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement to @everyone");
    }
    @Override
    public void sendMessage(String name) {
        System.out.println(name + "is sending announcement to @everyone");
    }

    @Override
    public void joinDiscord(String serverUrl) {
        System.out.println("Joining as Admin to " + serverUrl);
    }

    public void createChannel(String channelName) {
        System.out.println("Creating channel - " + channelName);
    }
}
