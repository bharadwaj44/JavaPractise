

class atest{

	
	
	int methoda(){
		
		return 5;
	} 
}


class btest extends atest{
	
	int methoda(){
		
		return 10;
	}
}
public class inhertest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		atest b=new btest();
		
		int a= b.methoda();
		
		System.out.println(a);
		//atest c=new atest();
		
		
		// b=(btest)c;
		
		
		
		
		
	
		
	}

}
