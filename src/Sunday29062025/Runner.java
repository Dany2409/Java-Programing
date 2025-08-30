package Sunday29062025;
// Method with Agruments and constructor
import com.java.tutorial.*;

public class Runner  {
	public static void main(String[] args) 
	{
		//		System.out.println("Plumber calling....");
		//		Plumber Navin= new Plumber(1);
		//		Navin.Fixtap();
		//		System.out.println("---------------------------------------------------------------------");
		//		Navin.Fixtap(200);
		//		System.out.println("---------------------------------------------------------------------");
		//		Plumber Abhishek= new Plumber(2);
		//		Abhishek.Fixtap(600);
		HR Sudeep = new HR();
		boolean status =Sudeep.isEmployeeAllowed(0,null, false);
		System.out.println(status);
	}

}
