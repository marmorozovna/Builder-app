package ru.morozevich.builderapp.model.service;

import ru.morozevich.builderapp.model.entity.User;

import java.util.Random;
import java.util.stream.Stream;

public class UserCreator {
//    UserController userController = new UserController();

    public Stream<User> initializeUsers(Stream<User> streamUserList) {
        Random random = new Random();
        return streamUserList.map(user -> User.newBuilder()
                .setAge(random.nextInt(0, 100))
                .setPassword(new StringBuilder().append(random.nextInt(30, 122)))
                .setId()
                .setLogin(String.valueOf(random.nextInt(30, 122)))
                .build());
    }
}
