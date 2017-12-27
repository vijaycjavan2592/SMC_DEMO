package assignments;

import java.lang.reflect.Array;

public class FindMaxInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*2 – Suppose we have array of type integer and we have 10 values into array.
		 *  Write a program to find out top 2 maximum integer value out of 10 item and print those.
		 */
		
		int[] a = {10,20,70,40};
		int count;
		
		for(int i=0 ; i<a.length ; i++){
			
			for(int j=i+1 ;j<a.length ; j++){
					//Array.getChar(a, j);	
			if(a[i]<a[j]){
				
				count = a[i];
				a[i] = a[j];
				a[j] = count;
				
			}			
		}
		}		
				System.out.println(a[0] + "   " +a[1] );
				
				System.out.println("Ascending order");
				for(int j=0 ; j<a.length ; j++){
					System.out.println(a[j]);
				}
	}

}
