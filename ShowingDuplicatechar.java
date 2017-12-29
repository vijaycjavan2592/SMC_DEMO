package assignment_1;

public class ShowingDuplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String st = new String("vijayva");
		   
		 //System.out.println(st);
		 
		 boolean found = false;
		 
		 String output = new String();
		 
		 for(int i=0 ; i<st.length() ; i++){
			 
			 for(int j=0 ; j<output.length() ; j++){
				 
				 if(st.charAt(i) == output.charAt(j)){
		
					 found = true;
					 break;
				 }
			 }
			 if(found==false) {
				 
				 output = output.concat(String.valueOf(st.charAt(i)));

				 output = output ;
				 
			 }
		 }
			 System.out.println(output);
		 }
		   

	

}
