package yanfan.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static final ThreadLocal<SqlSession> THREADLOCAL =new ThreadLocal<>();
    private static SqlSessionFactory sqlSessionFactory;
    static {

        try {
            String config = "myBatis_config.xml";
            InputStream inputStream = Resources.getResourceAsStream(config);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=THREADLOCAL.get();
        if (sqlSession==null){
            sqlSession=sqlSessionFactory.openSession();
            THREADLOCAL.set(sqlSession);
        }
        return sqlSession;
    }
    public static void closeSqlSession(){
        SqlSession sqlSession=THREADLOCAL.get();
        if (sqlSession!=null){
            sqlSession.close();
            THREADLOCAL.remove();
        }
    }
}
