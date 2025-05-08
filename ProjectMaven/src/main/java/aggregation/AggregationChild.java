package aggregation;

public class AggregationChild {

	String city;
	String State;
	
	public AggregationChild (String city, String State)
	{
		
		this.city=city;
		this.State=State;
	}
   public void Display()
   {
	   System.out.println(city+ " " +State);
   }
	
	public static void main(String[] args) {
	    AggregationChild obj1 = new AggregationChild("Texas","USA");
		obj1.Display();

	}

}
