package test;

public class Passport {

    private Integer serial;
    private Integer number;

    public Integer getSerial() {
        return serial;
    }

    public Integer getNumber() {
        return number;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return serial.equals(passport.serial) && number.equals(passport.number);
    }

    @Override
    public int hashCode() {
        return 37;
    }

}
