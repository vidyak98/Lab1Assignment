/*
 * Desc : remove duplicate elements
 * @Author: Vidya
 */

import java.util.*;
public class DuplicateExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size: ");
		size=sc.nextInt();
		int array[]= new int[size];
		System.out.println("Enter the numbers: ");
		for(int i=0; i< size; i++) {
			array[i]=sc.nextInt();
		}
		
		int resultArray[] = modifyArray(array);
		for(int i=0; i< resultArray.length;i++) {
			System.out.println(resultArray[i]+" ");
		}
		
	}
	
	private static int[] modifyArray(int[] array) {
		int length = array.length;
		// comparing each element with other elements
		for(int i=0; i<length; i++) {
			for( int j= i+1; j< length; j++) {
				if(array[i]==array[j]) {
					array[j] = array[length-1];
					length--;
					j--;
							
				}
			}
		}
		
		int array1[]=Arrays.copyOf(array, length);//new array to copy unique elements in original array
		int temp; // sorting array in descending order
		for(int i=0; i< array1.length-1; i++) {
			
			if(array1[i]<array[i+1]) {
				temp = array1[i+1];
					array[i+1] = array1[i];
					array1[i]=temp;
				}
			}
			return array1;
		}

	}
