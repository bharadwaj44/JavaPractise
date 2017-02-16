
public class top2array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={3,5,11,55,1,44,36};
		
		top2(arr);
		
		
	}

	
	static void top2(int[] a){
		
		int top1=0;
		int top2=0;
		int temp=0;
		for(int i:a){
			
			if(top1<i){
				
				top2=top1;
				top1=i;
			}
			else if(top2<i){
				top2=i;
			}
			
		}
		System.out.println(""+top1+" top2"+top2);
		
		
		
	}
}
