package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List Methods
		
		List<String>fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("Mango");
		fruits.add("pineapple");
		fruits.add("grapes");
		fruits.add("Orange");
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		fruits.set(1, "Lemon");
		System.out.println(fruits);
		fruits.add("berry");
		System.out.println(fruits);
		fruits.set(1, "berry");
		System.out.println(fruits);
		System.out.println(fruits.indexOf("berry"));
		System.out.println(fruits.lastIndexOf("berry"));
		fruits.remove(5);
		System.out.println(fruits);
		System.out.println(fruits.contains("chicku"));
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());
		
		
		
		
		

	}

}
