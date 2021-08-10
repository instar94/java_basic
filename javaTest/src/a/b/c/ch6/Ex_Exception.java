package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 try - catch - finally ����
		 try{
		 ���� �߻��� ����Ǵ� ���� �ۼ�
		 }catch(����Ŭ���� ����){
		 ����ó���ϴ� �� - ���� ������ ����
		 }catch(����Ŭ���� ����){
		 ����ó���ϴ� �� = ���� ������ ����
		 }finally{
		 ����ó���� ������� ����Ǵ� ��
		 }
		 
		 */
			//ArrayIndexOutOfBounds ����
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
			}catch(Exception e){
				System.out.println("Exception ����"+e.getMessage());
			}
			
			
			//
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			//Date �����Լ� d�� ���õ���Ʈ���� ���·� �����
			//�̸� ���ڿ� date�� ������
			String date = sdf.format(d);
			System.out.println("date >>> : " + date);
			System.out.println("date >>> : "
								+ new SimpleDateFormat().format(new Date()));
	}

}

//�����Ͻ� ���� �߻�
/*
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at a.b.c.ch6.Ex_Exception.main(Ex_Exception.java:12)
	
arr.length = 3
�׷��� arr[] �迭���� 0,1,2 �ۿ� ����

���� ���� �߻�
 */
