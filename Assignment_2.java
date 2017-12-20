package assignment_1;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1.Print, 2, 4, 6, 8, 10 using while loop.
		
		int a = 2;
		
		while(a<=10){
			
			System.out.println(a);
			
			a=a+2;
		}

	//2.Implement logic for Fibonacci series. 1, 1, 2, 3, 5….. till 100 numbers and print output.

		int n1 = 0 , n2 = 1 ,n3 , count = 12;
		
		for(int k=2 ; k<count ; k++){
			
			n3 = n1 + n2; 
			
			System.out.println("Fibonacci series is "+n3);
						
			n1 = n2;  
			n2 = n3;  
		}

			
	/* 3.Print, using For loop
	    3  2  1
	    3  2
	    3
	*/	
		
		for(int i=3 ; i>=1 ; i--){
			
			System.out.println();
			
			for(int j=i ; j>=1 ;j--){
				
				System.out.print(" "+j);
			}
		}
		
		
		
		
	}

}
