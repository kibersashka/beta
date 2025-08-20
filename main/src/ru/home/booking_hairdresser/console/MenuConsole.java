package ru.home.booking_hairdresser.console;

import java.util.Scanner;

public class MenuConsole {

    private final Scanner scanner;
    private final UserConsole userConsole;

    public MenuConsole(UserConsole userConsole) {
        this.scanner = new Scanner(System.in);
        this.userConsole = userConsole;
    }

    public void run() {
        while (true) {
            printMenu();
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    userConsole.signUp();
                    break;
                case "2":
                    System.exit(0);
            }
        }
    }

    private void printMenu() {
        System.out.println("Меню:");
        System.out.println("1. Записаться");
        System.out.println("2. Выход");
    }
}
