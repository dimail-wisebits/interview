package test;

public class Person {
    private Passport passport;
    private String name;
    private int age;

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
