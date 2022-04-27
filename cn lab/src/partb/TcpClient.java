package partb;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TcpClient
{
	public static void main(String[] args) throws Exception
	{
		Socket sock = new Socket("localhost",4000);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the file name :");
		String fname = sc.nextLine();
		System.out.println("Enter the destination :");
		String dest = sc.nextLine();
		
		OutputStream output = sock.getOutputStream();
		PrintWriter out = new PrintWriter(output,true);
		out.println(fname);
		
		InputStream input = sock.getInputStream();
		byte b[]=new byte[5000];
		input.read(b,0,b.length);
		
		FileOutputStream fout = new FileOutputStream(dest);
		fout.write(b,0,b.length);
		
		fout.close();
		sc.close();
		sock.close();
		
	}
}