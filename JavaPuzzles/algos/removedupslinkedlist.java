


public class removedupslinkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n=new Node(1);
		n.add(n,3);
		
		n.add(n,5);
		n.add(n,7);
		n.add(n,11);
		n.add(n,5);
		n.add(n,8);
		
		nthtolast(n,3);
		//removedups(n);
		while(n.next!=null){
			System.out.println(n.next.data);
			n=n.next;
		}
		
	}
	
	static void removedups(Node n){
		Node curr=n;
		
		
		
		while(curr!=null){
			Node mov=curr;
		   while(mov.next!=null){
			   
			   if(mov.next.data==curr.data){
				   
				   mov.next=mov.next.next;
			   }
			   
			   mov=mov.next;
		   }
			curr=curr.next;
		}
		
		
		
	}
	
	
	static int nthtolast(Node n,int k){
		
		if(n.next==null){
			
			return 0;
		}
		int i=1;
		 i=nthtolast(n.next,k)+1;
		if(i==k){		System.out.println(" last but "+k+" is"+n.data+" "+i);
}
		//
		return i;
	}
	
	
	

}
