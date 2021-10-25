package test;

import org.springframework...

@Repository
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
        return ...
    }

    @Transactional
    public Person insert(Person person) {
        return ...
    }

    @Transactional
    public Person update(Person person) {
        return  ...
    }

}
