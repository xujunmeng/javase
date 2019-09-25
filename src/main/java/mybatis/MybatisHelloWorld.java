package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author james
 * @date 2019/9/12
 */
public class MybatisHelloWorld {

    public static void main(String[] args) throws IOException {

        String resource = "Configuration.xml";
        Reader reader = Resources.getResourceAsReader(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = (User) sqlSession.selectOne("mybatis.UserMapper.getUser", 1);
        System.out.println(user);

        sqlSession.close();



    }

}
