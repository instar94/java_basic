package a.b.c.ch6;

public class Ex_Math_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Math_4.main >>> ����");
		
		//String�� �������� n0������ ����Ʈ ������ �ʱ�ȭ
		String n0 = "";
		String n1 = "";
		
		
		for (int n=0; n<5; n++) {
			//int�� �迭 lo ������, ������Ұ� 6��
			int lo[] = new int[6];
			
			//lo�迭���ٰ� 1~45������ ������ ���� ����
			for (int i=0; i<lo.length; i++) {
				lo[i] = (int)(Math.random()*45)+1;
				
				//������ ���ڰ� ������ �ʵ��� ��������
				//j�� i�� ��� ���ڸ� �˼���
				//break�� ���� ����
				for(int j=0; j< i; j++) {
					if(lo[j]==lo[i]) {
						i--;
						break;
					}//end of if��
				}//end of j for��
			}//end of i for��
			
			//�迭�� ä��� n1�� lo�� ������ҷ� ä��� String������ ����ȯ
			for (int i=0; i<lo.length; i++) {
				
				if(lo[0]==lo[i]) {
					n1 = String.valueOf(lo[i]);
					if (1==n1.length()) {
						n1= "0" +n1;
					}//end of if��
					n0= "�� ��"+n1;
	
				}else {
					//�迭�� ä��� n0�� lo�� ������ҷ� ä��� String������ ����ȯ
					n0=String.valueOf(lo[i]);
					//n0�� ������ ���̰� 1��
					//������ ������ 0XX �̷������� ����
					if (1==n0.length()) {
						n0= "0" +n0;
					}//end of if��
				}//end of if - else��
				
				
				
				
				//�ٽ��ѹ� ���ڿ��� ����� ���� �����
				System.out.print(n0+" ");
				
				
				n0+=" ";
				System.out.print(n0);
			}//end of i for��
			//���� ����
			System.out.println();
		}//end of n for ��
		System.out.println("Ex_Math_4.main >>> ��");
	}//end of main method
}//end of Ex_Math_4 Ŭ����
