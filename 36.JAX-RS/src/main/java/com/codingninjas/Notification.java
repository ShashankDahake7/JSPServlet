package com.codingninjas;

public class Notification {
    private int id;
    private String sender;
    private String message;

    public Notification() {}

    public Notification(int id, String sender, String message) {
        this.id = id;
        this.sender = sender;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
