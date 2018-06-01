package vic.mybatis.demo.base.blog;

import java.util.List;

public interface IBlogDao {
	public Blog selectBlog(Integer id);
	public List<Blog> selectBlogs();
	public void deleteBlog(Integer id);
	public void updateBlog(Blog blog);
	public void insertBlog(Blog blog);
}
