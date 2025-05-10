package views;

import controller.MainMenuController;
import enums.Commands.MainMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenu extends AppMenu{
    private final MainMenuController controller = new MainMenuController();

    @Override
    public void check(Scanner scanner) {
        String input = scanner.nextLine();
        if (MainMenuCommands.ProfileMenuEnter.getMatcher(input) != null) {
            System.out.println(controller.profileMenuEnter());
        } else if (MainMenuCommands.GameMenuEnter.getMatcher(input) != null) {
            System.out.println(controller.gameMenuEnter());
        } else if (MainMenuCommands.UserLogout.getMatcher(input) != null) {
            System.out.println(controller.userLogout());
        } else {
            System.out.println("Invalid command");
        }
    }
}
