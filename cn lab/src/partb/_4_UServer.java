package partb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class _4_UServer 
{
	public static void main(String[] args) throws Exception 
	{
		DatagramSocket server = new DatagramSocket(3009);
		byte sendData[] = new byte[1024];
		byte recieveData[] = new byte[1024];
		System.out.println("SERVER READY.....");
		Scanner sc = new Scanner(System.in);
		
		DatagramPacket recievePacket = new DatagramPacket(recieveData, recieveData.length);
		server.receive(recievePacket);
		String sentence = new String(recievePacket.getData());
		System.out.println("RECIEVED : "+sentence);
		
		InetAddress ipaddress = recievePacket.getAddress();
		int port = recievePacket.getPort();
		System.out.println("Enter the message to be sent:");
		String message = sc.nextLine();
		sendData = message.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipaddress, port);
		server.send(sendPacket);
		
		server.close();
		sc.close();
		
	}
}
