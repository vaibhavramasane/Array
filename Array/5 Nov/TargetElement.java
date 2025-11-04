//Given an array [] an integer determine whether there exists a pair of elements (i,j) in any match with target elements 
import java.util.*;

class TargetElement{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[4];
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		System.out.println("Enter target Elements");
		int target = xyz.nextInt();
		
		System.out.println("Display Array Values: ");
		for(int i=0; i<a.length; i++){
			System.out.printf("%d\t",a[i]);
		}
		
		//find pair logic
		boolean flag = false;
		for(int i=0; i<a.length; i++){
			
			for(int j=(i+1); i<a.length; j++){
				
				if(a[i] + a[j] == target){
					
					flag = true;
					
					System.out.printf("(%d,%d)",i,j);
					
					break;
					
				}
			}
			
		}
		if(flag){
			
			System.out.println("Pair found");
			
		}else{
			
			System.out.println("There is no pair to target elements");
			
		}
	}
}