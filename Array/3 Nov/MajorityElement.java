
import java.util.*;

public class MajorityElement{


//not working
    public static void main(String args[]){
		
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
		boolean flag = false;
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];

        //input
        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Specific Numbers");
        int number = sc.nextInt();

        for(int i=1; i<n; i++){

            if(arr[i] == number){// for single if statement not yet to {} braceses
			
				flag = true;
				
			}
            

        }
		if(flag){
			
			System.out.println("number " + number + " first occured at index " + i);
			
       }else {

            System.out.println("number " + number + " not found in array " );
			
        }
        
        

    }
    
}
