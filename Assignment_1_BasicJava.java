package assignment_1;

import java.util.Scanner;

public class Assignment_1_BasicJava {
	
	public static void main(String[] args){
		
		
	//1. Print, You are in KnowledgeWare.
		
		String knowledgeWare = "You are in KnowledgeWare";
		
		System.out.println(knowledgeWare);
		
		
	// 2. Create 8 data types of variable and Print.
		
		byte b = 10;
		
		System.out.println("Value of b is "+b);
		
		short s = 20;
		
		System.out.println("value of s is "+s);
		
		int i = 30;
		
		System.out.println("value of i is "+i);
		
		long l = 40;
		
		System.out.println("value of l is "+l);
		
		float f = 50;
		
		System.out.println("value of f is "+f);
		
		double d = 100.70;
		
		System.out.println("value of d is "+d);
		
		char c = 'a';
		
		System.out.println("value of c is "+c);
		
		boolean bo = true;
		
		System.out.println("value of b is "+bo);
		
	//3. Declare 2 string variable and concatenate & print, they should be space between 2 string.
		
		String a1 = "Delhi is capital of India.";
		
		String b1 = "Mumbai is capital of Maharashtra.";
		
		System.out.println(a1+" "+b1);
		
	// 4.Take 1st number as integer, 2nd number as double, print average. If average is having decimal print decimal else numeric.
	
		int m = 10;
		
		double m1 = 10.50;
		
		double avg = (m+m1)/2;
		
		System.out.println("Average is "+avg);
		
		
	/*5. Print below,
		Distance		                                    Cost
		0 through 100		                                5
		More than 100 but not more than 500            		8
		More than 500 but less than 1,000           		10
		1,000 or more                                		12
	*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the distance");
		double distance = scan.nextInt();
		
		System.out.println("Distance is "+distance);
		
		if(distance <= 100){
			System.out.println("Cost is "+5);
		}
		else if((distance >= 100) && (distance <= 500)){
			System.out.println("Cost is "+ 8);
		}
		else if ((distance >= 500) && (distance <= 1000)){
			System.out.println("Cost is "+10);
		}
		else if(distance >=1000){
			System.out.println("Cost is "+12);
		}
		else{
			System.out.println("Out of coverage");
		}
		
		
	/*6. Print Car Price, Price greter than 90L = Premium

         Price greter than 75L = Platinum

         Price greter than 45L = Gold

         Price less  than 25L = Classic	
	 */
		int car = 3500000;
		
		if(car <= 4500000){
			System.out.println("Car is Classic");
		}
		else if((car >= 4500000) && (car <= 7500000)){
			System.out.println("Car is Gold");
		}
		else if((car >= 7500000) && (car <= 9000000)){
			System.out.println("Car is Platinum");
		}
		else if(car >= 9000000){
			System.out.println("Car is Premium");
		}
		else{
			System.out.println("Car is not good");
		}
		
		/* 7. Integet a = 10, print solution for below statement

                       = a++     +             --a          -              --a          +             ++a

       */
        int a = 10;
		
		System.out.println("a value is "+ a++ +" "+  + --a +" "+  - --a +" "+  + ++a);

		
		
	}

}
