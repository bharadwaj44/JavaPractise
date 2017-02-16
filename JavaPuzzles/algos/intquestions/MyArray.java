package intquestions;

public class MyArray {

	/**
	 * @param args
	 */
	
	static Object[] arr;
	int actsize=0;
	
	
	MyArray(){
		
		
		arr=new Object[10];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MyArray m=new MyArray();
		Object o=new Integer(2);
		Object o1=new Integer(3);
		Object o2=new Integer(4);
		Object o3=new Integer(5);
		Object o4=new Integer(6);
		m.add(o);
		m.add(o1);
		m.add(o2);
		m.add(o3);
		m.add(o4);
		
		m.remove(3);
		
		for(Object ok:arr){
			
			if(ok==null){break;}
			
			System.out.println(ok);
		}
		
	}
	

	
	
	void add(Object o){
		
		
		arr[actsize]=o;
		actsize++;
		
		
	}
	
	void remove(int index){
		int tmp=index;
		while(tmp<actsize){
			
			
			
			arr[tmp]=arr[tmp+1];
			//arr[tmp+1]=null;
			tmp++;
		}
				
		
		
	}
	
	
	

}
