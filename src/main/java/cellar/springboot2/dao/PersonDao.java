package cellar.springboot2.dao;

import cellar.springboot2.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    //vlozeni osoby s id
    int insertPerson(UUID id, Person person);

    //vlozeny osoby bez id
    default int insertPerson(Person person){
        UUID id= UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
