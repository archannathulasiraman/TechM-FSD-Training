package TechM;

public class Student {
	private String name;
	private String address;
	private String dept;
	private int year;
	private String locality;

	public Student(String name,String address,String dept,int year,String locality) {
		this.name=name;
		this.address=address;
		this.dept=dept;
		this.year=year;
		this.locality=locality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
	
}

//important terminologies in auditing
//created at - time stamp
//created by - current user
//updated at 
//updated by
//isActive 