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
		System.out.println(" >> 서버 시작.");
		ss = new ServerSocket(7070
							,200
							,InetAddress.getByName("192.168.0.14"));
	}
	
	public void run() {
		while(true) {
			try {
				
				// 소켓 통신할 때 0 ~ 1023 포트는 사용하면 않됨
				// well known port 라고 해서 이미 사용이 정의된 포트이다. 
				
				System.out.println(" >> 클라이언트 접속 대기." + ss);

				// 클라이언트 접속 때까지 대기
				Socket sc = ss.accept();
				System.out.println(" >> 클라이언트 접속 성공." + sc);

				
				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream()));
				PrintWriter out =
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));
				
				//클라이언트 소켓으로 부터 받은 메세지를 화면에 출력
				System.out.println("[클라이언트]" + in.readLine());
				String msg="서버 접속 환영";
				out.println(msg);
				out.flush();
				System.out.println("[서버]"+msg);
				
			}
			catch (IOException e)
			{
				System.out.println(" 에러가 : " + e.getMessage());
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
			System.out.println(" 에러가 : " + e.getMessage());
		}	
	}
}
