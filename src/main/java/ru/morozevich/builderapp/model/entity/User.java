package ru.morozevich.builderapp.model.entity;

public class User {
    private Long id;
    private String login;
    private StringBuilder password;
    private int age;

    public User() {
    }

    public User(Long id, String login, StringBuilder password, int age) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public Long getId() {
        return this.id;
    }

    public String getLogin() {
        return this.login;
    }

    public StringBuilder getPassword() {
        return this.password;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password=" + password +
                ", age=" + age +
                '}';
    }

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setId(Long id) {
            User.this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            User.this.login = login;
            return this;
        }

        public Builder setPassword(StringBuilder password) {
            User.this.password = password;
            return this;
        }

        public Builder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}
