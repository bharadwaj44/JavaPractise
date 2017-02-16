

public class BinarysearchsortedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,3,4,5,6,7,8,9,10};
		
	//	BinTreeNode k=	CreateMinBST(arr);
		
		BinTreeNode k=CreateMinBST(arr);
		
		
		/*BinTreeNode k=new BinTreeNode(7);
		//k.add(k,5);
		k.add(k,1);
		k.add(k,0);
		k.add(k,3);
		k.add(k,2);
		k.add(k,5);
		k.add(k,4);
		k.add(k,6);
		k.add(k,9);
		k.add(k,8);
		k.add(k,10);
		//k.add(k,5);
		
		*/
	inorder(k);
	System.out.println(k.data+" "+k.left.data+" "+k.right.data);
		//preorder(k);
		//postorder(k);
		System.out.println("end");
		
	}
	
	static	BinTreeNode CreateMinBST(int[] a,int start,int end){
		
		
		if(end<start){return null;}	
		
		
		
		int mid=(start+end)/2;
		
		
		BinTreeNode n=new BinTreeNode(a[mid]);
		n.left=CreateMinBST(a,start,mid-1);
		n.right=CreateMinBST(a,mid+1,end);
		
		
		return n;
	}
	

	
	
	
	
	
	static public BinTreeNode CreateMinBST(int[] a){
		
		return 	CreateMinBST(a,0,a.length-1);
			
	}
	
	
	static public  void preorder(BinTreeNode k){
		
		if(k==null){return;}
	System.out.println(k.data);

		preorder(k.left);
		preorder(k.right);
		
		
		
	}
	
	
	
	static void inorder(BinTreeNode root){
		
		if(root==null){
			
			return;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	
	static void postorder(BinTreeNode root){
		
		
		if(root==null){return;}
		inorder(root.left);
		
		inorder(root.right);
		System.out.println(root.data);
	}
	

	}


	
	
	
	

