package ru.home.booking_hairdresser.User.Entity;

import javax.xml.crypto.Data;

public class User {
    //фио дата
    private String Username;


    private String date;
    private String time;

    private String number;

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User(String username, String date, String time, String number) {
        Username = username;
        this.date = date;
        this.time = time;
        this.number = number;
    }
}
