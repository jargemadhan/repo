package map;

public class Student {
	private String name;
	private int rollNo;
	private String gender;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
		
	}
	public int getRollNo() {
		return rollNo;
		
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
		
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public int getAge() {
		return age;
		
	}
	public Student(String name,int rollNo,String gender,int age) {
		this.name=name;
		this.rollNo=rollNo;
		this.gender=gender;
		this.age=age;
	}
	public String toStrinng() {
		return name+" "+rollNo+" "+gender+" "+age;
	}
	
	

}
