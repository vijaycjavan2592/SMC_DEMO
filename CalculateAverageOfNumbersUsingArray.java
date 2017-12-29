package assignment_1;

import java.util.Scanner;

public class CalculateAverageOfNumbersUsingArray {

	public static void main(String[] args) {
		
	// Calculate Average Of Numbers Using Array		
		
		int[] a = {10,10,10};
		
		int avg , sum = 0;
		
		for(int i=0 ; i<a.length ; i++){
			
			sum = sum + a[i];
		}
		
		avg = sum / a.length;
		
		System.out.println("Average is "+avg);		

	}
	
}
