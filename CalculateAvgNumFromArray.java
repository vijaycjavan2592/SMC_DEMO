package assignment_1;

public class CalculateAvgNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {100,200,100,100,500};
		
		int total = 0;
		
		for(int i=0 ; i<arr.length ; i++){
			
			total = total + arr[i];
		}
		
		int avg = total/arr.length;
		
		System.out.println("Average is "+ avg);

	}

}
