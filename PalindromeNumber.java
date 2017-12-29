package assignment_1;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome Number/String
		
		String a = "nitinsdfjhjsdbnf";
		
		String reverse = "" ;
		
		for(int i=a.length()-1 ; i>=0 ; i--){
			
			reverse = reverse + a.charAt(i);
		}
		//System.out.println(reverse);
		
		if(a.equalsIgnoreCase(reverse)){
			
			System.out.println("Given String is Palindrome");
		}
		else{
			
			System.out.println("Given String is not Palindrome");
		}
		

	}
	

}
