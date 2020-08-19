import java.util.*;
public class Bfs {
	static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> list,int n)
	{
		Queue<Integer> queue=new LinkedList<>();
		ArrayList<Integer> res=new ArrayList<>();
		boolean[] visited=new boolean[n+1];
		visited[0]=true;
		queue.offer(0);
		while(!queue.isEmpty()) 
		{
			int temp=queue.poll();
			res.add(temp);
			for(int item : list.get(temp)) 
			{
				if(!visited[item]) 
				{
					visited[item]=true;
					queue.offer(item);
				}
			}
		}
		return res;
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
		ArrayList<Integer> ans=bfs(list,4);
		for(int x:ans) {
			System.out.println(x);
		}
	}
	
}
