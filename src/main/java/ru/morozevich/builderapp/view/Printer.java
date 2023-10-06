package ru.morozevich.builderapp.view;

import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Printer {

    public void printSortedUsers(ArrayList<User> sortedUsers) {
        System.out.println("Отсортированные по убыванию пользователи");
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }

    public Stream <User> printEvenIDUsers(Stream<User> usersEvenID) {
        System.out.println("Пользователи с четными Id");
        return usersEvenID.peek(System.out::println);
    }

    public void printOptUser(Optional<User> optUser) throws RuntimeException {
        if (optUser.isPresent()) {
            System.out.println("Найдено совпадение ID и возраста:" + optUser.get());
        } else throw new RuntimeException("Нет совпадения ID и возраста");
    }
}
