package model;

import java.util.UUID;

public abstract class Person {
    private UUID id;
    private String username;
    private String password;

    public Person(String username,String password){
        UUID uuid = UUID.randomUUID();
        this.setId(uuid);
        this.setUsername(username);
        this.setPassword(password);
    }

    public UUID getIdPerson() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordPerson() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
