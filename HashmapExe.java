package map;
import java.util.HashMap;

public class HashmapExe {
	public static void main(String[]args) {
		HashMap<String,Long> h=new HashMap<> ();
		h.put("George", 6374608921l);
		h.put("Madhan", 6374608920l);
		h.put("Ganesh", 6374608922l);
		h.put("mani", 6374608923l);
		h.put("Dinesh", 6374608924l);
		h.put("Balaji", 6374608925l);
		for(String x:h.keySet()) {
			System.out.println(x+" "+h.get(x));
			//System.out.println(h.get(x));
		}
		for(Long l:h.values()) {
			//System.out.println(l);
		}
	
	//h.forEach((j,k)->System.out.println(j+""+k));
	}

}
