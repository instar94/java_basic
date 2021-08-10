package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileWriter;
import java.io.BufferedWriter;

import a.b.c.common.FilePath;

//���̹� HTML �ܾ����

public class Ex_URL_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� ��ü �ʱ�ȭ
		String filePath = FilePath.FILE_PATH_CH8;
		String path = filePath + "/"+"index.html";
		String urlStr = "https://www.naver.com";
		
		try {
			//URL�� urlStr�� �ְ� , ur�� ������
			URL ur = new URL(urlStr);
			System.out.println("ur>>>> "+ur);
			//openStream " �ܺο��� ������ �޾� �� 
			System.out.println("ur.openStream() >>>> "+ur.openStream());
			
			//���۸����� ������ -> ��ü����
			//���۸����� �ƱԸ�Ʈ�� InputStreamReader�� openStrema �п� �� ���
			BufferedReader br = new BufferedReader(
								new InputStreamReader(ur.openStream()));
			
			//���۶������� �ƱԸ�Ʈ�� path�� ���϶����ͷ�
			//���϶����ʹ� ���θ��� ���� �̸��� �ƱԸ�Ʈ�� ����
			BufferedWriter bw = new BufferedWriter(
								new FileWriter(path));
		
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
			bw.write(inLine);
		}
		//���� ���� �۵�
		bw.flush();
		
		//��ü�ݱ�
		bw.close();
		br.close();
		
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
		
	}

}
