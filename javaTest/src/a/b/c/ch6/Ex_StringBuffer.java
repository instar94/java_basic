package a.b.c.ch6;

public class Ex_StringBuffer {

//	1. StringBuffer�� String�� ��� �ٸ� ��ü��
//	2. ��ȣ�� �����͸� ���� ����ȯ�� �ʿ���
//	3. ���ڿ��� �Һ����� ������ ���� ���� 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StringBuffer sb = new StringBuffer("java");
			System.out.println("sb >>>> " + sb);
			System.out.println("sb >>>> " + System.identityHashCode(sb));
			
			//append : StringBuffer�� ���ڿ��� �߰��� ����
			sb.append(" and");
			sb.append(" android");
			sb.append(" programming is fun");
			System.out.println("sb >>>> "+sb);
			System.out.println("sb >>>> " + System.identityHashCode(sb));
			
			//StringBuffer�� String�� �ٸ��⶧���� ����ȯ �ʼ�
			String str = sb.toString();
			System.out.println("str>>>> "+str);
			System.out.println("str >>>> " + System.identityHashCode(str));
			
			String str1 = str + "\n String class�� �Һ��� ����!";
			System.out.println("str1 >>> " + str1);
			System.out.println("str >>>> " + System.identityHashCode(str1));
	}

}
