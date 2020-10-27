import java.util.Scanner;  
public class SecondSmallest{
   public static void main(String args[]){
	   
	   int n;
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter no. of elements you want in array:");
       n = sc.nextInt();
       int array[] = new int[n];
       System.out.println("Enter all the elements:");
       for(int i=0; i<n; i++)  
       {           
       array[i]=sc.nextInt();  
       }  
   }
}
