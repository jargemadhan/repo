package map;
import java.util.HashMap;
public class UseEmployee {
	public static void main(String[]args) {
		Employee emp1=new Employee("George",25000,"male",true);
		Employee emp2=new Employee("Ganesh",35000,"male",true);
		Employee emp3=new Employee("Dinesh",30000,"male",true);
		Employee emp4=new Employee("Balaji",25000,"male",true);
		Employee emp5=new Employee("Jamuna",35000,"female",true);
		Employee emp6=new Employee("Priya",35000,"female",true);
		HashMap<Integer,Employee> emps=new HashMap<>();
		emps.put(emp1.getSalary(), emp1);
		emps.put(emp2.getSalary(), emp2);
		emps.put(emp3.getSalary(), emp3);
		emps.put(emp4.getSalary(), emp4);
		emps.put(emp5.getSalary(), emp5);
		emps.put(emp6.getSalary(), emp6);
		//for(Employee e:emps.values()) {
			//System.out.println(e);
		//}
		//for(Integer i:emps.keySet()) {
			//System.out.println(i);
			//System.out.println(emps.get(i));
		//}
		//emps.forEach((Integer,Employee)-> {
			//if(Employee.getGender().equalsIgnoreCase("male")) {
				//System.out.println(emps);
			//}
			
		//});
		int temp=0;
		int temp1=0;
		for(Integer x:emps.keySet()) {
			if(x>=20000&&x<=26000) {
				temp=x+x*5/100;
				//System.out.println(temp);
			}
			 if(x>26000&&x<=30000) {
				temp1=x+x*4/100;
				//System.out.println(temp1);
			}
		}
		
		//System.out.println(emps.temp);
		
	}

}
