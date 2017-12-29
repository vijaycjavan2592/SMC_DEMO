package assignment_1;

public class Top2MaxInteger {

	public static void main(String[] args) {
		// find out top 2 maximum integer value out of 10 item and print those.
		
		int[] a = {10,20,50,70,20,100,500,450,900,70};
		
		int temp;
		
		for(int i=0 ; i<a.length ; i++){
			
			for(int j=i ; j<a.length ; j++){
				
				if(a[i]<a[j]){
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				
				}
			
		}
			
		}
		
		System.out.println(a[0] + " " + a[1]);
			

	}

}
