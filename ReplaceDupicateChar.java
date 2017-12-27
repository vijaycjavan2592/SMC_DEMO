package assignments;

public class Assignment_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 1 – Verify a program to find a duplicate characters from a string. 
		Example if I have string “selenium Demo” then I need to find out “e” duplicate characters from this string and remove those characters from string.
		Atlast I want to see output “Selnium Do”. 
		Removed all duplicate.
		*/
		
		String s = "Selenium Demo";
		
		char ch;
		String ans = "";
		
		for(int i=0 ; i<s.length() ; i++){
			
			ch = s.charAt(i);
			
			if(ch!=' '){
				s = s.replace(ch, ' ');
				ans = ans + ch;
			}
		}
			System.out.println(ans);								
		}
}
