package co.istad.generictype;

public class Person {
    private String name;
    private String gender;
    private Float height;

    public Person() {

    }

    public Person(String name, String gender, Float height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}
