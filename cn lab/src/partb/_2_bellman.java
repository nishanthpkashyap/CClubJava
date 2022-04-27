package partb;

public class _2_bellman 
{
	private int distance[],noofvertices,max=999;
	public _2_bellman(int noofvertices)
	{
		this.noofvertices=noofvertices;
		distance=new int[noofvertices+1];
	}
	
	
	public void evaluate(int start,int[][] adjmtx)
	{
		int i,source,dest;
		for(i=1;i<=noofvertices;i++)
		{
			distance[i]=max;
		}
		distance[start]=0;
		for(i=1;i<=noofvertices;i++)
		{
			for(source=1;source<=noofvertices;source++)
			{
				for(dest=1;dest<=noofvertices;dest++)
				{
					if(adjmtx[source][dest]!=max)
					{
						if(distance[dest]>distance[source]+adjmtx[source][dest])
						{
							System.out.println(distance[dest]+" is greater than "+distance[source]+" + "+adjmtx[source][dest]+" = "+(distance[source]+adjmtx[source][dest]));
							distance[dest]=distance[source]+adjmtx[source][dest];
						}
					}
				}
			}
			System.out.println("\nThe Distances from source "+start+" after "+i+" iterations is :");
			for(int j=1;j<=noofvertices;j++)
			{
				System.out.print(distance[j]+" ");
			}
			System.out.println();
		}
		for(source=1;source<=noofvertices;source++)
		{
			for(dest=1;dest<=noofvertices;dest++)
			{
				if(adjmtx[source][dest]!=max)
				{
					if(distance[dest]>distance[source]+adjmtx[source][dest])
					{
						System.out.println("The Graph Contains Negative Edge Cycle");
						System.out.println(distance[dest]+" is greater than "+distance[source]+" + "+adjmtx[source][dest]+" = "+(distance[source]+adjmtx[source][dest]));
					}
				}
			}
		}
		
	}


	public void printDistance(int source) 
	{
		System.out.println();
		for(int i=1;i<=noofvertices;i++)
		{
			System.out.println("The Distance from source "+source+" to "+i+" is "+distance[i]);
		}
		
	}
}
