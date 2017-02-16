

public class Queuetest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	


Queue q=new Queue();

q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);



while(q.first.next!=null){
	
	System.out.println(q.first.data);
	q.first=q.first.next;
}
if(q.first.next==null){
	System.out.println(q.first.data);

}


	}

}
