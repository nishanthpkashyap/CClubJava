package partb;

public class Bellman 
{
	private int dis[],i,s,d,max=999,v;
	public Bellman(int v) 
	{
		this.v=v;
		dis=new int[v+1];
	}
	public void calc(int st, int[][] a) 
	{
		for(i=1;i<=v;i++)
		{
			dis[i]=max;
		}
		dis[st]=0;
		for(i=1;i<=v;i++)
		{
			for(s=1;s<=v;s++)
			{
				for(d=1;d<=v;d++)
				{
					if(a[s][d]!=max)
					{
						if(dis[d]>dis[s]+a[s][d])
						{
							System.out.println(dis[d]+" is greater than "+dis[s]+" + "+a[s][d]+" = "+(dis[s]+a[s][d]));
							dis[d]=dis[s]+a[s][d];
						}
					}
				}
			}
			System.out.println("The Distances from "+i+" are :");
			for(s=1;s<=v;s++)
			{
				System.out.print(dis[s]+" ");
			}
			System.out.println();
			
		}
		for(s=1;s<=v;s++)
		{
			for(d=1;d<=v;d++)
			{
				if(a[s][d]!=max)
				{
					if(dis[d]>dis[s]+a[s][d])
					{
						System.out.println("This Graph contains negetive edge cycle !!");
						System.out.println(dis[d]+" is greater than "+dis[s]+" + "+a[s][d]+" = "+(dis[s]+a[s][d]));
					}
				}
			}
		}
	}
	public void printMatrix(int s2) 
	{
		int i;
		for(i=1;i<=v;i++)
		{
			System.out.println("The distance from node "+s2+" to "+i+" is :"+dis[i]);
		}
		
		
	}
	
}
