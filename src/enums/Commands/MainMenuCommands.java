package enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands implements Command {
    ProfileMenuEnter("\\s*menu\\s+enter\\s+Profile\\s+Menu\\s*"),
    GameMenuEnter("\\s*menu\\s+enter\\s+Game\\s+Menu\\s*"),
    UserLogout("\\s*user\\s+logout\\s*");
    private final String pattern;

    MainMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }


}
