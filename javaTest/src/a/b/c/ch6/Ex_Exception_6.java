package a.b.c.ch6;

public class Ex_Exception_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ ���� : 1/0���� ������� �ȳ��ö�
		//���ڴ�� �ٸ����� �־�����
		//����� �μ��� �̿��� ����
		int argsL = args.length;
		
		if (2==argsL) {
			String sX = args[0];
			System.out.println("�Է��� ���� >> " + sX);
			String sY = args[1];
			System.out.println("�Է��� ���� >> " + sY);
			
			try {
			//����� �μ��� �迭�� ����-> ���ڿ���
			int x = Integer.parseInt(sX);
			int y = Integer.parseInt(sY);
			int z =x / y;
			System.out.println(x+"/"+y+"= "+z);
			//}catch(NumberFormationException n) { <-���� �ڵ�� �̷��� �Ⱦ�
			//NumberFormationException : ���ڴ�� �ٸ��� ������ ������ ����
			//n�� ExceptionŬ������ ����������
			}catch(Exception n) {
				System.out.println("���� n.getMessage()>>> "+ n.getMessage());
				}//end of try catch
			}else {
			System.out.println("������ ���� �Է����ּ���");	
		}//end of if-else��
	}//end of main method
}//end of Ex_Exception_6 class