import java.util.Scanner;
import java.util.ArrayList;

public class Bipartite {
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int[] visited=new int[100];
	static int[] color=new int[100];
	static boolean isBipartite(int v,int c){
		visited[v]=1;
		color[v]=c;
		for(int child : list.get(v)) 
		{
			if(visited[child]==0)
			{
				if(isBipartite(child,c^1)==false)
					return false;
			}
			else if(color[child]==color[v]) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			list.add(i,new ArrayList<Integer>());
		}
		int e=sc.nextInt();
		for(int i=0;i<e;i++) 
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			list.get(a).add(b);
		}
		System.out.println(isBipartite(1,0));
		
	}
}
