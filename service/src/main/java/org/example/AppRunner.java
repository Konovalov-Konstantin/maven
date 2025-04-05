package org.example;

import java.util.Optional;

public class AppRunner {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        Optional<User> userDaoById = userDao.findById(5L);
        if (!userDaoById.isPresent()) {
            System.out.println("Empty");
        } else {
            System.out.println("User find");
        }

        System.out.println("Test");
    }
}
