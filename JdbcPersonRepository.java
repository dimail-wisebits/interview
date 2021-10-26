package test;

import org.springframework...

@Service
public class JdbcPersonRepository {

    private JdbcTemplate jdbcTemplate;

    public Person insertOrUpdate(Person person) {

        if (exists(person)) {
            return update(person);
        } else {
            return insert(person);
        }

    }

    public boolean exists(Person person) {
        // to do something
        return ...
    }

    @Transactional
    public Person insert(Person person) {
        // to do something
        return ...
    }

    @Transactional
    public Person update(Person person) {
        // to do something
        return  ...
    }

}
