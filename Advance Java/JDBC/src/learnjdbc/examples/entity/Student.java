package learnjdbc.examples.entity;


//Pojo or entity class
public class Student {

	private int studId;
	private String studName;
	private String address;
	private String email;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studName, String address, String email, int age) {
		super();
		this.studName = studName;
		this.address = address;
		this.email = email;
		this.age = age;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
