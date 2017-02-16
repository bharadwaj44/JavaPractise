

public class strrev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rev("hello"));
		System.out.println(rev3("hello"));
	}
	
	
	static String rev(String s){
		
		
		if(s.length()==1){return s;}
	
		String rev1=s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
		
		
		return rev1;
	}
	
	
	
	
	
	static String rev3(String s){
		
		String rev1="";
		
		for(int i=s.length()-1;i>=0;i--){
			
			
		rev1+=s.charAt(i);
		}
		return rev1;
		
	}

}
