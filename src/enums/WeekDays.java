package enums;

public enum WeekDays {
    Monday("Mon"),
    Tuesday("Tue"),
    Wednesday("Wed"),
    Thursday("Thu"),
    Friday("Fri"),
    Saturday("Sat"),
    Sunday("Sun");

    private final String dayName;

    WeekDays(String dayName) {
        this.dayName = dayName;
    }

}
