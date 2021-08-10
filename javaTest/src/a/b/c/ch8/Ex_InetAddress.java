package a.b.c.ch8;


import java.net.InetAddress;
import java.net.UnknownHostException;
/*
하나의 컴퓨터를 가르키는 방법이 아래와 같이 4가지 방법이 있다. 
------------------------------------------
ping localhost : 자기 컴퓨터를 가르키는 로컬 도메인
ping 127.0.0.1 : 자기 컴퓨터를 가르키는 로컬 ip 
ping 192.168.219.105 : 컴퓨터 아이피 
ping DESKTOP-A9S5QHQ : 컴퓨터 이름 
*/
public class Ex_InetAddress {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub

		//데스크탑 이름
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("addr >>>> "+ addr);
		System.out.println("addr.getHostName >>>> "+ addr.getHostName());
		System.out.println("addr.getHost.Address >>>> "+ addr.getHostAddress());
	
		//자기 컴퓨터를 가르키는 로컬 ip 
		InetAddress addr1 = InetAddress.getByName("localhost");
		System.out.println("addr1 >>>> "+ addr1);
		System.out.println("addr1.getHostName >>>> "+ addr1.getHostName());
		System.out.println("addr1.getHost.Address >>>> "+ addr1.getHostAddress());
		
		//자기 컴퓨터를 가르키는 로컬 ip 
		InetAddress addr2 = InetAddress.getByName("127.0.0.1");
		System.out.println("\naddr2 >>> : " + addr2);
		System.out.println("addr2.getHostName() >>> : " + addr2.getHostName());
		System.out.println("addr2.getHostAddress() >>> : " + addr2.getHostAddress());
		
		//ping 192.168.219.105 : 컴퓨터 아이피 
		InetAddress addr3 = InetAddress.getByName("192.168.0.1");
		System.out.println("\naddr3 >>> : " + addr2);
		System.out.println("addr3.getHostName() >>> : " + addr3.getHostName());
		System.out.println("addr3.getHostAddress() >>> : " + addr3.getHostAddress());
		
		InetAddress addr4 = InetAddress.getByName("DESKTOP-LE27S8O");
		System.out.println("\naddr4 >>> : " + addr2);
		System.out.println("addr4.getHostName() >>> : " + addr4.getHostName());
		System.out.println("addr4.getHostAddress() >>> : " + addr4.getHostAddress());

	}

}
