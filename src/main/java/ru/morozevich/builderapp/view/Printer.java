package ru.morozevich.builderapp.view;

import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Printer {

    public void printSortedUsers(ArrayList<User> sortedUsers) {
        System.out.println("Отсортированные по убыванию пользователи");
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }

    public void printEvenIDUsers(Stream<User> usersEvenID) {
        System.out.println("Пользователи с четными Id");
        usersEvenID.forEach(System.out::println);
    }
}
