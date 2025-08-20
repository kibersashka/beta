package ru.home.booking_hairdresser.User.Service;

import ru.home.booking_hairdresser.User.Entity.User;
import ru.home.booking_hairdresser.User.Repository.File.Exception.BookedTimeException;
import ru.home.booking_hairdresser.User.Repository.UserRepository;

import javax.xml.crypto.Data;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signUp(String username, String date, String time, String number) throws BookedTimeException {
        chekValidateDate(date, time);
        User user = new User(username, date, time, number);
        userRepository.save(user);

    }

    private void chekValidateDate(String date, String time) throws BookedTimeException {
        userRepository.chekValidateDate(date, time);
    }


    public void getFreeTime(){

    }
}
