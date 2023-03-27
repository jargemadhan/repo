package map;
import java.util.HashMap;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("George",1074,"male",15);
		Student s2=new Student("Ganesh",843,"male",14);
		Student s3=new Student("Priya",1075,"female",16);
		Student s4=new Student("Dinesh",1076,"male",15);
		Student s5=new Student("Jamuna",1077,"female",14);
		Student s6=new Student("Balaji",1078,"male",15);
		HashMap<Integer,Student> k=new HashMap<>();
		k.put(s1.getRollNo(),s1);
		k.put(s2.getRollNo(),s2);
		k.put(s3.getRollNo(),s3);
		k.put(s4.getRollNo(),s4);
		k.put(s5.getRollNo(),s5);
		k.put(s6.getRollNo(),s6);
		ArrayList<Student> emp=new ArrayList<>();
		for(Student y:k.values()) {
			if(y.getAge()>15) {
				emp.add(y);
				//System.out.println(y);
			}
		}
		System.out.println(emp);
	}

}
