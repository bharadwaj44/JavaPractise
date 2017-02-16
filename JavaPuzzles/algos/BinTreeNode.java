

public class BinTreeNode {

	
	int data;
	BinTreeNode left;
	BinTreeNode right;
	
	
	BinTreeNode(int n){
		
		
		this.data=n;
		System.out.println("inserted"+n);	
	}
	
	public String toString(){
		
		
		return String.valueOf(this.data);
		
	}
	
	public BinTreeNode add(BinTreeNode root,int value){
		
		if(root==null){
			root=new BinTreeNode(value);
			}
	
		else if(root.data>value){
			 root.left=add(root.left,value);
		}
		else if(root.data<value){root.right=add(root.right,value);}
		
		
		return root;
		
	}
	
}
