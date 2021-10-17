package no.kristiania.person;

import org.junit.jupiter.api.Test;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDaoTest {

    @Test
    void shouldRetrieveSavedPersonFromDatabase(){
        //Connection to database is DataSource
        PersonDao dao = new PersonDao(createDataSource());

        Person person = examplePerson();
        dao.save(person);

        assertThat(dao.retrieve(person.getId()))

            .usingRecursiveComparison() //don't compare objects directly but rather the properties of the object -- We are essentially
                //asserting that the object we are putting in is the same as the object returning from the database -- but we are more interested in
                //the properties of the objects -- is firstname IN to db same as firstname OUT of db?
            .isEqualTo(person);
    }

    private Person examplePerson() {
        //Creating first an empty person for testing
        return new Person();
    }

    private DataSource createDataSource() {
        return null;
    }
}
