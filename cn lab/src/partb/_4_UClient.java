package partb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class _4_UClient {

	public static void main(String[] args) throws Exception
	{
		DatagramSocket client = new DatagramSocket();
		InetAddress ipaddress = InetAddress.getByName("localhost");
		byte sendData[] = new byte[1024];
		byte recieveData[] = new byte[1024];
		String sentence = "HI FROM CLIENT";
		sendData = sentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,ipaddress,3009);
		client.send(sendPacket);
		DatagramPacket recievePacket = new DatagramPacket(recieveData,recieveData.length);
		client.receive(recievePacket);
		String message = new String (recievePacket.getData());
		System.out.println("From SERVER : "+message);
		client.close();
	}

}
