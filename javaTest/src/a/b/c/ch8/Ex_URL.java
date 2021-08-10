package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//���̹� HTML �ܾ����

public class Ex_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� ��ü �ʱ�ȭ
		String urlStr = "https://www.naver.com";
		
		try {
			//URL�� urlStr�� �ְ� , ur�� ������
			URL ur = new URL(urlStr);
			System.out.println("ur>>>> "+ur);
			//openStream " �ܺο��� ������ �޾� �� 
			System.out.println("ur.openStream() >>>> "+ur.openStream());
			
			//���۸����� ������ -> ��ü����
			BufferedReader br = new BufferedReader(new InputStreamReader(ur.openStream()));
			
		//���ڵ� Ÿ��
			// UTF-8
			//EUC-KR
			//IOS - 8859-1
		System.out.println("br >>> "+br);
		
		//�������� �ʱ�ȭ
		String inLine = "";
		//read�� ���� �о���̰� �ֿܼ� ����Ʈ ����
		while((inLine=br.readLine())!=null) {
			System.out.println(inLine);
		}
		//��ü�ݱ�
		br.close();
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
		
	}

}
