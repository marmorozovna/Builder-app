package ru.morozevich.builderapp.model.service;

import ru.morozevich.builderapp.model.entity.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class UserService {

    public Stream<User> initializeUsers(Stream<User> streamUserList) {
        Random random = new Random();
        return streamUserList.map(user -> User.newBuilder()
                .setAge(random.nextInt(0, 100))
                .setPassword(random
                        .ints(48, 123)
                        .filter(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch))
                        .limit(random.nextInt(6, 21))
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                                StringBuilder::append))
                .setId()
                .setLogin(random
                        .ints(48, 123)
                        .filter(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch))
                        .limit(random.nextInt(6, 21))
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                                StringBuilder::append)
                        .toString())
                .build());
    }

    public ArrayList<User> sortUsers(Stream<User> initializedUsers) {
        return new ArrayList<>(initializedUsers
                .sorted((o1, o2) -> (o2.getAge() - o1.getAge()))
                .toList());
    }

    public Stream<User> getUsersEvenId(Stream<User> sortedUsers) {
        return sortedUsers
                .filter(user -> user.getId() % 2 == 0);
    }

    public Optional<User> getAnyUserIdEqualsAge(Stream<User> evenIdUser) {
        return evenIdUser
                .filter(user -> user.getAge() == user.getId())
                .findAny();
    }
}