package controller;

import enums.Menu;
import models.App;
import models.Result;

import java.util.StringJoiner;

public class ProfileMenuController {


    public Result showCurrentMenu() {
        return new Result(true, App.getCurrentMenu().toString());
    }

    public Result menuEnter() {
        App.setCurrentMenu(Menu.MainMenu);
        return new Result(true, "Now you are in Main Menu.");
    }

    public Result changeUsername(String username) {
        if (true/* TODO: Username format */)
            return new Result(false, "Invalid username format");
        if(App.getCurrentUser().getUsername().equals(username)){
            return new Result(false, "The new username must be different from the current username.");
        }
        App.getCurrentUser().setUsername(username);
        return new Result(true, "");
    }

    public Result changeNickname(String nickname) {
        App.getCurrentUser().setNickname(nickname);
        return new Result(true, "");
    }

    public Result changeEmail(String email) {
        if (true/* TODO: email check format*/) {
            return new Result(false, "Invalid Email Format");
        }
        App.getCurrentUser().setEmail(email);
        return new Result(true, "");
    }

    public Result changePassword(String oldPassword, String newPassword) {
        if(!App.getCurrentUser().getHashedPassword().equals(oldPassword)){
            return new Result(false, "Incorrect Password");
        }
        if(App.getCurrentUser().getHashedPassword().equals(newPassword)){
            return new Result(false, "The new password must be different from the current password.");
        }
        if (true/* TODO: password check format */) {
            return new Result(false, "Invalid password Format");
        }
        if (true /* TODO: password check weakness */) {
            return new Result(false, "The password is too weak");
        }
        App.getCurrentUser().setHashedPassword(newPassword);
        return new Result(true, "");
    }

    public Result userInfo(){
        StringJoiner joiner = new StringJoiner("\n");
        joiner.add("Username: " + App.getCurrentUser().getUsername());
        joiner.add("Nickname: " + App.getCurrentUser().getNickname());
        joiner.add("Best Score: ");
        joiner.add("Games Played: ");
        return new Result(true, joiner.toString());
    }

    public void menuExit() {
        App.setCurrentMenu(Menu.ExitMenu);
    }
}
