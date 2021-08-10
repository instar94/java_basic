package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex_TcpBasicClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(" >> Ŭ���̾�Ʈ ����.");
			Socket sClient = new Socket("192.168.0.14", 7070);
			System.out.println(" >> ������ ���� ����." + sClient);
		
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(sClient.getInputStream()));
			PrintWriter out = 
			new PrintWriter(new OutputStreamWriter(sClient.getOutputStream()));

			
			//���� ���Ͽ� �޼��� ����
			String msg = "���� ������ ���������ؿ� ";
			out.println(msg);
			out.flush();
			System.out.println("[Ŭ���̾�Ʈ]"+msg);
			
			//���� �������� ���� ���� �޼��� ���
			System.out.println("[����]" + in.readLine());
			sClient.close();
		}
		catch (IOException e)
		{
			System.out.println(" ������ : " + e.getMessage());
		}	
	}
}