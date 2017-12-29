package assignment_1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Armstrong number
		
		int no = 153;
		
		int arm = 0;
		
		int a , d;

		d=no;
		while(no>0){
		
			a = no % 10;
			no = no/10;
			arm = arm + (a*a*a);
		}	
		if(arm == d){
			
			System.out.println("Armstrong number");
		}
		else
		{		
			
		System.out.println("Not Arm");
		
		}
	}

}
