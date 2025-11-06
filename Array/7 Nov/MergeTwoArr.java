//WAP to create two arrays of size 5 and merge them in third array
import java.util.*;
public class MergeTwoArr
{
  public static void main(String x[])
  {
      Scanner xyz  = new Scanner(System.in);
	  int a[]=new int[5];
	  int b[]=new int[6];
	  int c[]=new int[a.length+b.length];
	  System.out.println("Enter values in array");
	  for(int i=0; i<a.length; i++)
	  {
	     a[i]=xyz.nextInt();
	  }
	  System.out.println("Enter values second array");
	   for(int i=0; i<b.length; i++)
	  {
	     b[i]=xyz.nextInt();
	  }
	  if(a.length<=b.length)
	  {
	  //writing merging logics 
	   for(int i=0,k=a.length; i<b.length;k++,i++)
	    {	 //5<5				   
		  if(i<a.length)
		  { c[i]=a[i];
	        
		  }
		  c[k]=b[i];
		  
        }
	  }
	  System.out.println("Display first array");
	  for(int i=0;i<a.length;i++)
	  { System.out.printf("%d\t",a[i]);
	  }
	  System.out.printf("\nDisplay second array\n");
	  for(int i=0;i<b.length;i++)
	  { System.out.printf("%d\t",b[i]);
	  }
	  System.out.println("\nDisplay Merged Array\n");
	  for(int i=0;i<c.length;i++)
	  { System.out.printf("%d\t",c[i]);
	  }
  }
}
