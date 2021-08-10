 package a.b.c.ch6;

 //�ӽ� ��й�ȣ �����
 //�ڹٿ��� �����ϴ� ��й�ȣ ���� ���� Ŭ����
 /*
	 * �ڹ� �ߺ����� �ʴ� ���� Ű 
	 * UUID(Universally unique identifier)
	 * ���ڿ� ����(�ҹ���)���� �����Ͽ� �ӽú�й�ȣ ����
	 * 32�� ���� + '-' = 36��	   
	 */
 
 import java.util.UUID;
 
public class Ex_Math_7 { //�ڡڡڡ�


	//UUID�� �̿��� �ӽú�й�ȣ �����
	//len¥�� ������ ��ȣ�� �������
	public static String tempPW(int len){
		// UUID���� ������ �޾ƿ� �� String���� ����ȯ ��Ŵ
		//�׸��� String u��� ���������� �ʱ�ȭ
		String u =UUID.randomUUID().toString();
		System.out.println("u>>> " + u);
		
		//-�� ���°� ���� ����
		u=u.replace("-", "").substring(0,len);
		
		System.out.println("u >>>> " + u);
		
		return u;
	}//end of tempPW method
	
	//���ڸ� �̸� �ְ� ���߿��� �������� ����
	public static String randomPw(int len) {
		char c[] = {
				'1','2','3','4','5','6','7','8','9','0', 
				'A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z', 
				'a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t',
				'u','v','w','x','y','z',
				'!','@','#','&'
				//'!','@','#','$','%','^','&','*','(',')'
    	}; 
	
	String p ="";

		//len��ŭ ������ ����� ���� ����
		for (int i=0; i<len; i++) {
			//���� ������ �̰� c�� ���̸� ��� c ������� ����ŭ�� ���� ��������
			//�� ������°�� �ش��ϴ� ������Ҹ� �θ�
			int a =(int)(Math.random()*(c.length));
			//�װ� ��� String p�� ���س���
			p+= c[a];
		}
	return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8���� ¥�� ���
		String s1 = Ex_Math_7.tempPW(8);
		String s2 = Ex_Math_7.randomPw(8);
		
		System.out.println("UUID >>> " + s1);
		System.out.println("random >>> " + s2);
	}//end of main method
}//end of Ex_Math_7 class

