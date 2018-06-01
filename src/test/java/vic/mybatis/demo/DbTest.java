package vic.mybatis.demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import vic.mybatis.demo.base.DBManager;
import vic.mybatis.demo.base.user.IUserDao;
import vic.mybatis.demo.base.user.User;

public class DbTest {
	private static SqlSessionFactory sqlSessionFactory=DBManager.getSqlSessionFactory();

	@Test
	public void testUser() {
		SqlSession session = sqlSessionFactory.openSession();
		IUserDao userDao=session.getMapper(IUserDao.class);
		User u1=new User("Lee",25,"NanJing");
		userDao.addNewUser(u1);
		userDao.addNewUser(u1);		
		userDao.addNewUser(u1);
		userDao.addNewUser(u1);
		userDao.addNewUser(u1);
		userDao.addNewUser(u1);	
		List<User> userList=userDao.retrieveAllUsers();
		for(User us:userList) {
			System.out.println(us);
			userDao.deleteUser(us.getId());
		}
		session.commit();
	}

}
