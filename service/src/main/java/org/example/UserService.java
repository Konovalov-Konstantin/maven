package org.example;

import java.util.Optional;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(userdao -> new UserDto());
    }
}
