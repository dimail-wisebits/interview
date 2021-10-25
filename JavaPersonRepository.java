package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JavaPersonRepository {

    private final HashMap<Passport, Person> registry = new HashMap<>();

    public void insert(Person person) {
        registry.put(person.getPassport(), person);
    }

    public void changePassport(Passport oldPassport, int newSerial, int newNumber) {
        Person person = registry.get(oldPassport);
        Passport passport = person.getPassport(newPassport);

        passport.setSerial(newSerial);
        passport.setNumber(newNumber);
    }

    public List<Person> filterAge(ArrayList<Person> persons, int age) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAge() >= age) {
                persons.remove(i);
            }
        }
        return persons;
    }

}
