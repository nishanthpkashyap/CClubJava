package partb;

import java.net.*;
import java.io.*;

public class _6_Tserver
{ 
	public static void main(String args[]) throws Exception
	{ 
		ServerSocket server = new ServerSocket(4000);
		System.out.println("Server Ready....");
		Socket sock=server.accept();
		System.out.println("Connection Established !!");
		
		InputStream input = sock.getInputStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(input));
		String fname = rd.readLine();
		
		FileInputStream fin = new FileInputStream(fname);
		byte b[]=new byte[1000];
		fin.read(b,0,b.length);
		
		OutputStream output = sock.getOutputStream();
		output.write(b,0,b.length);
		
		fin.close();
		server.close();
	}
}
