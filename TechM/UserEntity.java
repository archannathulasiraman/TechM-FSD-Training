package TechM;

public class UserEntity {
	private String name;
	private int age;
	private String email;
	private String phoneNumber;
	private String password;
	
	public UserEntity(String name, int age, String email, String phoneNumber, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+","+age+","+email+","+phoneNumber+","+password+"]";
	}
	

}
