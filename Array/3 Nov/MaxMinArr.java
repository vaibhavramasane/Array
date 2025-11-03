//Q3. Write a java program to find maximum and minimum number in array.
import java.util.*;
class MaxMinArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter Number: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int max = a[0]; 
		int min = a[4];
		for(int i=0; i<a.length; i++){
			
			if(a[i] > max){
				
				max = a[i];
				
			}
			if(a[i] < min){
				
				min = a[i];
				
			}
			
		}
		System.out.println("Maximum Number in Array : " + max);
		System.out.println("Minumum Number in Array : " + min);
		
	}
}
		