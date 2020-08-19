
import java.util.*;

public class SSSP {
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static boolean[] visited=new boolean[100];
	static int[] path=new int[100];
	
	static void shortestPath(int i,int val)
	{
		if(!visited[i]) 
		{
			visited[i]=true;
			path[i]=val;
			for(int x : list.get(i)) 
				shortestPath(x,val+1);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		
		for(int i=0;i<=n;i++)
			list.add(i,new ArrayList<Integer>());
		
		for(int i=0;i<e;i++) 
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			list.get(a).add(b);
		}
		
		shortestPath(1,0);
		
		for(int i=1;i<=n;i++){
			System.out.print(path[i]+" ");
		}
	}
}
