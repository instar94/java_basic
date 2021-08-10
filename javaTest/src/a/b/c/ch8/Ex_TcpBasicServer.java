package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex_TcpBasicServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(" >> ���� ����.");
			// ���� ����� �� 0 ~ 1023 ��Ʈ�� ����ϸ� �ʵ�
			// well known port ��� �ؼ� �̹� ����� ���ǵ� ��Ʈ�̴�. 
			ServerSocket ss = new ServerSocket(7070);
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
			sc.close();
		}
		catch (IOException e)
		{
			System.out.println(" ������ : " + e.getMessage());
		}	
	}

}
