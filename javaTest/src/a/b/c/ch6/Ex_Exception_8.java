package a.b.c.ch6;

//��������� ����Ŭ����
//Excetion Ŭ������ ��ӹ޾ƿ�
//throws : ����ó�� �̷�� -> ȣ���Լ��� ���� ������ -> main���� throws�� ��� �� �� ����
//throw Ű���� : ����� ���� ����
class IDFormatException extends Exception{
	
	//������
	public IDFormatException(String s) {
		//Exception�� s�� ������
		super(s);
	}//end of IDFormatException(String s) ������
}//end of IDFormatException class

//���������� ����Ǵ� userID�� ������ �� �ִ� �Լ��� ����
class IDFormatTest{
	private String userID;
	
	public String getUserID(){
		return userID;
	}//end of getUserID method

//throws :  ����ó���� �̷����
	//null���� ���� 8~20�� ���̰� �ƴҶ� throw�ع���
	//throw�� ����� ���� ����
public void setUserID(String userID) throws IDFormatException{

	if(userID == null) {
		IDFormatException ide = new IDFormatException("���̵�� null�� �� �����ϴ�.");
		throw ide;
	}else if (userID.length()<8|| userID.length()>20) {
		throw new IDFormatException("���̵� 8~20�� ���̷� �ۼ����ּ���");
	}
		this.userID = userID;
	}

}//end of IDFormatTest class

public class Ex_Exception_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDFormatTest idt = new IDFormatTest();
		
		//userID��� �������� + ���ڿ��� ������ ����Ʈ ������ ����
		String userID = null;
		
		//���� ���� IDFormatTest�� set��
		//set�� ���� this�� ���� �ش� Ŭ������ �����
		//���� userID�� null ����
		//���� ��
		try {
			idt.setUserID(userID); 
		}catch(IDFormatException i) {
			System.out.println("i ���� >> "+i);
		}//end of try-catch��
		
		//userID�� 7�ڹ̸����� ������
		userID = "1234567";
		
		//IDFormatException�� setUser�Լ��� userID(1234567)�� ����
		//elseif ���ǿ� �ɸ� -> 8~20�ڻ��̰� �ƴ�
		//������ �߻��� 
		//catch������ ������
		//catch������ i ���� �ߵ� ->����� ���ǿ��ܰ� �ߵ���
		try {
			idt.setUserID(userID);
		
		}catch(IDFormatException i) {
			System.out.println("i ���� >>> "+i);
		}//end of try-catch��
		System.out.println("try-catch�� ���� >>>>");
	}//end of main method
}//end of Ex_Exception_8

