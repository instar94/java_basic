package a.b.c.ch8;


import java.net.InetAddress;
import java.net.UnknownHostException;
/*
�ϳ��� ��ǻ�͸� ����Ű�� ����� �Ʒ��� ���� 4���� ����� �ִ�. 
------------------------------------------
ping localhost : �ڱ� ��ǻ�͸� ����Ű�� ���� ������
ping 127.0.0.1 : �ڱ� ��ǻ�͸� ����Ű�� ���� ip 
ping 192.168.219.105 : ��ǻ�� ������ 
ping DESKTOP-A9S5QHQ : ��ǻ�� �̸� 
*/
public class Ex_InetAddress {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub

		//����ũž �̸�
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("addr >>>> "+ addr);
		System.out.println("addr.getHostName >>>> "+ addr.getHostName());
		System.out.println("addr.getHost.Address >>>> "+ addr.getHostAddress());
	
		//�ڱ� ��ǻ�͸� ����Ű�� ���� ip 
		InetAddress addr1 = InetAddress.getByName("localhost");
		System.out.println("addr1 >>>> "+ addr1);
		System.out.println("addr1.getHostName >>>> "+ addr1.getHostName());
		System.out.println("addr1.getHost.Address >>>> "+ addr1.getHostAddress());
		
		//�ڱ� ��ǻ�͸� ����Ű�� ���� ip 
		InetAddress addr2 = InetAddress.getByName("127.0.0.1");
		System.out.println("\naddr2 >>> : " + addr2);
		System.out.println("addr2.getHostName() >>> : " + addr2.getHostName());
		System.out.println("addr2.getHostAddress() >>> : " + addr2.getHostAddress());
		
		//ping 192.168.219.105 : ��ǻ�� ������ 
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
