
public class sumofdigits {

	/**
	 * @param args
	 */
	static int  sum=0;
	
	static int getsum(int i){
		if(i==0){return 0;}
		
		
		
		sum+=i%10;
		getsum(i/10);
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		int k=getsum(num);
		System.out.println(k);
		
		
	}
	
	
	

}
