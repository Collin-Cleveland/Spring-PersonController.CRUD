package io.zipcoder.crudapp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

    Person findOne(int id);

    void delete(int id);
}
