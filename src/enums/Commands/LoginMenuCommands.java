package enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands implements Command {
    ;
    private final String pattern;

    LoginMenuCommands(String pattern) {
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
