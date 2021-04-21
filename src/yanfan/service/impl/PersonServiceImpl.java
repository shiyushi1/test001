package yanfan.service.impl;

import org.apache.ibatis.session.SqlSession;
import yanfan.mapper.PersonMapper;
import yanfan.pojo.Person;
import yanfan.service.PersonService;
import yanfan.util.MyBatisUtil;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> findAll() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Person> personList = sqlSession.getMapper(PersonMapper.class).selectAll();
        return personList;
    }

    @Override
    public int add(Person person) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            int i = sqlSession.getMapper(PersonMapper.class).add(person);
            sqlSession.commit();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }
    }

    @Override
    public int update(Person person) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            int i = sqlSession.getMapper(PersonMapper.class).update(person);
            sqlSession.commit();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }
    }

    @Override
    public int delete(Long id) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            int i = sqlSession.getMapper(PersonMapper.class).delete(id);
            sqlSession.commit();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }
    }

}
