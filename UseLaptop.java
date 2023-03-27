package map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
public class UseLaptop {
	public static void main(String[]args) {
		ArrayList<Laptop> l=new ArrayList<>();
		l.add(new Laptop("Dell",60000));
		l.add(new Laptop("HP",57000));
		l.add(new Laptop("Lenova",55000));
		l.add(new Laptop("Samsung",65000));
		l.add(new Laptop("Apple",100000));
		List<Laptop> a=l.stream().sorted(Comparator.comparing(Laptop::getPrice)).collect(Collectors.toList());
		
		a.forEach(x->System.out.println(x));
	}

}
