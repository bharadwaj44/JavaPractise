

public class compress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compress("aaabbbccc"));
	}
	
	
	
	static String compress(String s){
		
		
		String newstr="";
		char c=s.charAt(0);
		
		int count =1;
		for(int i=1;i<s.length();i++){
			
			if(c==s.charAt(i)){
				
				
				count++;
				
			}
			else{
				newstr+=c+""+count;
				c=s.charAt(i);
				count =1;
				
			}
		}
		newstr+=c+""+count;
		
		return newstr;
	}

}
