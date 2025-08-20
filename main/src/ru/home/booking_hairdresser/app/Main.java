package ru.home.booking_hairdresser.app;

import ru.home.booking_hairdresser.console.MenuConsole;
import ru.home.booking_hairdresser.console.UserConsole;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UserRepositoryFile userRepositoryFile = new UserRepositoryFile("test.txt");
        UserService userService = new UserService(userRepositoryFile);
        UserConsole userConsole = new UserConsole(userService);
        MenuConsole menu = new MenuConsole(userConsole);
        menu.run();
    }
}
