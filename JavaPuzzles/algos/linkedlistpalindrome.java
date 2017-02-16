
import java.util.*;

public class linkedlistpalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n=new Node(1);
		n.add(n,2);
		n.add(n,3);
		n.add(n,4);
		n.add(n,5);
		n.add(n,4);
		n.add(n, 3);
		n.add(n,2);
		n.add(n,1);
		
		
		System.out.println(checklinkpalindrome(n));
		
		
	}
	
	
	static boolean checklinkpalindrome(Node head){
		Stack<Integer> s=new Stack();
		
		Node fast=head;
		Node slow=head;
		
		while(fast!=null&&fast.next!=null){
			
			s.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
			
		}
		if(fast!=null){
			
			slow=slow.next;
		}
		
		while(slow.next!=null){
			
			int top=s.pop().intValue();
			System.out.println("top"+top+" slow "+slow.data);
			if(top!=slow.data){
				
				return false;
				
			}
			slow=slow.next;
		}
		
		return true;
		
	
		
	}
	
	
	
	
	
	

}
