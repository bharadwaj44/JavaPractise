

public class Node {
	
	Node next=null;
	int data;
	
	
	Node(int d){
		data=d;
	}
	
	void add(Node head,int d){
		Node newnode=new Node(d);
		Node n=this;
		while(n.next!=null){		
			n=n.next;	
			}
		n.next=newnode;
		
		System.out.println("adding "+d);
		//while(head.data!=null){}		
	}
	
	Node delete(Node head,int d){
		
		Node n=head;
		//if(n.next==null)
		
		while(n.next!=null){
			
			if(n.next.data==d){
				
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		System.out.println("deleting "+d);
		return head;
	
	}
	
	public static void main(String[] args){
		
		Node n=new Node(5);
		
		n.add(n,3);
		n.add(n, 4);
		n.add(n,8);
		n.add(n, 15);
		n.add(n,7);
		n.add(n,11);
		
		//n.delete(n,4);
		
		reverse(n);
		
		
	/*	while(n.next!=null){
			System.out.println(n.next.data);
			n=n.next;
		}	*/
	}
	public static void reverse(Node head){
		
		
		if(head.next==null){
			System.out.println(""+head.data);
			return;}
		
		reverse(head.next);
		
		System.out.println(""+head.data);
	}

}
