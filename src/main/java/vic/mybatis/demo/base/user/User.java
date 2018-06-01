package vic.mybatis.demo.base.user;

import java.util.List;

public class User {
	private int id;
	private String userName;
	private int userAge;
	private String userAddress;
	public User(Integer id, String userName, Integer userAge, String userAddress) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
	}
	public User(String userName, Integer userAge, String userAddress) {
		super();
		
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String toString() {
		return new StringBuilder().append("id=").append(id).append(",name=").append(userName).append(",age=").append(userAge).append(",add=").append(userAddress).toString();
	}
}
