package intquestions;

public class Top2Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={3,10,4,11,9};
top2(arr);
	}
	
	
	static void top2(int[] arr){
		
		
		
		int top1=0;
		int top2=0;
		
		
	for(int i:arr){
		
		
		if(i>top1){
			top2=top1;
			
			top1=i;
		}
		else if(i>top2){top2=i;}
	}
	
	System.out.println(""+top1+" "+top2);
	//System.out.println("");
		
	}
	
	static void type2(int arr[]){
		
		
		int top1=0;
		int top2=0;
		
		for(int i:arr){
			
			
			
		}
		
		
	}
		
		
		
	

}
