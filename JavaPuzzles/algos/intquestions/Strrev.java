package intquestions;

public class Strrev {

	/**
	 * @param args
	 */
	
	
	static String reverse="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rev("hello"));
	}
	
	
	static String rev(String s){
		
		if(s.length()==1){
			
			return s;
		}
		
	reverse =s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
		
		
		
		
		return reverse;
	}

}


