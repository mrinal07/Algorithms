package algorithms.Graph;

import java.util.Arrays;

public class Kruskal_Minimum_Spanning_Tree 
{
	int V,E;
	Edge edge[];
	class Edge implements Comparable<Edge>
	{
		int src;
		int des;
		int weight;
		@Override
		public int compareTo(Edge edge) 
		{
			return this.weight - edge.weight;
		}
	}
	
	public Kruskal_Minimum_Spanning_Tree(int v , int e)  
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
	
	private void KruskalMST(Kruskal_Minimum_Spanning_Tree obj) 
	{
		Arrays.sort(edge);
		
		Subset subset[] = new Subset[obj.V];
		for(int i=0 ; i<obj.V ; i++)
		{
			subset[i] = new Subset();
			subset[i].parent = i;
			subset[i].rank=0;
		}	
		
		Edge result[] = new Edge[obj.V-1];
		for(int i=0 ; i<result.length ; i++)
			result[i] = new Edge();
		
		int e=0,j=0;
		while( e < obj.V-1 ) 
		{			
			int x = find(subset,obj.edge[j].src);
			int y = find(subset,obj.edge[j].des);
			
			if( x!=y )
			{
				result[e++] = edge[j];
				union(subset, x, y);
			}
			j++;
		}
		
		for(int i=0 ; i<result.length ; i++)
			System.out.println(result[i].src+" -> "+result[i].des+" = "+result[i].weight);
			
	}
	
	public static void main(String[] args) 
	{
		int v = 4,e=5;
		Kruskal_Minimum_Spanning_Tree graph = new Kruskal_Minimum_Spanning_Tree(v, e);		
		
		// add edge 0-1 
        graph.edge[0].src = 0; 
        graph.edge[0].des = 1; 
        graph.edge[0].weight = 10; 
  
        // add edge 0-2 
        graph.edge[1].src = 0; 
        graph.edge[1].des = 2; 
        graph.edge[1].weight = 6; 
  
        // add edge 0-3 
        graph.edge[2].src = 0; 
        graph.edge[2].des = 3; 
        graph.edge[2].weight = 5; 
  
        // add edge 1-3 
        graph.edge[3].src = 1; 
        graph.edge[3].des = 3; 
        graph.edge[3].weight = 15; 
  
        // add edge 2-3 
        graph.edge[4].src = 2; 
        graph.edge[4].des = 3; 
        graph.edge[4].weight = 4; 
  
        graph.KruskalMST(graph);
		
	}
}
