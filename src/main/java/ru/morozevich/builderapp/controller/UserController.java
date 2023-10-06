package ru.morozevich.builderapp.controller;

import ru.morozevich.builderapp.model.entity.User;
import ru.morozevich.builderapp.model.service.UserCreator;
import ru.morozevich.builderapp.view.Printer;

import java.util.ArrayList;
import java.util.stream.Stream;

public class UserController {
    UserCreator userCreator = new UserCreator();
    Printer printer = new Printer();

    public Stream<User> initializeUsers(Stream<User> stream) {
        return userCreator.initializeUsers(stream);
    }

    public ArrayList<User> sortUsers(Stream<User> initializedUsers) {
        return userCreator.sortUsers(initializedUsers);
    }

    public void printUserList(ArrayList<User> sortedUsers) {
        printer.printSortedUsers(sortedUsers);
    }
}
