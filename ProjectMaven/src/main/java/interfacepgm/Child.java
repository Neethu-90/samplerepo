package interfacepgm;

public class Child implements Parent //instead of extends using implements in interface pgm
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Child obj1=new Child();
		obj1.sum();
		obj1.display();

	}
	
	public void sum()
	{
		
		int a=5;
		int b=2;
		int c=a+b;
		System.out.println("sum is : " +c);
	}
	
	public void display()
	{
		System.out.println("hello world");
	}

}
