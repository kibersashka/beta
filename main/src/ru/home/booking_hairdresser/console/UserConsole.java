package ru.home.booking_hairdresser.console;

import ru.home.booking_hairdresser.User.Repository.File.Exception.BookedTimeException;
import ru.home.booking_hairdresser.User.Service.UserService;

import java.util.Scanner;

public class UserConsole {

    private final Scanner scanner;
    private final UserService userService;

    public UserConsole(UserService userService) {
        this.scanner = new Scanner(System.in);
        this.userService = userService;
    }

    public void signUp() {
        System.out.print("Введите ФИО: ");
        String username = scanner.nextLine();

        System.out.print("Введите номер телефона: ");
        String number = scanner.nextLine();

        while (true) {

            System.out.print("Введите дату: ");
            String date = scanner.nextLine();

            System.out.println("Свободное время: ");
            userService.getFreeTime();

            System.out.print("Введите время: ");
            String time = scanner.nextLine();


            try {
                userService.signUp(username, date, time, number);
                System.out.println(username + ", " + "Вы записались на: " + date + " " + time);
                break;
            } catch (BookedTimeException e) {
                System.out.println("Упс! Время занято! Выберите другую дату");
            }
        }
    }
}
