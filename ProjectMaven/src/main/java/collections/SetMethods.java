package collections;


import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>fruits=new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		Set<String>veg=new HashSet<String>();
		veg.add("Carrot");
		veg.add("Beans");
		veg.add("Ginger");
		
		System.out.println(fruits);
		System.out.println(veg);
		
		fruits.addAll(veg);
		System.out.println(fruits);
		
		
		System.out.println(fruits.contains("Lemon"));
		
		System.out.println(veg.containsAll(fruits));
		System.out.println(fruits.containsAll(veg));
		
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());
		
		fruits.remove("Banana");
		System.out.println(fruits);
		
		fruits.removeAll(veg);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		//System.out.println(fruits.clear());
		
		
		
		
		
		
		
		

	}

}
