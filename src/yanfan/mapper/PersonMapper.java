package yanfan.mapper;

import yanfan.pojo.Person;

import javax.xml.ws.soap.Addressing;
import java.util.List;

public interface PersonMapper {
    List<Person> selectAll() throws Exception;
    int add(Person person) throws Exception;
    int update(Person person) throws Exception;
    int delete(Long id) throws  Exception;
}
