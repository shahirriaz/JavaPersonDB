package no.kristiania.person;

import javax.sql.DataSource;

public class PersonDao {
    private Person person;

    public PersonDao(DataSource dataSource) {
        //must take care of dataSource, so it knows how to
        //connect to the database
    }

    public void save(Person person) {
            //let's take care of the person that is comming in
        this.person = person;
    }

    public Person retrieve(Long id) {
        //returns a person for us when receiving an id
        //long with small l because I don't want id to be null
        return person;
    }
}
