package no.kristiania.person;

public class PersonDaoTest {

    @Test
    void shouldRetrieveSavedPersonFromDatabase(){
        //Connection to database is DataSource
        PersonDao dao = new PersonDao(createDataSource());

        Person perosn = examplePerson();
        dao.save(person);

        assertThat(dao.retrieve(person.getId()));
        //TODO
    }
}
