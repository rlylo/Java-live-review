package week14.discord;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestUsers {
    public static void main(String[] args) {

        Admin admin = new Admin("Admin","James","james07", LocalDate.now());
        System.out.println("admin = " + admin);
        admin.joinDiscord("cydeo-37");
        admin.sendMessage();
        admin.createChannel("#code");
        System.out.println(admin.getName());

        System.out.println("======================================================");
        Student student = new Student("student","Roman","romanl",LocalDate.of(2020,01,15));
        System.out.println("student = " + student);
        student.sendMessage();
        student.sendMessage("Roman");


    }
}
