package algorithms.Tree;

public class BTree_Convert_DLL 
{
	private static Node root = null,temp=null,head=null;
	public static void main(String[] args) 
	{
		root = new Node(10); 
        root.left = new Node(12); 
        root.right = new Node(15); 
        root.left.left = new Node(25); 
        root.left.right = new Node(30); 
        root.right.left = new Node(36);
                
        recursion(root); // LOGIC
        System.out.println("DOUBLE LINKED LIST");
        displayDLL(head); // DOUBLE LINKED LIST
	}
	
	private static void recursion(Node ptr) 
	{
		if(ptr == null) return;
		
		recursion(ptr.left );
		
		if( head == null )
		{
			head = ptr;
			temp = head;
		}
		else
		{
			ptr.left = temp;
			temp.right = ptr;
			
			temp = ptr;
		}
		recursion(ptr.right);
	}
	
	public static void displayDLL(Node root)
	{
		Node ptr = root;
		while(ptr != null)
		 {
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}
	}
	
}
