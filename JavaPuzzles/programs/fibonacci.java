
public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fibmax=15;
		
		int[] i=new int[fibmax];
		
	     i[0]=0;
	     i[1]=1;
	     for(int k=2;k<i.length;k++){
	    	 
	    	 i[k]=i[k-1]+i[k-2];
	    	 
	     }
	    
		for(int m:i){
			
			
			System.out.println(m);
		}
		
	}
	
	
	
	

}
