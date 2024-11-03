package week14.discord;

import java.time.LocalDate;

public class Student extends DiscordUser{
    public Student(String role, String name, String id, LocalDate accountCreationDate) {
        super(role, name, id, accountCreationDate);
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message in #class-chat");
    }
    @Override
    public void sendMessage(String name) {
        System.out.println(name+ " is sending message in #class-chat");
    }

    @Override
    public void joinDiscord(String serverUrl) {
        System.out.println("Joining as student to "+serverUrl);
    }


}
