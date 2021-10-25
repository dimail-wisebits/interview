package test;

import ...

@Configuration
public class JdbcConfig {

    @Bean
    public DataSource getDataSource() {
        return new DataSource(...);
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(
                getDataSource()
        );
    }

}
