package assignment_1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		
		boolean isPrime = true;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		//capture the input in an integer
		
		int a = scan.nextInt();
	        scan.close();
		
		for(int i=1 ; i<a/2 ; i++){
			
			temp = a % i;
			
			if(temp == 0){
				
				isPrime = false;
				break;
			}
		}
		if(isPrime==true){
			
			System.out.println("No is Prime Number");
		}
		else{
			System.out.println("Number is not Prime");
		}

	}

}
