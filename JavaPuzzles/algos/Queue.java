

public class Queue {
	
	Node first,last;
	
	
	void enqueue(int a){
		
		
		if(first==null){
			
			
			last=new Node(a);
			first=last;
		}
		
		else{
			
			last.next=new Node(a);
			last=last.next;
		}
	}
	
	Object dequeue(){
		int x=0;
		if(first==null){return 0;}
		if(first!=null){
			x=first.data;
			first=first.next;
			
		}
		
		return null;
		
	}

}
