package assignment_1;

import java.lang.reflect.Array;

public class Top2SmallInteger {

	public static void main(String[] args) {
		// find out top 2 least/smaller integer value out of 10 item and print those.
		
		int[] num = {10,50,80,60};
		
		int temp;
			
		for(int i=0 ; i<num.length ; i++){
			
			for(int j=i ; j<num.length ; j++){
				
				if(num[i]>num[j]){
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
			}
			
		}
		System.out.println(num[0] + " " +num[1]);

	}

}
