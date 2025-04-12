package models;

import enums.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<User> users = new ArrayList<>();
    private static Menu currentMenu = Menu.LoginMenu;
    private static User currentUser = null;
    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }
    public static Menu getCurrentMenu() {
        return currentMenu;
    }
    public static void setCurrentUser(User currentUser) {
        App.currentUser = currentUser;
    }
    public static User getCurrentUser() {
        return currentUser;
    }
    public static void setUsers(ArrayList<User> users) {
        App.users.addAll(users);
    }
    public static ArrayList<User> getUsers() {
        return users;
    }
    public static void addUser(User user) {
        users.add(user);
    }
    public static void removeUser(User user) {
        users.remove(user);
    }
}
