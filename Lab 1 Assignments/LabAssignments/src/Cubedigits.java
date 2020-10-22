
import java.util.*;
public class Cubedigits {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	int sum=cubeSum(number);
	 System.out.println("sum of cubes is :"+sum);
	
	}

	
	private static int cubeSum(int number) {
			int sum=0;
			while(number>0)
			{ 				
	  int t= number%10;
	    sum=sum+t*t*t;
	    number = number/10;

		}
	return sum;
	}}
