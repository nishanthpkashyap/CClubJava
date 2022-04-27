package partb;

import java.util.Scanner;

public class _3_Rsa
{
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int p=0,q=0,n=0,len=0,phi=0,e=0,d=0,i=0,j=0;
		int encr[]=new int [200];
		int decr[]=new int[200];
		int num[]=new int[200];
		System.out.println("Enter the message :");
		String message = sc.nextLine();
		len = message.length();
		System.out.println("Enter the 2 prime numbers :");
		p=sc.nextInt();
		q=sc.nextInt();
		n=p*q;
		phi=(p-1)*(q-1);
		for(i=2;i<phi;i++)
		{
			if(gcd(i,phi)==1)
			{
				e=i;
				break;
			}
		}
		for(i=2;i<phi;i++)
		{
			if((e*i-1)%phi==0)
			{
				d=i;
				break;
			}
		}
		
		for(i=0;i<len;i++)
		{
			char c=message.charAt(i);
			int a = (int)c;
			num[i]=a-96;
		}
		for(i=0;i<len;i++)
		{
			encr[i]=1;
			for(j=0;j<e;j++)
			{
				encr[i]=(encr[i]*num[i])%n;
			}
		}
		System.out.println("The Encrypted Message is : ");
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
	
	private static int gcd(int m,int n)
	{
		while(n!=0)
		{
			int t = m%n;
			m=n;
			n=t;
		}
		return m;
	}
}