package ru.morozevich.builderapp.controller;

import ru.morozevich.builderapp.model.entity.User;
import ru.morozevich.builderapp.model.service.UserService;
import ru.morozevich.builderapp.view.Printer;

import java.util.ArrayList;
import java.util.stream.Stream;

public class UserController {
    UserService userService = new UserService();
    Printer printer = new Printer();

    public Stream<User> initializeUsers(Stream<User> stream) {
        return userService.initializeUsers(stream);
    }

    public ArrayList<User> sortUsers(Stream<User> initializedUsers) {
        return userService.sortUsers(initializedUsers);
    }

    public void printUserList(ArrayList<User> sortedUsers) {
        printer.printSortedUsers(sortedUsers);
    }

    public Stream <User> getUsersEvenId (Stream <User> sortedUsers) {
        return userService.getUsersEvenId(sortedUsers);
    }
}
