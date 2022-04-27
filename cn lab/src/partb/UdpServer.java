package partb;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpServer 
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket server = new DatagramSocket(4000);
		byte sd[]=new byte[1000];
		byte rd[]=new byte[1000];
		Scanner sc = new Scanner(System.in);
		System.out.println("SERVER READY...");
		
		DatagramPacket rp = new DatagramPacket(rd,rd.length);
		server.receive(rp);
		String recv=new String(rp.getData());
		System.out.println("Message recieved from client : \n"+recv);
		
		InetAddress ip = rp.getAddress();
		int port=rp.getPort();
		System.out.println("Enter the message to be sent to client :");
		String m = sc.nextLine();
		sd=m.getBytes();
		DatagramPacket sp = new DatagramPacket(sd,sd.length,ip,port);
		server.send(sp);
		
		sc.close();
		server.close();
	}
}