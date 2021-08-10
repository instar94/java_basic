package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_2 {
	/*
	url : Uniform Resource Locator : web address : ���Ͻĺ���, �����ڿ����ñ�				 
	uri : Uniform Resource Identifier : ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ڿ�

	uri > url : 

	http://������:��Ʈ/���/�н�?key=value&page=12

	url : http://������:��Ʈ/���/�н� 
	uri : http://������:��Ʈ/���/�н�?key=value&page=12

	http ���������� url�� ��û�ϴ� ���
	- post ��� : http://������:��Ʈ/���/���ϸ�.Ȯ����
	- get ��� :  http://������:��Ʈ/���/���ϸ�.Ȯ����?key=value&key&value
					url�� ?����ǥ�� �ִ� ��

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� ���� ����
		String urlStr = "https"		//��������
				+"://"				//�������ݰ� ��α�����
				+"nid.naver.com"	//ip Ȥ�� ������
			  //+":"				//ip Ȥ�� ������ ������
			  //+"8080"				//��Ʈ
				+"/nidlogin.login"	//������ ��� 
									//nidlogin.login : ��û�� ���� ���ϸ�
				+"?"				//������ ��� Ȥ�� Query String : key=value
				+"&"				//������Ʈ�� ������
				+"url=https%3A%2F%2Fwww.naver.com"; // Query String : key=value
		//try-catch ����
		 try {
			 //URL�� ���������� �����ϰ� �ƱԸ�Ʈ�� urlStr�� ��
			 URL ur = new URL(urlStr);
			 //ur : ��ü �ּ�
			 System.out.println("ur >>> "+ ur);
			 //�������� : https
			 System.out.println("ur.getProtocol >>> "+ ur.getProtocol());
			 //������ or ip : nid.naver.com
			 System.out.println("ur.getHost >>> "+ ur.getHost());
			 //��Ʈ
			 System.out.println("ur.getPort >>> "+ ur.getPort());
			 //��� :  /nidlogin.login
			 System.out.println("ur.getPath >>> "+ ur.getPath());
			 //������Ʈ�� : &url=https%3A%2F%2Fwww.naver.com
			 System.out.println("ur.getQuery() >>> "+ ur.getQuery());
			 //���ϸ��� ������ : /nidlogin.login?&url=https%3A%2F%2Fwww.naver.com
			 System.out.println("ur.getFile >>> "+ ur.getFile());
			 
			 //���½�Ʈ��: sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd
			 System.out.println("ur.openStrema() >>> "+ur.openStream());

			 //��ü����
			 //��ũ�Ѹ��� ���� ���۷� in�ؾ���
			 //in�� ����  BuffeReader new�� �ν��Ͻ�
			 //�ƱԸ�Ʈ�� inputStreamReader�� ���� url ����
			 BufferedReader br = new BufferedReader(
					 			 new InputStreamReader(ur.openStream(),"UTF-8"));
			 //�ּҰ� �ѹ� ����
			 System.out.println("br>>>> "+br);
			 
			 //�������� ���� �� �ʱ�ȭ
			 String inLine="";
			 
			 //�д� ���� ����
			 //while�� �̿��� �б� �����ϰ�
			 //println �Լ��� ���� �ֿܼ� ����� 
			 while ((inLine=br.readLine())!=null) {
				 System.out.println(inLine);
			 }
			 //��ü �ݱ�
			 br.close();
			 
			 //������ Exception �����
		 }catch(Exception e){
			 System.out.println("���� �߻� "+ e.getMessage());
		}
	}
}
