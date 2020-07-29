package algorithms.Tree;

// DEPTH OF BST == LONGEST PATH BETWEEN ROOT AND LEAF NODE

public class Depth_Of_BST_Tree 
{
	private static Node root = null;
	private static int ans=0;
	public static void main(String[] args) 
	{
		createTree();
		show(root);
		System.out.println();
		System.out.println( ( findDepth(root,1) != 0 )? findDepth(root,1) :  "EMPTY TREE" );		
	}
	
	private static int findDepth(Node ptr,int count)
	{
		if( ptr == null ) return 0;
		
		if( ptr.left == null && ptr.right == null ) ans = Math.max(ans,count);
		
		findDepth(ptr.left , count+1);
		
		findDepth(ptr.right , count+1);
		
		return ans;		
	}

	private static void createTree() 
	{
		root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
				
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left.left = new Node(1);
	}
	
	private static void show(Node ptr) 
	{
		if(ptr == null) return;
		
		show(ptr.left);
		System.out.print(ptr.data+" ");
		show(ptr.right);		
	}
}
