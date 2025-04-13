package models;

import enums.Season;

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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Season getSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public boolean isSunSine() {
        return sunSine;
    }
    public void setSunSine(boolean sunSine) {
        this.sunSine = sunSine;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

}
