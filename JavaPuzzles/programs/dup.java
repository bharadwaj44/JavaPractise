
public class dup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
	        removeDuplicates(input1);
	        
	       
	}
	
	static void removeDuplicates(int[] arr){
		int i=0;
		int j=arr.length-1;
		int counter=0;
		int[] newarr=new int[arr.length];
		while(i<j){
			
			
			if(arr[i]!=arr[i+1]){
				
				newarr[counter]=arr[i];
				
				counter++;
			}
			i++;
		}
		
		for(int k:newarr){System.out.println(k);}
	}

}
