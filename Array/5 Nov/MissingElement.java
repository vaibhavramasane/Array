//12.Write a java program to find missing elements in an array.
//Input : 1 4 6 7 11 15
//Output : 2 3 5 8 9 10 12 13 14

import java.util.*;
public class Missingnoarray
{
	public static void main(String x[]){
		Scanner xyz=new Scanner(System.in);
		int a[]={1,4,6,7,11,15};
		
		
		for(int i=a[0];i<=a[a.length-1];i++){
			boolean flag=false;
			for(int j=0;j<=a.length-1;j++){
				if(i==a[j]){
					flag=true;
					break;
				}
				
			}
			if(flag==false){
				System.out.print("\t"+i);
			}
		}
	}
}