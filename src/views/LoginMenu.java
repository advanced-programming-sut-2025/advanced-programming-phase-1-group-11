package views;
import enums.CommandType;
import java.util.Scanner;
public class LoginMenu extends AppMenu {
    @Override
    public void check(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            CommandType command = detectCommand(input);

            switch (command) {
                case LOGIN:
                    handleLoginCommand(input);
                    break;
                case FORGET_PASSWORD:
                    handleForgetPassword(scanner, input);
                    break;
                case ANSWER:
                    System.out.println(" The 'answer' command should be used after 'forget password'.");
                    break;
                case EXIT:
                    return;
                case UNKNOWN:
                default:
                    System.out.println(" Invalid command.");
            }
        }
    }

    private void handleLoginCommand(String input) {
        String username = extractArgument(input, "-u");
        String password = extractArgument(input, "-p");
        boolean stayLoggedIn = input.contains("--stay-logged-in");

        if (username == null || password == null) {
            System.out.println(" Please provide both username and password.");
            return;
        }
        // وابسته به منو ثبت نام
        if (isValidCredentials(username, password)) {
            System.out.println("Login successful: user " + username +
                    (stayLoggedIn ? " (stay logged in)" : ""));

            // مرحله بعد رفتن به بازی
        } else {
            // اگر نام کاربری یا رمز عبور اشتباه بود، پیام خطا
            System.out.println(" Invalid username or password.");
        }
    }
    private boolean isValidCredentials(String username, String password) {
        // وابسته به منو ثبت نام
        // چرت نوشتم باگ نخوره :)
        return username.equals("user123") && password.equals("password123");
    }
    private void handleForgetPassword(Scanner scanner, String input) {
        String username = extractArgument(input, "-u");
        if (username == null) {
            System.out.println(" Please provide a username.");
            return;
        }

        System.out.println("Security question: ///////////");

        while (true) {
            String answerInput = scanner.nextLine().trim();
            CommandType command = detectCommand(answerInput);

            if (command == CommandType.ANSWER) {
                String answer = extractArgument(answerInput, "-a");
                if (answer == null) {
                    System.out.println(" Please provide an answer.");
                    continue;
                }

                System.out.print("New password: ");
                String newPassword = scanner.nextLine();

                System.out.println("Password for " + username + " has been changed.");
                break;
            } else {
                System.out.println(" Please enter the correct command (answer -a <answer>)");
            }
        }
    }

    private String extractArgument(String input, String flag) {
        String[] parts = input.split("\\s+");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals(flag) && i + 1 < parts.length) {
                return parts[i + 1];
            }
        }
        return null;
    }

    private CommandType detectCommand(String input) {
        if (input.startsWith("login")) {
            return CommandType.LOGIN;
        } else if (input.startsWith("forget password")) {
            return CommandType.FORGET_PASSWORD;
        } else if (input.startsWith("answer")) {
            return CommandType.ANSWER;
        } else if (input.equalsIgnoreCase("exit")) {
            return CommandType.EXIT;
        } else {
            return CommandType.UNKNOWN;
        }
    }
}
