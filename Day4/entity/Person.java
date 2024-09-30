package entity;

public class Person {
    private String name;
    private String number;
    private String serName;

    public Person(String name, String number, String serName) {
        this.name = name;
        this.number = number;
        this.serName = serName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }
}
