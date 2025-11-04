//Q5. Write a java program to find positive and negative number in array.
import java.util.*;
class PosNegArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter Number: ");
		
		
		//for input
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		
		//logic for zero,positive,negative number
		for(int i=0; i<a.length; i++){
			
			if(a[i]==0){
				
				System.out.println(a[i] + " Zero Value");
				
			}else if(a[i] < 0){
				
				System.out.println(a[i] + " Is Negative Number ");
			
			}else{
				
				System.out.println(a[i] + " Is Positive Number ");
			
			}
		}
	}
}