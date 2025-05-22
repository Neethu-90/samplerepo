package exception;

public class ExceptionEg

{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
			
		}
		
		catch(ArithmeticException e)//e denotes exception variable name.exception deatails hold in e
		{
			 b=2; 
			 int d=a/b;
			 System.out.println(d);
			 System.out.println(e);
	
		}
		
		finally//mandatory execution of finally occur
		{
			 b=4; 
			 float d=(float)a/b;//type of casting
			 System.out.println(d);
		

			
		}

	}

}
