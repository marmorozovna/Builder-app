package ru.morozevich.builderapp.view;

import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;

public class Printer {

    public void printSortedUsers(ArrayList<User> sortedUsers) {
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }
}
