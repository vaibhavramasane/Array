//Q10.Write a java program to check array is palindrome or not.
import java.util.*;

class PalindromeArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("enter number: ");
		
		//for input take from user
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int start =0;
		int end = a.length-1;
		boolean flag = true;
		
		for( ; start<end;){
			
			if(a[start]!= a[end]){
				
				flag = false;
				break;
			}
			start++;
			end--;
		}
		if(flag){
			
			System.out.println("It is Palindome");
			
		}else{
			
			System.out.println("It is not Palindrome");
			
		}
	}
}
