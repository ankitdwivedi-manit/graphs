import java.util.ArrayList;

public class CycleDetection {
	static boolean dfs(ArrayList<ArrayList<Integer>> list,int node,int par,boolean[] visited) 
	{
		visited[node]=true;
		for(int child : list.get(node)) 
		{
			if(!visited[child])
			{
				if(dfs(list,child,node,visited)==true) 
				{
					return true;
				}
			}
			else if(child!=par)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		boolean[] visited=new boolean[5];
		for(int i=0;i<=4;i++) 
		{
			list.add(i,new ArrayList<Integer>());
		}
		list.get(1).add(2);
		list.get(2).add(1);
		list.get(2).add(3);
		list.get(2).add(4);
		list.get(3).add(2);
		list.get(4).add(2);
		System.out.println(dfs(list,1,0,visited));
	}
}
