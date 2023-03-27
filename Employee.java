package map;

public class Employee {
	String name;
	int salary;
	String gender;
	boolean isOnRoll;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setGender(String gender) {
        this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setIsOnRoll(boolean isOnRoll) {
		this.isOnRoll=isOnRoll;
	}
	public boolean getIsOnRoll() {
		return isOnRoll;
	}
	public Employee(String name,int salary,String gender,boolean isOnRoll) {
		this.name=name;
		this.salary=salary;
		this.gender=gender;
		this.isOnRoll=isOnRoll;
	}
	@Override
	public String toString() {
		return "name=" +name+ ",salary=" +salary+ ",gender=" +gender+ ",isOnRoll=" +isOnRoll;
	}
	
	}



