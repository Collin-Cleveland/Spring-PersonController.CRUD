package io.zipcoder.crudapp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public PersonService (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person p) {
        return personRepository.save(p);
    }

    public Person getPerson(int id) {
        return personRepository.findOne(id);
    }

    public Iterable<Person> getPersonList() {
        return personRepository.findAll();
    }

    public Person updatePerson(Integer id, Person nPersonData) {
        Person originalPerson = personRepository.findOne(id);
        originalPerson.setFirstName(nPersonData.getFirstName());
        originalPerson.setLastName(nPersonData.getLastName());
        return personRepository.save(originalPerson);
    }

    public Boolean deletePerson(int id) {
        personRepository.delete(id);
        return true;
    }
}
