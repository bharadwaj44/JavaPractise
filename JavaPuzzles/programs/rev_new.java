

public class rev_new {

	/**
	 * @param args
	 */
	static String reverse="";
	
	static String rev(String s){
		if(s.length()==1){
			
			return s;
		}
		
		else{ reverse+=s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
		
		return reverse;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s=	rev("hello");
		
		System.out.println(s);
		
	}
	
	
	
	

}
