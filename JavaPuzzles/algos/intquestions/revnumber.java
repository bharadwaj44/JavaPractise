package intquestions;

public class revnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rev(122));
	}
	
	static int rev(int a){
	
	int rev=0;
while(a!=0){
	
	
	rev=rev*10+a%10;;
	a=a/10;
	
	
}
	
	return rev;
	
	
	}
	
	
	
	
	

}
