package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex_TcpIPBasicClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(" >> 클라이언트 시작.");
			Socket sClient = new Socket("192.168.0.14", 7070);
			System.out.println(" >> 서버에 접속 성공." + sClient);
		
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(sClient.getInputStream()));
			PrintWriter out = 
			new PrintWriter(new OutputStreamWriter(sClient.getOutputStream()));

			
			//서버 소켓에 메세지 전송
			String msg = "지금 편도가 따끈따끈해여 ";
			out.println(msg);
			out.flush();
			System.out.println("[클라이언트]"+msg);
			
			//서버 소켓으로 부터 받은 메세지 출력
			System.out.println("[서버]" + in.readLine());
			sClient.close();
		}catch(IOException e) {
			System.out.println("에러발생 >>> "+e.getMessage());
	}

}

}