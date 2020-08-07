package algorithms.Graph;

/*We can modify DFS to find Topological Sorting of a graph. 
 * In DFS, we start from a vertex, we first print it and then 
 * recursively call DFS for its adjacent vertices. 
 * In Topological sorting, we use a temporary stack. 
 * We don’t print the vertex immediately, 
 * we first recursively call topological sorting for all its adjacent vertices, 
 * then push it to a stack. 
 * Finally, print contents of stack. 
 * Note that a vertex is pushed to stack only when all of its adjacent vertices 
 * (and their adjacent vertices and so on) are already in stack.
 */

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Search {
	private int size = 0;
	private ArrayList<ArrayList<Integer>> al;
	private static Stack<Integer> stack;
	boolean visit[]; // Prevent loop ( prevent traversing vertexs repeatedly )

	public Topological_Search(int v) {
		size = v;
		al = new ArrayList<ArrayList<Integer>>(size);
		visit = new boolean[size];
		stack = new Stack<Integer>();

		for (int i = 0; i < size; i++)// 2d ArrayList Initialization
			al.add(new ArrayList<Integer>());
	}

	public void addEdge(int u, int v) {
		al.get(u).add(v);
		System.out.println("From point " + u + " -> " + v);
	}

	private void DFS_Traverse_Recur(int root) {
		visit[root] = true;
		// System.out.print(root + " ");

		int i = 0;
		while (i < al.get(root).size()) {
			int n = al.get(root).get(i);
			if (!visit[n]) {
				// System.out.print(root+" "+n+" "); Debugging
				DFS_Traverse_Recur(n);
			}
			i++;
			// System.out.println();
		}
		stack.push(root);
	}

	private void DFS_Traverse() {
		for (int i = 0; i < size; i++) {
			if (!visit[i])
				DFS_Traverse_Recur(i);
		}
	}

	public static void main(String args[]) {
		Topological_Search g = new Topological_Search(6);

		System.out.println("GRAPH");
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("\nTopology Search");

		g.DFS_Traverse();

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

	}
}