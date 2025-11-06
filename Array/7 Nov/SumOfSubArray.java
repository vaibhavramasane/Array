//WAP to find the maximum sum of sub array of size k 
import java.util.*;

class SumOfSubArray{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println("Enter Number: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int sum =0,max=Integer.MIN_VALUE;
		int k=3;
		for(int i=0; i<k; i++){
			
			sum = sum + a[i];
			
		}
		max = sum;
		
		for(int i=k; i<a.length; i++){
			
			sum = sum + a[i]-a[i-k];
			if(sum>max){
				max = sum;
				
				
			}
		}
		System.out.println("Max Value Of Array is " + max);
	}
}

