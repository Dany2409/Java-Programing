package Day2007;

public class Lift extends liftB
{

	
	public static void main(String args[]) 
	{
		liftB lb= new liftB();
		liftc lc= new liftc();
		Liftd ld= new Liftd();
		System.out.println("-----------------------------------------------");
		lb.selectFlooor();
		System.out.println("-----------------------------------------------");
		lc.selectFlooor();
		System.out.println("-----------------------------------------------");
		ld.selectFlooor();
		
	}

	

}
 class liftB implements LifyDashboard 
{
	 public void selectFlooor()
	{
		System.out.println("press up or down");
	}
}
class liftc implements LifyDashboard 
{
	public void selectFlooor() 
	{
		System.out.println("tell lift");
	}
}

 class Liftd implements LifyDashboard
{	
	public void selectFlooor() 
	{
		System.out.println("press a number");	
	}
}