package algorithms.Graph;

public class Dijkstra_Shortest_Path
{	
	private int V;	
	
	public Dijkstra_Shortest_Path( int v , int e ) 
	{
		V = v;		
	}
	
	public static void main(String[] args) 
	{
		int v = 5,e = 7;
		Dijkstra_Shortest_Path obj = new Dijkstra_Shortest_Path(v,e);
		
		int graph[][] = { {0,4,8,0,0},
									 {4,0,2,5,0},
									 {8,2,0,5,9},
									 {0,5,5,0,4},
									 {0,0,9,4,0} };
		
		obj.dijkstra(graph);		
	}

	private void dijkstra(int[][] graph) 
	{
				boolean visit[] = new boolean[V];
				int distance[] = new int[V];
				distance[0] = 0; // Source
				for(int i=1 ; i<V ; i++)
					distance[i] = Integer.MAX_VALUE; // Mark every vertex as Infinity
				
				for(int i=0 ; i<V-1 ; i++)
				{
					int mindist = findMinDist(distance,visit);
					visit[mindist] = true;
					
					for(int j=0 ; j<V ; j++)
					{
						if( graph[mindist][j] !=0 && !visit[j]  )
						{
							int totaldist = distance[mindist] + graph[mindist][j];
							if( totaldist < distance[j] )
								distance[j] = totaldist;
						}
					}				
				}
				
				for(int i=0 ; i<V ; i++)
				{
					System.out.println("Vertex "+i+" => "+distance[i]);					
				}				
	}

	private int findMinDist(int[] distance, boolean[] visit) 
	{
		int min = -1; // why we cant use min = distance[0]? because whenever this function is called, 
		                      //  there are some vertexes which are already visited. 
		for(int i=0 ; i<distance.length ; i++)
		{
			if( !visit[i] && ( min == -1 || distance[i] < distance[min] ) )
			{
				min = i; // get its index				
			}			
		}
		
		return min;
	}
	
}