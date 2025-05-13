package superkeyword;




public class Dog extends Animal
{
  
	void sound()
	{
		System.out.println("bow bow");
		super.sound();
	}
	public static void main(String[] args) 
	{
		
	    Dog obj=new Dog();
	    obj.sound();
	    
	}  
	    		
		// TODO Auto-generated method stub

	}
