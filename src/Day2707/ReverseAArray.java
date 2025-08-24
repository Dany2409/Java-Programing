package Day2707;

import java.util.Arrays;

public class ReverseAArray {

	public static void main(String[] args) {
//		int num[] = { 1, 2, 3, 4 };
//		System.out.println(num[1]);
//		int temp ;
//		temp = num[0];
//		num[0] = num[3];
//		num[3] = temp;
//
//		temp = num[1];
//		num[1] = num[2];
//		num[2] = temp;
//
//		//		for (int i = 0; i < num.length; i++) {
//		//			System.out.println(num[i]);
//		//			
//		//		}
//		System.out.println(Arrays.toString(num));



		int num1[]= {1,2,3,4,5,6,7,8,9,10};
		int n=num1.length;
		for (int idx=0;idx< n; idx++) 
		{
			int temp= num1[idx];
			num1[idx]= num1[n-1];
			num1[n-1-idx]=temp;
			
		}
		for(int arr:num1) 
		{
			System.out.println(arr);					
							}
	}

}
