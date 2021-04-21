import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import yanfan.pojo.Person;
import yanfan.service.PersonService;
import yanfan.service.impl.PersonServiceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PersonTest {
   PersonService personService=new PersonServiceImpl();
    @Test
    public void select() throws Exception
    {
        List<Person> personList=personService.findAll();
        for (Person person:personList){
            System.out.println(person.toString());
        }
    }
    @Test
    public void add() throws Exception
    {
        Person person=new Person("天启","男",22l,"4级","开发部");
        int i=personService.add(person);

        if (i==1){
            System.out.println("添加成功,这是添加的数据");
            System.out.println(person.toString());
        }else{
            System.out.println("添加失败,重新添加");
        }

    }
    @Test
    public void update() throws Exception{
        SqlSession sqlSession = null;

            Person person=new  Person(10l,"胡八","男",22l,"1级","开发部");
           int i= personService.update(person);
        System.out.println(i);
           if(i==1){
               System.out.println("修改成功,这是修改的数据");
               System.out.println(person.toString());
           }else{
               System.out.println("修改失败,重新修改");
           }
    }
    @Test
    public void delete() throws Exception{
        SqlSession sqlSession = null;

        Long id=10l;
        int i= personService.delete(id);
        System.out.println(i);
        if(i==1){

            System.out.println("删除成功");
        }else{
            System.out.println("删除失败,重新删除");
        }
    }

}
