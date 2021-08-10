package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

public class Ex_TcpIPBasicServer extends Thread {

	private ServerSocket ss;
	
	public Ex_TcpIPBasicServer() throws IOException{
		System.out.println(" >> ���� ����.");
		ss = new ServerSocket(7070
							,200
							,InetAddress.getByName("192.168.0.14"));
	}
	
	public void run() {
		while(true) {
			try {
				
				// ���� ����� �� 0 ~ 1023 ��Ʈ�� ����ϸ� �ʵ�
				// well known port ��� �ؼ� �̹� ����� ���ǵ� ��Ʈ�̴�. 
				
				System.out.println(" >> Ŭ���̾�Ʈ ���� ���." + ss);

				// Ŭ���̾�Ʈ ���� ������ ���
				Socket sc = ss.accept();
				System.out.println(" >> Ŭ���̾�Ʈ ���� ����." + sc);

				
				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream()));
				PrintWriter out =
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));
				
				//Ŭ���̾�Ʈ �������� ���� ���� �޼����� ȭ�鿡 ���
				System.out.println("[Ŭ���̾�Ʈ]" + in.readLine());
				String msg="���� ���� ȯ��";
				out.println(msg);
				out.flush();
				System.out.println("[����]"+msg);
				
			}
			catch (IOException e)
			{
				System.out.println(" ������ : " + e.getMessage());
			break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex_TcpIPBasicServer tbs = new Ex_TcpIPBasicServer();
			Thread t = new Thread(tbs);
			t.start();
		}catch(IOException e){
			System.out.println(" ������ : " + e.getMessage());
		}	
	}
}
