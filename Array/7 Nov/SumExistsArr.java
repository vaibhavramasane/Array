/*

Check if Subarray with Given Sum Exists
For a given sum, check if there’s a subarray with that sum using sliding window.

*/

import java.util.*;

class SumExistsArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = xyz.nextInt();
		
		System.out.println("Enter Value: ");
		int a[] = new int[n];
		
		//for input
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int sum=0;
		System.out.println("Enter a Kth value: ");
		int k = xyz.nextInt();
		
		System.out.println("Enter target value: ");
		int t = xyz.nextInt();
		
		boolean sumExist =false;
		//int max = Integer.MIN_VALUE;
		// for k values
		for(int i=0; i<k; i++){
			
			sum  = sum + a[i];
			
		}
		
		
		for(int i=k; i<=a.length; i++){
			
			sum = sum + a[i] - a[i-k];
			if(sum == t){
				sumExist = true;
				break;
				
			}
		}
		if(sumExist){
			
			System.out.println("Sum Exists ");
			
		}else{
			
			System.out.println("Sum Not Exist ");
			
		}
	}
}
				
				
				
				
		
		
		
		