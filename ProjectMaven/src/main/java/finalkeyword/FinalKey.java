package finalkeyword;

public class FinalKey {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FinalKey obj1=new FinalKey();
		obj1.display();

	}
	
	final int age=34;
	
	void display()
	{
	   // age=30; final int age is assigned as 34 so we cannot change it
	   System.out.println(age);
		
	}

}
