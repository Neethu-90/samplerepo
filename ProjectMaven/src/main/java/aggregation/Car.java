package aggregation;

public class Car 
        {

		    Engine obj=new Engine();
		    
		    
			void stop()
			{
				obj.start();
				System.out.println("Car stops");
			}
		
public static void main(String args[])	
        
{
       Car obj1=new Car();
       obj1.stop();
       
       
	}

}
