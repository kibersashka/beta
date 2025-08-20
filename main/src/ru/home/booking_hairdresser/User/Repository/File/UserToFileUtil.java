package ru.home.booking_hairdresser.User.Repository.File;

import ru.home.booking_hairdresser.User.Entity.User;

public class UserToFileUtil {
    public static String userToLine(User user){
        return user.getUsername() + "|" + user.getDate() + "|" + user.getTime() + "|" + user.getNumber();
    }
    public static User userFromLine(String line){

        String[] userNames = line.split("\\|");

        return  new User(userNames[0], userNames[1], userNames[2], userNames[3]);
    }

}
