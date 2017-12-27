package assignments;

public class Assignment_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Print, 2, 4, 6, 8, 10 using while loop.
		
				int a = 2;
				
				while(a<=10){
					
					System.out.println(a);
					
					a=a+2;
				}

			//2.Implement logic for Fibonacci series. 1, 1, 2, 3, 5….. till 100 numbers and print output.

                int a1 = 0, a2 = 1, a3 , count = 12;
				
                System.out.println("Fibonacci series is ");
                
				for(int k=2 ; k<count ; k++){
					
					a3 = a1 + a2;
					System.out.println(a3);
					
					a1=a2;
					a2=a3;
				}
				
				
			/* 3.Print, using For loop
			    3  2  1
			    3  2
			    3
			*/	
				
				for(int i=1; i<=3 ; i++){
					
					System.out.println();
					
					for(int j=3 ; j>=i ; j--){
						
						System.out.print(" "+j);
					}
				}
				
				
				
				
			}

}
