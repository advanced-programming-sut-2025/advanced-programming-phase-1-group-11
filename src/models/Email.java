package models;

public class Email {
    private String name;
    private String domain;
    private String TLD;

    public Email(String name, String domain, String TLD) {
        this.name = name;
        this.domain = domain;
        this.TLD = TLD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setTLD(String TLD) {
        this.TLD = TLD;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getTLD() {
        return TLD;
    }
}
