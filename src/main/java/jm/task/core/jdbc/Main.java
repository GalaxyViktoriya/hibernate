package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Антон", "Ефремов", (byte) 30);
        userService.saveUser("Егор", "Валов", (byte) 19);
        userService.saveUser("Артём", "Потапов", (byte) 36);
        userService.saveUser("Владимир", "Кузнецов", (byte) 24);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
