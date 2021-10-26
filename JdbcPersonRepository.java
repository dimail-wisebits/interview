package test;

import org.springframework...

@Service
public class JdbcPersonRepository {

    private JdbcTemplate jdbcTemplate;

    public Person insertOrUpdate(Person person) {
        if (exists(person)) {
            return create(person);
        } else {
            return update(person);
        }
    }

    public boolean exists(Person person) {
        // to do something
        return ...
    }

    @Transactional
    public Person create(Person person) {
        // to do something with jdbcTemplate
        return ...
    }

    @Transactional
    public Person update(Person person) {
        // to do something with jdbcTemplate
        return  ...
    }

}
