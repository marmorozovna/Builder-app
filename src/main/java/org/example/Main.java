package org.example;

import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <User> userList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
        userList.add(new User());
        }
    }
}