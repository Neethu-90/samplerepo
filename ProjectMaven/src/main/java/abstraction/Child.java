package abstraction;

public  class Child extends Parent
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Child obj1=new Child();
		obj1.sum();

	}
	
	
	public void sum()
	{
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println("sum:" +c);
	}

}
