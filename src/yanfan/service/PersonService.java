package yanfan.service;

import yanfan.pojo.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll() throws Exception;
    int add(Person person) throws Exception;
    int update(Person person) throws Exception;
    int delete(Long id) throws Exception;
}

