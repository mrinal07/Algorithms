package algorithms.Graph;

import java.util.Arrays;

/*
 Disjoint Set (Or Union-Find) 
 Detect Cycle in an Undirected Graph
 */
public class Cycle_In_UndirectedGraph_Union 
{
	int V,E;
	Edge edge[];
	class Edge
	{
		int src;
		int des;
	}
	
	public Cycle_In_UndirectedGraph_Union( int v , int e ) 
	{
		V = v;
		E = e;
		edge = new Edge[e]; // initialize our collections of edges
		for(int i=0 ; i<e ; i++)
			edge[i] = new Edge();
	}
	
	private int find(int[] arr, int src) 
	{
		if( arr[src] == -1 )
			return src;
		
		return find(arr,arr[src]);
	}
	
	private void union(int[] arr, int x, int y) 
	{
		int xset = find(arr,x);
		int yset = find(arr,y);
		
		arr[xset] = yset;
	}
	
	private void isCyclic(int[] arr, Cycle_In_UndirectedGraph_Union obj) 
	{
		for(int i=0 ; i<obj.E ; i++)
		{
			int x = find(arr,obj.edge[i].src);
			int y = find(arr,obj.edge[i].des);
			
			if(x==y)
			{
				System.out.println("Cycle found");
				return;
			}
			obj.union(arr,x,y);			
		}
	}	

	private void checkCyclic( Cycle_In_UndirectedGraph_Union obj ) 
	{
		int arr[] = new int[V];
		Arrays.fill(arr, -1);
		
		isCyclic( arr , obj);
	}
	
	public static void main(String[] args) 
	{
		int vertex = 3,edge=3;
		Cycle_In_UndirectedGraph_Union obj = new Cycle_In_UndirectedGraph_Union(vertex,edge);
		
		obj.edge[0].src = 0;
		obj.edge[0].des = 1;
		
		obj.edge[1].src = 1;
		obj.edge[1].des = 2;
		
		 obj.edge[2].src = 0; 
	     obj.edge[2].des = 2; 
		
		obj.checkCyclic(obj);
	}	
}
