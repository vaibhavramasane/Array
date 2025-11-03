//Q7. Write a java program to display the reverse array.
//import java.io.*;
import java.util.*;
class ReverseArr{
	
	public static void main(String x[]) /*throws IOException */{
		
		//BufferedReader xyz = new BufferedReader(new InputStreamReader(System.in));
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		//int num = Integer.parseInt(xyz.readLine());
		int num = xyz.nextInt();
		
		System.out.println("Enter Elements From an Array: ");
		int arr[] = new int[num];
		
		//for input
		
		for(int i=0; i<arr.length; i++){
			
			//arr[i] = Integer.parseInt(xyz.readLine());
			arr[i] = xyz.nextInt();
		}
		
		// for reverse element
		int start = 0;
		int end = arr.length-1;
		
		while(start<end){
			
			int temp = arr[start];
			
			arr[start] = arr[end];
			
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		
		System.out.println("After reverse: ");
		for(int val : arr){
			
			System.out.println(val);
			
		}
	}
}

