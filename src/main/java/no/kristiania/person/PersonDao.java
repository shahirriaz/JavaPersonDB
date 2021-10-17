package no.kristiania.person;

import javax.sql.DataSource;

public class PersonDao {
    public PersonDao(DataSource dataSource) {
        //must take care of dataSource, so it knows how to
        //connect to the database
    }

    public void save(Person person) {

    }

    public Person retrieve(long id) {
        //returns a person for us when receiving an id
        //long with small l because I don't want id to be null
        return null;
    }
}
