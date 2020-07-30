package algorithms.Tree;

public class Find_nth_Node_In_BST 
{
	static Node root = null;
	static int count=0;
	public static void main(String[] args) 
	{
		createTree();
		show(root);
		System.out.println();
		
		findNthNode(3);		
	}
	
	private static void findNthNode(int i) 
	{		
	   inorder(root,i);				
	}

	private static void inorder(Node root,int n) 
	{			
		if( root == null )return;		
		
		inorder( root.left,n);
		count++;
			
		if(count == n )System.out.println(root.data);

		inorder( root.right,n);			
	}

	private static void createTree() 
	{
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
				
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);		
	}
	
	private static void show(Node ptr) 
	{
		if(ptr == null) return;
		
		show(ptr.left);
		System.out.print(ptr.data+" ");
		show(ptr.right);		
	}

}
