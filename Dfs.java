import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {
	static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> list,int n)
	{
		boolean[] visited=new boolean[n];
		ArrayList<Integer> ans=new ArrayList<Integer>();
		dfsUtil(list,visited,0,n,ans);
		return ans;
	}
	static void dfsUtil(ArrayList<ArrayList<Integer>> list,boolean[] visited,int x,int n,ArrayList<Integer> ans) {
		if(!visited[x]) 
		{
			visited[x]=true;
			ans.add(x);
			for(int i:list.get(x))
			{
				if(!visited[i]) 
				{
					dfsUtil(list,visited,i,n,ans);
				}
			}
		}
	}
	public static void main(String[] srgs)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=3;i++) 
		{
			list.add(new ArrayList<Integer>());
		}
		list.get(0).add(1);
		list.get(0).add(2);
		list.get(1).add(2);
		list.get(2).add(0);
		list.get(2).add(3);
		list.get(3).add(3);
		ArrayList<Integer> ans=dfs(list,4);
		for(int x:ans) {
			System.out.println(x);
		}
	}
}
