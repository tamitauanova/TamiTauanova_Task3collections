package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

//    Создаем список пользователей соцсети где ключ - ник пользователя, а значение - его имя собственное.
//    После того как создали список создаем метод регистрации нового пользователя,
//    если такого пользователя нет(по ключу) то регистрируем, если есть
//    то возвращаем сообщение что пользователь с таким ником есть.
//    Так же создаем метод удаления пользователя по ключу.
//    Можно по желанию добавить работу со Scanner и получением значения логина/пароля с консоли.

    Map<String, String> users;

    public MapClass() {
        users = new HashMap<>();
    }

    public void register(String userName, String firstName) {
        if (users.containsKey(userName)) {
            System.out.println("User with this username is already registered");
        } else {
            users.put(userName, firstName);
        }
    }

    public void deleteUser(String userName) {
        users.remove(userName);
    }
}
