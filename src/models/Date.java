package models;

import enums.Season;
import java.util.Scanner;

public class Date {
    private int year;
    private Season season;
    private int day;
    private boolean sunSine;
    private int hour;
    private int minute;

    public Date(int year, Season season, int day, boolean sunSine, int hour, int minute) {
        this.year = year;
        this.season = season;
        this.day = day;
        this.sunSine = sunSine;
        this.hour = hour;
        this.minute = minute;
    }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Season getSeason() { return season; }
    public void setSeason(Season season) { this.season = season; }

    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    public boolean isSunSine() { return sunSine; }
    public void setSunSine(boolean sunSine) { this.sunSine = sunSine; }

    public int getHour() { return hour; }
    public void setHour(int hour) { this.hour = hour; }

    public int getMinute() { return minute; }
    public void setMinute(int minute) { this.minute = minute; }

    public void advanceHour(int hours) {
        hour += hours;
        while (hour >= 24) {
            hour -= 24;
            advanceDay(1);
        }
    }

    public void advanceDay(int days) {
        for (int i = 0; i < days; i++) {
            day++;
            if (day > 28) {
                day = 1;
                season = Season.values()[(season.ordinal() + 1) % Season.values().length];
                if (season == Season.Spring) {
                    year++;
                }
            }
        }
    }
    public void displayTime() {
        System.out.printf("%02d:00\n", hour);
    }

    public void displayDate() {
        System.out.printf(" we are in day %d from  %s، in year  %d\n", day, season, year);
    }

    public void displayDateTime() {
        displayDate();
        displayTime();
    }

    public void displayDayOfWeek() {
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int totalDays = (year * 4 * 28) + (season.ordinal() * 28) + (day - 1);
        String dayName = daysOfWeek[totalDays % 7];
        System.out.println(dayName);
    }
    public static void runCommandLoop(Date date, Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "time":
                    date.displayTime();
                    break;
                case "date":
                    date.displayDate();
                    break;
                case "datetime":
                    date.displayDateTime();
                    break;
                case "day":
                case "day_of_week":
                case "dayoftheweek":
                    date.displayDayOfWeek();
                    break;
                case "cheat":
                    if (parts.length == 4 && parts[1].equals("advance")) {
                        try {
                            int amount = Integer.parseInt(parts[3].replaceAll("[^0-9]", ""));
                            if (parts[2].equals("time")) {
                                date.advanceHour(amount);
                            } else if (parts[2].equals("date")) {
                                date.advanceDay(amount);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: The entered number is invalid.");
                        }
                    } else {
                        System.out.println("The cheat command format is incorrect.");
                    }
                    break;
                default:
                    System.out.println("The command is invalid.");
            }
        }
    }
}












