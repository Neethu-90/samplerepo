package aggregation;

public class Student
{

	public static void main(String[] args) 
	{
		
		Address obj1=new Address("kochi", "kerala");
		Student obj2=new Student("Neethu ", 20,obj1);
		obj2.displaydetails();
		
	}
	
	String name;
	int rollnumber;
	Address address;
	
	Student(String name,int rollnumber,Address address)
	{
		this.name=name;
		this.rollnumber=rollnumber;
		this.address=address;
	}
	     
	     void displaydetails()
	     
	     {
	    	 System.out.println(name);
	    	 System.out.println(rollnumber);
	    	 System.out.println(address.city);
	    	 System.out.println(address.state);
	     }

}
