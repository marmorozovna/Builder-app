package ru.morozevich.builderapp._main;

import ru.morozevich.builderapp.controller.UserController;
import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class _Main {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            userList.add(new User());
        }
        Stream<User> streamUserList = userList.stream();
        UserController userController = new UserController();
        Stream<User> initializedUser = userController.initializeUsers(streamUserList);
        ArrayList<User> sortedUser = userController.sortUsers(initializedUser);
        userController.printUserList(sortedUser);
        Stream<User> sortedUserStream = sortedUser.stream();
        Stream<User> evenIdUsers = userController.getUsersEvenId(sortedUserStream);
        Stream<User> evenIdUsersPrinted = userController.printEvenIdUsers(evenIdUsers);
        Optional<User> evenIdUser = userController.getAnyUserIdEqualsAge(evenIdUsersPrinted);
        userController.printOptUser(evenIdUser);
    }
}