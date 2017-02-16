package intquestions;

public class numtobin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert(25));
		
	}
	
	
	static String convert(int a){
		
		String bin="";
	while(a!=0){
		
		bin=a%2+bin;
		a=a/10;
		
	}
		
		return bin;
	}

}
