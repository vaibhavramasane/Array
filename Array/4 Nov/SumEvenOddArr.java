//Q8. Write a java program to calculate the sum of even or odd numbers
import java.util.*;

class SumEvenOddArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter Numbers: ");
		
		// for input
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int SumEven =0;
		int SumOdd =0;
		
		
		//logic for sum of even and odd number
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 ==0){
				
				SumEven = SumEven + a[i];
				
			}else{
				
				SumOdd = SumOdd + a[i];
				
			}
			
		}
		System.out.println("Sum of Even Number is = " + SumEven);
		System.out.println("Sum of Odd Number is = " + SumOdd);
	}
}
