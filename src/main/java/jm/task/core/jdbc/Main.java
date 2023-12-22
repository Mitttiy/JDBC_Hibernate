package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Сидор", "Сидоров", (byte) 30);
        System.out.println("User с именем – " + userService.getAllUsers().get(userService.getAllUsers().size() - 1).getName() + " добавлен в базу данных");

        userService.saveUser("Петр", "Петров", (byte) 25);
        System.out.println("User с именем – " + userService.getAllUsers().get(userService.getAllUsers().size() - 1).getName() + " добавлен в базу данных");

        userService.saveUser("Иван", "Иванов", (byte) 35);
        System.out.println("User с именем – " + userService.getAllUsers().get(userService.getAllUsers().size() - 1).getName() + " добавлен в базу данных");

        userService.saveUser("Николай", "Николаев", (byte) 28);
        System.out.println("User с именем – " + userService.getAllUsers().get(userService.getAllUsers().size() - 1).getName() + " добавлен в базу данных");


        System.out.println("Список пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}



