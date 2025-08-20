package ru.home.booking_hairdresser.User.Repository.File;

import ru.home.booking_hairdresser.User.Entity.User;
import ru.home.booking_hairdresser.User.Repository.File.Exception.BookedTimeException;
import ru.home.booking_hairdresser.User.Repository.UserRepository;

import java.io.*;
import java.util.List;

public class UserRepositoryFile implements UserRepository {
    private final String filename;

    public UserRepositoryFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(User user) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filename), true))){

            bufferedWriter.write(UserToFileUtil.userToLine(user));
            bufferedWriter.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void chekValidateDate(String date, String time) throws BookedTimeException {
        List<User> users = getAll();
        for(User user : users){
            if(user.getDate().equals(date) && user.getTime().equals(time)){
                throw new BookedTimeException("Упс! Время занято! Выберите другую дату");
            }
        }

    }
    @Override
    public List<User> getAll() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            return bufferedReader.lines().map(UserToFileUtil::userFromLine).toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
