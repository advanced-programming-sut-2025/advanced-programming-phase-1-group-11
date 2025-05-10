package models;

public class User {
    private  String username;
    private String hashedPassword;
    private String nickname;
    private Email email;
    private final boolean gender;
    private int highGainedGolds;
    private int gamesPlayed;

    public User(String username, String hashedPassword, String nickname, Email email, boolean gender) {

        this.username = username;
        this.hashedPassword = hashedPassword;
        this.nickname = nickname;
        this.email = email;
        this.gender = gender;

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getHashedPassword() {
        return hashedPassword;
    }
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Email getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean GetGender() {
        return gender;
    }
    public int getHighGainedGolds() {
        return highGainedGolds;
    }
    public void setHighGainedGolds(int highGainedGolds) {
        this.highGainedGolds = highGainedGolds;
    }
    public int getGamesPlayed() {
        return gamesPlayed;
    }
    public void increaseGamesPlayed(int gamesPlayed) {
        this.gamesPlayed += gamesPlayed;
    }

    public User findUserByUsername(String username) {

        return null;
    }
}

