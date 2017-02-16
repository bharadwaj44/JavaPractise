
public class stringtoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num=	str2int("123");
	
	System.out.println(" "+num);
		
	}
	
	static int str2int(String s){
	
		
		 char ch[] = s.toCharArray();
	        int sum = 0;
	        //get ascii value for zero
	        int zeroAscii = (int)'0';
	        for(char c:ch){
	            int tmpAscii = (int)c;
	            sum = (sum*10)+(tmpAscii-zeroAscii);
	        }
	        return sum;
	    }
	}
	
	


