package ru.home.booking_hairdresser.User.Repository;

import ru.home.booking_hairdresser.User.Entity.User;
import ru.home.booking_hairdresser.User.Repository.File.Exception.BookedTimeException;

import java.util.List;

public interface UserRepository {
    void save(User user);
    void chekValidateDate(String date, String time) throws BookedTimeException;
    List<User> getAll();
}
