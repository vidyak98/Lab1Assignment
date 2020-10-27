/*
 * Desc : Second Smallest
 * @Author: Vidya
 */
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
       
      
      int temp;
         for(int i = 0; i<n; i++ ){
         for(int j = i+1; j<n; j++){
            if(array[i]>array[j]){


               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("2nd Smallest element of the array is:: "+array[1]);
   }
}