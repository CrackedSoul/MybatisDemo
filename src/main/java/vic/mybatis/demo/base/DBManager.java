package vic.mybatis.demo.base;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vic.mybatis.demo.base.user.IUserDao;

public class DBManager {
	
	private static SqlSessionFactory sqlSessionFactory;
	static {
	
		try {
			Reader reader = Resources.getResourceAsReader("mybatic-config.xml");
//			InputStream in = DBManager.class.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	    	reader.close();
	    	Configuration config=sqlSessionFactory.getConfiguration();
	    	config.addMapper(IUserDao.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
