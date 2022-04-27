package partb;
import java.util.Scanner;
public class leaky 
{
	private static Scanner sc  = new Scanner(System.in);
	public static void main(String []args)
	{
		int time,size,count=0,rate,pack[]=new int[50],i,drop=0,sent;
		System.out.println("Enter the size of bucket :");
		size=sc.nextInt();
		System.out.println("Enter the rate :");
		rate = sc.nextInt();
		System.out.println("Enter the duration :");
		time = sc.nextInt();
		for(i=1;i<=time;i++)
		{
			System.out.println("Packets arriving at "+i+" is : ");
			pack[i]=sc.nextInt();
		}
		System.out.println("TIME | PACKETS RECIVED | PACKETS SENT |PACKETS LEFT | PACKETS DROPPED");
		for(i=1;i<=time;i++)
		{
			count+=pack[i];
			if(count>size)
			{
				drop=count-size;
				count=size;
			}
			System.out.print(i+"\t\t");
			System.out.print(pack[i]+"\t\t");
			sent=min(count,rate);
			System.out.print(sent+"\t\t");
			count-=sent;
			System.out.print(count+"\t\t");
			System.out.print(drop+"\t\t");
			drop=0;
			System.out.println();
		}
		
		while(count>0)
		{
			System.out.print((i++)+"\t\t");
			System.out.print(pack[i]+"\t\t");
			sent=min(count,rate);
			System.out.print(sent+"\t\t");
			count-=sent;
			System.out.print(count+"\t\t");
			System.out.print(drop+"\t\t");
			drop=0;
			System.out.println();
		}
	}
	
	private static int min(int x,int y)
	{
		if(x>y)
		{
			return y;
		}
		return x;
	}
}