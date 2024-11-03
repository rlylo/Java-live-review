package week14.discord;

import java.time.LocalDate;
import java.util.Locale;

public abstract class DiscordUser {
    private String role;
    private String name;
    private String id;
    private LocalDate accountCreationDate;

    public DiscordUser(String role, String name, String id, LocalDate accountCreationDate) {
        this.role = role;
        this.name = name;
        this.id = id;
        this.accountCreationDate = accountCreationDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public abstract void sendMessage();

    public abstract void sendMessage(String name);

    public abstract void joinDiscord(String serverUrl);

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }


}
