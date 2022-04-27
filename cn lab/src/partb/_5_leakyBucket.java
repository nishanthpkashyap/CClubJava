package partb;

import java.util.Scanner;

public class _5_leakyBucket 
{
	static int min(int x,int y)
	{
		if(x<y)
			return x;
		else
			return y;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{ 
		int drop=0,mini=0,nsec=0,cap=0,count=0,i,process=0;
		int inp[]=new int[25];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Bucket Size");
		cap= sc.nextInt();
		System.out.println("Enter The Operation Rate");
		process= sc.nextInt();
		System.out.println("Enter The No. Of Seconds You Want To Stimulate");
		nsec=sc.nextInt();
		for(i=0;i<nsec;i++)
		{ 
			System.out.print("Enter The Size Of The Packet Entering At "+ (i+1) + " sec:\n");
			inp[i] = sc.nextInt();
		}
		System.out.println("\nSecond | Packet Recieved | Packet Sent | Packet Left |Packet Dropped|\n");
		for(i=0;i<nsec;i++)
		{ 
			count+=inp[i];
			if(count>cap)
			{ 
				drop=count-cap;
				count=cap;
			}
			System.out.print("  "+(i+1));
			System.out.print("\t\t"+inp[i]);
			mini=min(count,process);
			System.out.print("\t\t"+mini);
			count=count-mini;
			System.out.print("\t\t"+count);
			System.out.print("\t\t"+drop);
			drop=0;
			System.out.println();
		}
		for(;count!=0;i++)
		{
			if(count>cap)
			{
				drop=count-cap;
				count=cap;
			}
			System.out.print("  "+(i+1));
			System.out.print("\t\t0");
			mini=min(count,process);
			System.out.print("\t\t"+mini);
			count=count-mini;
			System.out.print("\t\t"+count);
			System.out.print("\t\t"+drop);
			System.out.println();
		}
		sc.close();
	}
}