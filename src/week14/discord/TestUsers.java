package week14.discord;

import java.time.LocalDate;

public class TestUsers {
    public static void main(String[] args) {

        Admin admin = new Admin("Admin","James","james07", LocalDate.now());
        System.out.println("admin = " + admin);
        admin.joinDiscord("cydeo-37");
        admin.sendMessage();
        admin.createChannel("#code");
        System.out.println(admin.getName());



    }
}
