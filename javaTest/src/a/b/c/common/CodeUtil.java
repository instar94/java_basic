package a.b.c.common;

//����Ŭ���� ���� ������ ���ϴ´�� �����ֱ� ���� ��ƿ
//���� , ���� �� 01, 02 ���� ���ڷ� ���� ������  ��ȯ�ϴ� ��ƿ�� ����
//�߻�Ŭ������ ����

//�⺻���� ����
//�������� ���� �� ����Ʈ�� �ʱ�ȭ
//null���� �ƴϰų� �Էµ� ���� ���� �ʴ��� Ȯ��
//equals(s)�� ���ų� for�� �ϳ��ϳ� ����

public abstract class CodeUtil {
	
	//��� ������ ���̽�
	//���� -> ��̷� �ٲ�
	//��� �迭�� ����
	static final String hVal[]= {"����","���ǰ���","�","����","��ȭ","���"};
	
	//���� ������ ���̽�
	static final String jVal[]= {"ȸ���","�ڿ���","�л�","�ֺ�","����","����"};
	
	//�������
	//��¥�� ���Ŀ� ���߱� ���� ������
	public static String birth(String s) {
		
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		String s0 = "";
		String s1 = "";
		String s2 = "";
		
		//���Ͽ� ���� null�̰ų� �ƿ� �����Ͱ� ���� �ʴٸ� �۵�
		if(s!=null && s.length()>0) {
			
			//if���� ����� �������� ����
			int sLen = s.length();
			
			//8�ڸ�(YYYYMMDD) ��� YYYY / MM / DD�� �ڸ�
			if(8 == sLen) {
				s0 = s.substring(0,4);
				s1 = s.substring(4,6);
				s2 = s.substring(6);
			}
			
		}
		return s0 + "-" + s1 + "-" + s2;
	}
	
	//����
	//01 �̸� ���� / 02�� ���ڷ� ǥ���ϵ��� ��
	//equals�� ���ؼ� ������ ǥ�� =����
	public static String gender(String s) {
		
		//�������� ����
		String g = "";
		
		//null �� �ƴϰų� ���̰� �ƿ� ���� �ʴ´ٸ� ����
		if(s!=null && s.length() > 0) {
			//���� �ƴϸ� ���������� if-else
			if ("01".equals(s)) {
				g = "����";
			}else if("02".equals(s)) {
				g = "����";
			}
			
		}
		
		return g;
	}
	
	public static String tel(String s) {
		String s0 = "";
		String s1 = "";
		String s2 = "";
		
		//null ���̰ų� ���� �ƿ� ���°� �ɷ���
		if( s!=null && s.length() > 0) {
			
			//�������� ����
			int sLen = s.length();
			
			//��ȣ�� 10�ڸ��� ��� 00-0000-0000
			if (10 == sLen) {
				s0 = s.substring(0,2);
				s1 = s.substring(2,6);
				s2 = s.substring(7);
			}
			//��ȣ�� 11�ڸ��� ��� 000-0000-0000
			if (11 == sLen) {
				s0 = s.substring(0,3);
				s1 = s.substring(3,7);
				s2 = s.substring(7);
			}
			
		}
		return s0 + "-" + s1 + "-" + s2;
	}
	
	//�ڵ��� ��ȣ
	public static String hp(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		//�ڵ����� 11�ڸ������� 11�ڸ��� ����
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				
				//return���� ���� ���� ������ �̸� ���¸� ���缭 �� ���� ����
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}
	
	//��� - �����ͺ��̽��� ����
	public static String hobby(String s) {
		
		String h = "";
		//null���̰ų� ���̰� �ƿ� ���°� �ɸ� ��� ����
		if (s != null && s.length() > 0) {
			//�´� ��̰� ���ö����� for������ �迭�� ����
			for (int i = 1; i <6 ; i++) {
				//01 02 �� ������ ������
				if(("0"+i).equals(s)) {
					//����Ŭ������ �迭�� 1���� ������ -1�� ����
					h = CodeUtil.hVal[i-1];
				}
			}
		}
		return h;
	}
	
	//���� - ������ ���̽��� ����
	public static String job(String s) {
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		String j = "";
		//null���̰ų� �����Ͱ� ������ Ȯ��
		if(s!=null && s.length()>0) {
			//���� ������ ���̽��� �����Ѱ� ã�� ������ ��
			for(int i =1; i<6; i++) {
			if(("0"+i).equals(s)) {
				j = CodeUtil.jVal[i-1];
				}	
			}
		}
		return j;
	}
	
	//ä���� ��ƿ
	//4�ڸ� ���� �Ǳ� ������ 0�� �տ� ����
	public static String numPad(String s) {
		int sLen = s.length();
		for(int i = sLen; i<4; i++) {
			s= "0"+s;
		}
		return s;
	}
	
	public static void main(String args[]) {
		//�������
		String b = CodeUtil.birth("20210801");
		System.out.println("b >>> " + b);
		
		// ��ȭ��ȣ
		String t = CodeUtil.tel("03212341234");		
		System.out.println("t >>> : " + t);
		
		// �ڵ���
		String hp = CodeUtil.hp("01012341234");		
		System.out.println("hp >>> : " + hp);		
		
		// ����
		String g = CodeUtil.gender("02");
		System.out.println("g >>> : " + g);
		// ���
		String h = CodeUtil.hobby("02");
		System.out.println("h >>> : " + h);
		// ����
		String j = CodeUtil.job("02");
		System.out.println("j >>> : " + j);

		
	}

}
