package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass 
{
	public static void main(String[] args) {
		List<Integer>  num = new ArrayList<Integer>();
		
		
		
		for(int i=1;i<=10;i++) 
		{
			num.add(i);
		}
		
		for(int j: num) 
		{
			System.out.println(j);
		}
		
		//		for 
	} 

}
