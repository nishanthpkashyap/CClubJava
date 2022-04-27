package partb;

import java.util.*;
public class crc
{
	private static Scanner sc = new Scanner(System.in);
	
	private static void div(int a[],int k)
	{
		int d[]= {1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1};
		int count=0,i,j;
		for(i=0;i<k;i++)
		{
			if(a[i]==d[0])
			{
				for(j=i;j<(17+i);j++)
				{
					a[j]=a[j]^d[count++];
				}
			}
			count=0;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int a[]=new int[100],b[]=new int[100],i,len,k;
		System.out.println("Enter the length :");
		len=sc.nextInt();
		System.out.println("Enter the message :");
		for(i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<16;i++)
		{
			a[len++]=0;
		}
		
		k=len-16;
		
		for(i=0;i<len;i++)
		{
			b[i]=a[i];
		}
		
		div(a,k);
		for(i=0;i<len;i++)
		{
			a[i]=a[i]^b[i];
		}
		
		System.out.println("Data to be sent :");
		for(i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nData Recieved :");
		for(i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		
		div(a,k);
		for(i=0;i<len;i++)
		{
			if(a[i]!=0)
			{
				System.out.println("ERROR !!");
				return;
			}
		}
		System.out.println("NO ERROR !!");
	}
}
