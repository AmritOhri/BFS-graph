import java.util.Scanner;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
        int edges[][] = new int[V][V];
        
        for(int i = 0;i<E;++i)
        {
            int fv = s.nextInt();
            int sv = s.nextInt();
            
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        
        boolean visited[] = new boolean[edges.length];
        
        print(edges,0,visited);
	}
    
    private static void print(int[][] edges,int si ,boolean[] visited){
        
        Queue<Integer> pn = new LinkedList<>();
        pn.add(si);
        visited[si] = true;
        
        while(!pn.isEmpty())
        {
            int sv = pn.poll();
            
            System.out.print(sv+" ");
            
            for(int i = 0;i<edges.length;++i)
            {
                if(edges[sv][i]==1 && !visited[i])
                {
                    pn.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    private static void printH(int[][] edges,boolean[] visited)
    {
        
        int n = edges.length;
        for(int i =0;i<n;++i)
        {
            if(!visited[i])
            {
                print(edges,i,visited);
            }
        }
    }
}
