package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//int�� �迭 ����
			int arr[] = new int[3];//0,1,2��° ������� ����
			
			//arr.length = 3�� (������Ұ� 3���ϱ�)
			//�׷��� 3��° ������Ҵ� ����
			for (int i=0; i<=arr.length; i++) {
				System.out.println("["+i+"] >>> : " + arr[i]);
			}//end of for ��
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("ArrayIndexOutOfBoundsException ���� �߻� : "+a.getMessage());
			}finally{
				System.out.println("���ܹ߻��� ������� ����");
			}//end of fianlly

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println("date >>> : " 
					+ new SimpleDateFormat().format(new Date()));
		
		}//end of main method
		
	}//end of Exception_1 class
