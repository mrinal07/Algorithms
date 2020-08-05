package algorithms.Graph;

import java.util.LinkedList;

public class Find_All_Nodes_Btwn_2_Vertices 
{	 
		private int V;
		 
		private LinkedList<LinkedList<Integer>> adj;
		
		public Find_All_Nodes_Btwn_2_Vertices(int v)  
		{ 
			V = v; 
			adj = new LinkedList<LinkedList<Integer>>(); 
			for (int i = 0; i < v; ++i) 
				adj.add( new LinkedList<Integer>() ); 
		}
 
		void addEdge(int v, int w) 
		{ 			
			adj.get(v).add(w);
		}
		 
		int countPaths(int u, int d, int pathCount) 
		{ 
			// If current vertex is same as destination, then increment count
			if (u == d)pathCount++;			
			// Recur for all the vertices 
			// adjacent to this vertex 
			else { 
				//System.out.println(u+"u"); // Debugging
				int i=0; 
				while (i < adj.get(u).size() ) 
				{ 
					int n = adj.get(u).get(i) ; 
					//System.out.print(n+" "); // Debugging
					pathCount = countPaths(n, d, pathCount); // assign paths count to pathCount variable
					i++;
				} 
				//System.out.println(); // Debugging
			} 
			return pathCount; 
		}
		
		public static void main(String args[]) 
		{ 
			Find_All_Nodes_Btwn_2_Vertices g = new Find_All_Nodes_Btwn_2_Vertices(5); 
			g.addEdge(0, 1); 
			g.addEdge(0, 2); 
			g.addEdge(0, 3); 
			g.addEdge(1, 3); 
			g.addEdge(2, 3); 
			g.addEdge(1, 4); 
			g.addEdge(2, 4); 

			int s = 0, d = 3;			
			System.out.println("Number of paths => "+g.countPaths(s, d,0)); 
		} 
	}