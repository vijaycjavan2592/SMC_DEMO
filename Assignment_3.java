package assignment_1;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*1.    Print, using while loop 
             3  2  1
             3  2
             3
    */			
		System.out.println("Useing While loop -->");
		
		int x = 3 , y = 1;
		
		while(y<=3){
		
		while(x>=y){
			
			System.out.print(" "+x);
			
			x--;
			
		}
		    System.out.print("\n");
		    
		    y++;
		    x=3;
		    		
	}
	
	//-----------------------------------------------------------------------------------------------------------	
		
	/*	2.    Print, using For loop
	           3  2  1
	           2  1
	           1
	 */   
		System.out.println("Useing for loop -->");
		
		for(int i=3 ; i>=1 ; i--){
			
			System.out.println();
			
			for(int j=i ; j>=1 ; j--){
				
				System.out.print(" "+j);
			}
		}
		
	//-----------------------------------------------------------------------------------------------------------
					
	/*    3. Print, using while loop
	          3  2  1
	          2  1
	          1	
	 */
		System.out.println();
		System.out.println("Useing While -->");
		
		int c = 3 , d = 3;
		
		while(d>=1){
				
		while(c>=1){
			
			System.out.print(" "+c);
			c--;
		}
		
		    System.out.println();
		
		    d--;
		    c=d;
		    
		}
		
	//-------------------------------------------------------------------------------------------------------------	
		
	/* 4.    Iterate through 100,  
             Print Grade, marks grater than 90 = A
             Marks greter than 75 = B
             Marks greter than 60 = C
             Marks greter than 45 = D
             Marks less  than 35 = fail.	
	 */
		int s = 45;
		
		if(s>=90){
			
			System.out.println("Grade is A");
		}
		
		else if(s>=75 && s<90){
			
			System.out.println("Grade is B");
		}
		
		else if(s>=60 && s<75){
			System.out.println("Grade is C");
		}
		
		else if(s>=45 && s<60){
			System.out.println("Grade is D");
		}
		
		else if(s>=0 && s<35){
			System.out.println("Grade is Fail");
		}
		
}
}