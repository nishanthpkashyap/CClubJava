package partb;

import java.util.Scanner;

public class BellmanDemo 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int v,s,a[][];
		System.out.println("Enter the number of vertices :");
		v=sc.nextInt();
		a=getMatrix(v);
		System.out.println("Enter the Starting Vertex :");
		s=sc.nextInt();
		Bellman obj = new Bellman(v);
		obj.calc(s,a);
		obj.printMatrix(s);
	}

	private static int[][] getMatrix(int v) 
	{
		int a[][]=new int[v+1][v+1],i,j;
		System.out.println("Enter the Adjacency matrix :");
		for(i=1;i<=v;i++)
		{
			for(j=1;j<=v;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
}
