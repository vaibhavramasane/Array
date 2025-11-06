import java.util.*;
public class FirstnegativeArr{
	public static void main(String x[]){
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[7];
		for(int i=0;i<=a.length-1;i++){
			a[i]=xyz.nextInt();
		}
		System.out.println("enter the value of the k");
		int k=xyz.nextInt();
		int j=0;
		int i=0;
		int count=0;
		int b[]=new int[6];
		while(j<=k-1){//1
			
			if(a[j]<0){
				count++;
				if(count==1){
					b[i]=a[j];
				}
				
			}
						
				if(j==k-1){
					k++;
					i++;
					j=j-2;
					count=0;
				}
				
				
				if(k==a.length+1){
					break;
				}
				j++;
			
		}
		for(int p=0;p<=b.length-1;p++){
			System.out.print(" "+b[p]);
		}
	}
}	