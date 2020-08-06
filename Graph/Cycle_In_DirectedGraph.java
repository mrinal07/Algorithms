package algorithms.Graph;

import java.util.Arrays;
import java.util.LinkedList;

public class Cycle_In_DirectedGraph
{
	private LinkedList<LinkedList<Integer>> list;
	private boolean visit[];
	private boolean restack[];
	private int vertex=0;
	
	public Cycle_In_DirectedGraph(int v) 
	{	
		vertex = v;
		list = new LinkedList<LinkedList<Integer>>();		
		visit = new boolean[v];
		restack = new boolean[v];
		
		for(int i=0 ; i<v ; i++)
			list.add( new LinkedList<Integer>() );
	}
	
	private void addEdge(int x, int y) 
	{		
		list.get(x).add(y);		
	}
	
	private boolean checkCycle(int node) 
	{	
		if( restack[node] )return true;
		if( visit[node] )return false;
		
		visit[node] = true;
		restack[node] = true;
		//System.out.print(node+" ");		
		
		int i=0 ;
		while( i < list.get(node).size() )
		{
			int n = list.get(node).get(i);			
				boolean check = checkCycle(n);
				//System.out.print(check+" ");
				if(check)return true;
			i++;
		}
		restack[node] = false;
		//System.out.print(restack[node]+" ");
		return false;
	}
	
	private boolean containsCycle() 
	{
		for(int i=0 ; i<vertex ; i++)
		{
			boolean check = checkCycle(i);
			if(check)
				return true;				
		}		     
		return false;
	}

	public static void main(String[] args) 
	{
		Cycle_In_DirectedGraph graph = new Cycle_In_DirectedGraph(5);
		graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3);
       
        if( graph.containsCycle() )
        {
        	System.out.println("Cycle is founded in directed graph");
        }
        else
        {
        	System.out.println("No Cycle is founded in directed graph");
        }
	}	
}
