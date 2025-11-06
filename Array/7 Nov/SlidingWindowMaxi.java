import java.util.*;
public class CSARR
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
       int a[]={1 ,3,-1,-3,5,3,6,7};
	   
	   int k=3,target=3;
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length; i++)
	   { a[i]=xyz.nextInt();
	   }
	   int sum=0,count=0;
	   for(int i=0; i<k; i++)
	   {
	      sum =sum+a[i];
	   }
	   if(sum==target)
	     ++count;
		
	   for(int i=k; i<a.length; i++)
	   {   sum = sum + a[i]-a[i-k];
		   if(sum==target)
		     ++count;
	   }
	   System.out.printf("Count is %d\n",count);
   }
}
