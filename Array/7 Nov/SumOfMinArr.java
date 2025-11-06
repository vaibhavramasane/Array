/*
Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.
*/
import java.util.*;

class SumOfMinArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println("Enter Number: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int sum =0,min=Integer.MAX_VALUE;
		int k=3;
		for(int i=0; i<k; i++){
			
			sum = sum + a[i];
			
		}
		min = sum;
		for(int i=k; i<a.length; i++){
			
			sum = sum + a[i]-a[i-k];
			if(sum<min){
				min = sum;
				
			}
		}
		System.out.println("Min Value Of Array is " + min);
	}
}