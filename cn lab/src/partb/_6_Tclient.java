package partb;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class _6_Tclient
{ 
	public static void main( String args[ ] ) throws Exception
        {
			Socket sock = new Socket("localhost",4000);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name :");
			String fname= sc.nextLine();
			
			System.out.println("Enter the Destination :");
			String des = sc.nextLine();
			
			OutputStream output = sock.getOutputStream();
			PrintWriter out = new PrintWriter(output,true);
			out.println(fname);
			
			InputStream input = sock.getInputStream();
			byte b[]=new byte[1000];
			input.read(b,0,b.length);
			
			FileOutputStream fout = new FileOutputStream(des);
			fout.write(b,0,b.length);

			System.out.println("File Transfered...");
			fout.close();
			sc.close();
			sock.close();
       }
}