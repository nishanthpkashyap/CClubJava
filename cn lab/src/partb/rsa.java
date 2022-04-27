package partb;

import java.util.Scanner;

public class rsa
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int encr[]=new int[100],num[]=new int[100],decr[]=new int[100],i,j,e=0,d=0,len,p,q,n,phi;
		System.out.println("Enter the message :");
		String m = sc.nextLine();
		len = m.length();
		System.out.println("Enter 2 prime numbers :");
		p=sc.nextInt();
		q=sc.nextInt();
		n=p*q;
		phi=(p-1)*(q-1);
		
		for(i=0;i<phi;i++)
		{
			if(gcd(i,phi)==1)
			{
				e=i;
				break;
			}
		}
		
		for(i=0;i<phi;i++)
		{
			if((e*i-1)%phi==0)
			{
				d=i;
				break;
			}
		}
		
		for(i=0;i<len;i++)
		{
			char c =m.charAt(i);
			num[i]=c-96;
		}
		
		for(i=0;i<len;i++)
		{
			encr[i]=1;
			for(j=0;j<e;j++)
			{
				encr[i]=(encr[i]*num[i])%n;
			}
		}
		System.out.println("The Encrypted Message is :");
		for(i=0;i<len;i++)
		{
			System.out.print(encr[i]);
		}
		
		for(i=0;i<len;i++)
		{
			decr[i]=1;
			for(j=0;j<d;j++)
			{
				decr[i]=(decr[i]*encr[i])%n;
			}
		}
		
		
		System.out.println("\nThe Decrypted Message is :");
		for(i=0;i<len;i++)
		{
			System.out.print((char)(decr[i]+96));
		}
	}
	
	private static int gcd(int x,int y)
	{
		while(y>0)
		{
			int r = x%y;
			x=y;
			y=r;
		}
		return x;
	}
}