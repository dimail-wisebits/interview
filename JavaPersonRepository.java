package test;

import java.util...

public class JavaPersonRepository {

    private final HashMap<Passport, Person> registry = new HashMap<>();

    public void insert(Person person) {
        registry.put(passport.getPassport(), person);
    }

    public void changePassport(Passport oldPassport, Passport newPassport) {
        Person person = registry.get(oldPassport);
        person.setPassport(newPassport);
    }

    public List<Person> filterAge(ArrayList<Person> persons, int age) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAge() >= age) {
                persons.remove(i);
            }
        }
        return persons;
    }

    public void storeToChannel(HttpPersonChannel channel, int secondTimeout) {
        registry.values().parallelStream().forEach(p -> channel.send(p, secondTimeout));
    }

}
