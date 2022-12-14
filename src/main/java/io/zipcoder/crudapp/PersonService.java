package io.zipcoder.crudapp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    
    public PersonService (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person p) {
        return personRepository.save(p);
    }

    public Person getPerson(int id) {
        return personRepository.findOne(id);
    }

    public List<Person> getPersonList() {
        return (List<Person>) personRepository.findAll();
    }

    public Person updatePerson(Person p) {
        return personRepository.save(p);
    }

    public Boolean deletePerson(int id) {
        personRepository.delete(id);
        return true;
    }
}
