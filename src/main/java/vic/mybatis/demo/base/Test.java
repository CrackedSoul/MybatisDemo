package vic.mybatis.demo.base;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vic.mybatis.demo.base.blog.Blog;
import vic.mybatis.demo.base.blog.IBlogDao;

public class Test {
	private static SqlSessionFactory sqlSessionFactory=DBManager.getSqlSessionFactory();
	public static void main(String args[]) {
		SqlSession session = sqlSessionFactory.openSession();
//		IUserDao userDao=session.getMapper(IUserDao.class);
//		User u1=new User(1,"Lee",25,"NanJing");
//		userDao.addNewUser(u1);
//		List<User> userList=userDao.retrieveAllUsers();
//		for(User us:userList) {
//			System.out.println(us);
//		}
		IBlogDao blogDao=session.getMapper(IBlogDao.class);
		Blog b=new Blog("Test1","2018-05-20","Leeli","HHHHHH");
		blogDao.insertBlog(b);
		blogDao.insertBlog(b);
		blogDao.insertBlog(b);
		blogDao.insertBlog(b);
		blogDao.insertBlog(b);
		blogDao.insertBlog(b);
		List<Blog> blogs=blogDao.selectBlogs();
		for(Blog blog:blogs) {
			blog.setTitle(blog.getTitle()+"001");
			blogDao.updateBlog(blog);
		}
		session.commit();
	}
}
