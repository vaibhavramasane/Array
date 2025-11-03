/*
Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5

*/
import java.util.*;
class SpecificIndex{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter Number");
		
		for(int i=0; i<a.length-1; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		System.out.println("Enter index and value");
		int index = xyz.nextInt();
		int value = xyz.nextInt();
		
		System.out.println("Display Before inserting array ");
		for(int i=0; i<a.length-1; i++){
			
			System.out.printf("a[%d]---->%d\n",i,a[i]);
			
		}
		// applying inserting logic 
		
		for(int i=(a.length-2); i>=index; i--){
			
			a[i+1] =a[i]; // 
			
		}
		a[index] = value;
		
		System.out.println("Display After inserting array ");
		for(int i=0; i<a.length; i++){
			
			System.out.printf("a[%d]---->%d\n",i,a[i]);
			
		}
	}
}

		
		
		
			
			