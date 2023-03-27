package map;
import java.util.HashMap;
public class Max {
	public static void main(String[]args) {
		HashMap<Integer,String> h=new HashMap<>();
		h.put(1074, "George");
		h.put(1075, "Ganesh");
		h.put(1076, "Dinesh");
		h.put(1077, "Mani");
		h.put(1078, "Balaji");
		int max=0;
		String temp1="";
		//int min=h.size();
		for(Integer i:h.keySet()) {
			if(i>max) {
				max=i;
				temp1=h.get(i);
			}
			
		}
		System.out.println(max+" "+temp1.toUpperCase());
		int min=max;
		String temp="";
		for(Integer x:h.keySet()) {
			if(x<min) {
				min=x;
				temp=h.get(x);
			}
			
		}
		
			
	    System.out.println(min+" "+temp.toUpperCase());
	    //System.out.println(min);
	    for(Integer y:h.keySet()) {
	    	if(y%2==0) {
	    		
	    	}
	    }
		System.out.println();			
	}
		
}
