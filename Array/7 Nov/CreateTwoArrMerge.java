//Example:WAP to create two arrays of size 5 and merge them in third array
import java.util.*;

class CreateTwoArrMerge{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter First Size of Array:");
		int n1 = xyz.nextInt();
		
		System.out.println("Enter Second Size of Array:");
		int n2 = xyz.nextInt();
		
		
		int a[] = new int[n1];
		int b[] = new int[n2];
		
		int c[] = new int[a.length + b.length];
		System.out.print("Enter Elment on first Array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		System.out.print("Enter Elment on Second Array: ");
		for(int i=0; i<b.length; i++){
			
			b[i] = xyz.nextInt();
			
		}
		
		for(int i=0,k=a.length; i<a.length; i++,k++){
			
			c[i] = a[i];
			c[k] = b[i];
			
		}
		
		System.out.println("Display First Array: ");
		for(int i=0; i<a.length; i++){
			
			System.out.printf("%d\t ",a[i]);
			
		}
		
		System.out.println("\nDisplay second Array: ");
		for(int i=0; i<b.length; i++){
			
			System.out.printf("%d\t ", b[i]);
			
		}
		System.out.println("\nDisplay third Array: ");
		for(int i=0; i<c.length; i++){
			
			System.out.printf("%d\t ", c[i]);
			
		}
	}
}

		
		
		
		