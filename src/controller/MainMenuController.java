package controller;

import enums.Menu;
import models.App;
import models.Result;

public class MainMenuController {
    public Result profileMenuEnter() {
        App.setCurrentMenu(Menu.ProfileMenu);
        return new Result(true, "Now you are in Profile Menu.");
    }

    public Result gameMenuEnter() {
//        App.setCurrentMenu();
        // TODO: enter game menu
        return new Result(true, "Now you are in Game Menu.");
    }

    public Result userLogout() {
        App.setCurrentUser(null);
        App.setCurrentMenu(Menu.LoginMenu);
        return new Result(true, "You logged out successfully.");
    }
}
