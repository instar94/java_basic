package a.b.c.ch6;

public class Ex_String {
	
	//������ �̸��� Ȯ���ڷ� ������
	//������� String ����
	String orginFileName = "Hello.java";
	
	//void�� �Ϲ��Լ� strIndexOf ����
	//�Ϲ��Լ� : ���� ���������� �����ؾ���
	public void strIndexOf() {
		System.out.println("strIndexOf ����>>>>>>");
		
		//�������� + ���� �ڷ��� ����  -> ��°� 5
		String fullName = "Hello.java";
		//������ . �� ã�� (�̱������̼�)
		int index = fullName.indexOf('.');
		//���ڿ��� .�� ã�� (���������̼�) -> ��°� : 5
		int index1 = fullName.indexOf(".");
		
		System.out.println("index >>>> "+index);
		System.out.println("index1 >>>> "+ index1);
		
		//������ �̸��� ����
		//�ε��� 0���� .�� �ִ� �ε��� ������ ���ڿ��� ����
		String fileName = fullName.substring(0,index);
		System.out.println("fileName >>> : " + fileName);
		
		//Ȯ���ڸ� ����
		//.�� �ִ� �ε��� �������� ������ �̾Ƴ�
		String extendstions = fullName.substring(index+1);
		System.out.println("extendstions >>>> : " + extendstions);
		
		if(orginFileName.equals(fullName)) {
			
			System.out.println("fullName>>>" + fullName);
			int index2 = fullName.indexOf('.');
			String fileName2 = fileName.substring(0, index2);
			System.out.println("fileName2>>>" + fileName2);
			
			String extendstions2 = fullName.substring(index2+1);
			System.out.println("extendstions2 >>>> : " + extendstions2);
			
			String fullName2 = fileName2 + "(1)" + "." + extendstions2;
			System.out.println("fullName2 >>> : "+fullName2);
		}
	}
	
	public void strLastIndexOf() {
		System.out.println("str LastIndex�Լ� ���� >>>>> : ");
		
		String fullName = "Hello00000.doc";
		
		int lastIndex = fullName.lastIndexOf('.');
		System.out.println("lastIndex >>> : " + lastIndex);
		
		String extenstions = fullName.substring(lastIndex+1);
		System.out.println("extenstions >>> : "+extenstions);
		
		if("doc".equals(extenstions)) {
			System.out.println("extenstions >>> : " + extenstions);
			System.out.println("ms doc MIME TYPE : application/msword");
		}
		
		System.out.println("str LastIndex�Լ� �� >>>>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//public String substring(int beginIndex,int endIndex)
//Returns a string that is a substring of this string. 
//The substring begins at the specified beginIndex and extends 
//to the character at index endIndex - 
//1. Thus the length of the substring is endIndex-beginIndex.
		
		String s0 = "unhappy";
		System.out.println("s0.length >>>>> "+s0.length());
		
		//index 2���� ������ -> 3��° ���ڸ� ������
		System.out.println("s0.charAt(2) >>> "+s0.charAt(2));

		//index 2������ ���ڸ� �����
		String s1 = s0.substring(2);
		System.out.println("s0.charAt(2) : s0.substring(2) >>> "+s1);
		
		//index 2������ 5������ ���ڸ� �����
		String s2 = s0.substring(2, 5);
		System.out.println("index 2~5������ >>> " +s2);
		
		Ex_String exs = new Ex_String();
		exs.strIndexOf();
		exs.strLastIndexOf();
		
	}//end of main method
}//end of Ex_String class
