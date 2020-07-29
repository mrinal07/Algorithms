package algorithms.Tree;

// SIZE == NUMBER OF NODES

public class SizeOfTree 
{	
	static Node root = null;
	public static void main(String[] args) 
	{
		createTree();
		show(root);
		System.out.println();
		System.out.println( ( findSize(root) != 0 )? findSize(root) :  "EMPTY TREE" );
	}
	private static int findSize(Node ptr) 
	{
		if( ptr == null ) return 0;		
		
		return ( findSize(ptr.left) + 1 +  findSize(ptr.right) );
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
