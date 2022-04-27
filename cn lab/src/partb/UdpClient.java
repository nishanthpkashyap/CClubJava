package partb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient 
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket client = new DatagramSocket();
		byte sd[]=new byte[1000];
		byte rd[]=new byte[1000];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the message to be sent to server :");
		String m = sc.nextLine();
		sd=m.getBytes();
		InetAddress ip =InetAddress.getByName("localhost");
		DatagramPacket sp = new DatagramPacket(sd,sd.length,ip,4000);
		client.send(sp);
		
		DatagramPacket rp = new DatagramPacket(rd,rd.length);
		client.receive(rp);
		String recv=new String(rp.getData());
		System.out.println("Message received from server :\n"+recv);
		
		sc.close();
		client.close();
	}
}
