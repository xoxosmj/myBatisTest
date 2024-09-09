package user.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class UserDAO {
    private static UserDAO userDAO = new UserDAO();
    private SqlSessionFactory sqlSessionFactory;

    public static UserDAO getInstance() {
        return userDAO;
    }

    public UserDAO() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
