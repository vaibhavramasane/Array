/*
Find Max Average of Subarray of Size K
Find the maximum average of any subarray of size k.
*/

import java.util.*;

class MaxAvgSubArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println("Enter a value:");
		
		// for input 
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		// logic for sum
		int k =3;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<k; i++){
			
			sum = sum + a[i];
			
		}
		max = sum;
		
		for(int i=k; i<a.length; i++){
			
			sum = sum + a[i]-a[i-k];

			System.out.printf("%f\t",(double)sum/k);
			
			if((sum/k) > max){
				
				max = sum/k;
				
			}
			
			
		}
		System.out.println("Maximum Average of subArray is " + sum/k);
		
	}
}