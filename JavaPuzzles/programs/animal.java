

 class kang{
public  void display(){
		
		System.out.println("animal");
		
	}
	
}

public class animal  extends kang{

	
	
	
	public static void main(){
		
		animal a=new animal();
		a.display();
		
		
	}
}

class cat extends animal{}

class dog extends animal{
	
	
}
