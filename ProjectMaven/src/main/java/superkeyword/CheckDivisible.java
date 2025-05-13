package superkeyword;

public class CheckDivisible extends Addition
{
	
	void cal(int a,int b)	
	{
		int c=super.add(a,b);
		System.out.println("The sum of two numbers: " +c);
		
		
		if(c%10==0)
		{
			System.out.println("The result is divisible by 10");
		}
		else
		{	
			System.out.println("The result is not divisible by 10");
		}	
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		CheckDivisible obj=new CheckDivisible();
		obj.cal(25,15);
		
	
	}

}
