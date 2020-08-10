package algorithms.Graph;

import algorithms.Graph.Cycle_In_UndirectedGraph_Union.Edge;

public class Cycle_In_UndirectedGraph_PathCompresion 
{
	int V,E;
	Edge edge[];
	class Edge
	{
		int src;
		int des;
	}
	
	public Cycle_In_UndirectedGraph_PathCompresion( int v , int e ) 
	{
		V = v;
		E = e;
		edge = new Edge[e]; // initialize our collections of edges
		for(int i=0 ; i<e ; i++)
			edge[i] = new Edge();
	}
	
	class Subset
	{
		int parent;
		int rank;
	}
	
	private int find(Subset[] subset, int i) 
	{
		if( subset[i].parent != i ) // Similar to union method where we compare with -1
			return find(subset , subset[i].parent ); // recur to find its parent
		
		return i; // else return this number
	}
	
	private void union(Subset[] subset, int x, int y) 
	{
		int xset = find(subset,x); // same to
		int yset = find(subset,y); // union method
		
		if( subset[xset].rank < subset[yset].rank ) // make yset as parent of xset
		{
			subset[xset].parent = yset;
		}
		else if( subset[xset].rank > subset[yset].rank ) // make xset as parent of yset
		{
			subset[yset].parent = xset;
		}
		else
		{
			subset[xset].parent = yset; // make anyone parent and increment its rank by 1
			subset[yset].rank++;
		}		
	}
	
	private int checkCyclic(Cycle_In_UndirectedGraph_PathCompresion obj) 
	{
		Subset subset[] = new Subset[obj.V];
		
		for(int i=0 ; i<obj.V ; i++)
		{
			subset[i] = new Subset();
			subset[i].parent = i; // All vertexes points it itself as parent
			subset[i].rank=0; // Rank of every vertex is 0
		}
		
		for( int i=0 ; i<obj.E ; i++ )
		{
			int x = find(subset,obj.edge[i].src);
			int y = find(subset,obj.edge[i].des);
			
			if( x==y )return 1;
			
			union( subset , x ,y );
		}				
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int vertex = 4,edge=3;
		Cycle_In_UndirectedGraph_PathCompresion obj = new Cycle_In_UndirectedGraph_PathCompresion(vertex,edge);
		
		obj.edge[0].src = 0;
		obj.edge[0].des = 1;
		
		obj.edge[1].src = 1;
		obj.edge[1].des = 2;
		
		 obj.edge[2].src = 2; 
	     obj.edge[2].des = 3;
	     
		System.out.println( (obj.checkCyclic(obj) == 1)? "Cycle found" : "No Cycle found" );
	}	
}
