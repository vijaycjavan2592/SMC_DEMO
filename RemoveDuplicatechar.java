package assignment_1;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		/*1 – Verify a program to find a duplicate characters from a string. 
		 * Example if I have string “selenium Demo” then I need to find out “e” duplicate characters from this string and remove those characters from string.
		 * Atlast I want to see output “Selnium Do”. Removed all duplicate.
		 */
		
		String str = "Selenium Demo";
		
		char ch;
		String ans = "";
		
		//System.out.println(str.substring(8, 13));
		
		for(int i=0 ; i<str.length() ; i++){
			
			ch = str.charAt(i);
			
			if(ch!=' '){
				
				str = str.replace(ch, ' ');
				
				ans = ans + ch;
							
				
			}			
			
		}		
		System.out.println(ans);

	}
		
}
