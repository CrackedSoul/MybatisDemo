package vic.mybatis.demo.base.blog;

public class Blog {
	private Integer id;
	private String title;
	private String date;
	private String authername;
	private String content;
	
	public Blog(Integer id, String title, String date, String authername, String content) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.authername = authername;
		this.content = content;
	}
	public Blog(String title, String date, String authername, String content) {
		super();
		this.title = title;
		this.date = date;
		this.authername = authername;
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuthername() {
		return authername;
	}
	public void setAuthername(String authername) {
		this.authername = authername;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
	
	
}
