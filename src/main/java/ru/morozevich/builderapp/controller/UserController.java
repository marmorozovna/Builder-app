package ru.morozevich.builderapp.controller;

import ru.morozevich.builderapp.model.entity.User;
import ru.morozevich.builderapp.model.service.UserCreator;

import java.util.stream.Stream;

public class UserController {
    UserCreator userCreator = new UserCreator();

    public Stream <User> initializeUsers(Stream<User> stream) {
        return userCreator.initializeUsers(stream);
    }
}
