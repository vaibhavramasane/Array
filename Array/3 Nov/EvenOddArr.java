//Q4. Write a java program to find even and odd number in array.
import java.util.*;
class EvenOddArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter Number: ");
		
		for(int i=0; i<a.length; i++){
		
			a[i] = xyz.nextInt();
			
	    }
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 == 0){
				
				System.out.println(a[i] + " is Even Number ");
				
			}else{
				
				System.out.println(a[i] + " is Odd Number ");
				
			}
		}
	}
}
				
	
		