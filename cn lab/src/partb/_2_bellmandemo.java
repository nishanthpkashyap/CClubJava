package partb;

import java.util.Scanner;

public class _2_bellmandemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start,noofvertices;
		int adjmtx[][];
		System.out.println("Enter the number of vertices:");
		noofvertices=sc.nextInt();
		System.out.println("Enter the source node:");
		start = sc.nextInt();
		adjmtx=getMatrix(noofvertices);
		_2_bellman obj =new _2_bellman(noofvertices);
		obj.evaluate(start,adjmtx);
		obj.printDistance(start);
		sc.close();
	}

	private static int[][] getMatrix(int noofvertices) 
	{
		Scanner scanner = new Scanner(System.in);
		int adjmtx[][] = new int [noofvertices+1][noofvertices+1];
		System.out.println("Enter the Matrix:");
		for(int i=1;i<=noofvertices;i++)
		{
			for(int j=1;j<=noofvertices;j++)
			{
				adjmtx[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		return adjmtx;
	}

}
/*
0 6 4 5 999 999
999 0 999 999 -1 999
999 -2 0 999 3 999
999 999 -2 0 999 -1
999 999 999 999 0 3
999 999 999 999 999 0
*/