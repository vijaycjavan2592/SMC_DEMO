package assignment_1;

public class FactorialNumber {

	public static void main(String[] args) {
		// find out the factorial of a number 
		
		int a = 4;
		
		int fact = 1;
		
		for(int i=1 ; i<=a ;i++){
			
			fact = fact * i;
			
		}
		System.out.println("Factorial of number "+a +" is "+fact);

	}

}
