package a.b.c.ch5;

//ArrayList�� HashMap�� ����ϱ� ���� import
import java.util.ArrayList;
import java.util.HashMap;

//VO�� ���� �� ��� �ϴ� ���

public class Ex_HashMap_1 {

	//ArrayList �Լ� ���� => return�� ����
	public ArrayList hashMap() {
		
		//HashMap�� ���ؼ� ���� ������ �޾ƿ�
		HashMap hm0 = new HashMap();
		hm0.put("�̸�","�赿��");
		hm0.put("����","28");
		hm0.put("�ּ�","��õ�� ����");
		
		HashMap hm1 = new HashMap();
		hm1.put("�̸�","����");
		hm1.put("����","27");
		hm1.put("�ּ�","��õ�� ����");
		
		HashMap hm2 = new HashMap();
		hm2.put("�̸�","����");
		hm2.put("����","26");
		hm2.put("�ּ�","��õ�� ����");
		
		//ArrayList�� �� �ؽ����� �ּҰ��� ����
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		//ArrayList�� ������
		return aList;
		
	}//end of hashMap method
	
	//���ʸ� �̿� : String�� String �����͸��� �̿���
	public ArrayList<HashMap<String, String>> hasMapGeneric(){
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("�̸�","�ε���");
		hm0.put("����","28");
		hm0.put("�ּ�","��õ�� ����");
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("�̸�","�ε�");
		hm1.put("����","27");
		hm1.put("�ּ�","��õ�� ����Ȧ��");
		
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("�̸�","����");
		hm2.put("����","26");
		hm2.put("�ּ�","��õ�� û��");
		
		ArrayList<HashMap<String, String>> aList =
				new ArrayList<HashMap<String, String>>();
		
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		return aList;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Ex_HashMap_1 ex1 = new Ex_HashMap_1();
		ArrayList aList = ex1.hashMap();
		System.out.println("aList.size() >>>>> " + aList.size());
		
		for(int i = 0 ; i < aList.size(); i++) {
			HashMap hm = (HashMap)aList.get(i);
			
			//name
			Object obj1 = hm.get("�̸�");
			String name1 = (String)obj1;
			System.out.print("�̸� >>> " + name1);

			//age
			Object obj2 = hm.get("����");
			String age1 = String.valueOf(hm.get("����"));
			System.out.print("  ���� >>>> "+age1);

			//add
			Object obj3 = hm.get("�ּ�");
			String add1 = hm.get("�ּ�").toString();
			System.out.println("  �ּ� >>>>  "+ add1);
			
		}//end of for ��

		ArrayList<HashMap<String, String>> aList1 = ex1.hasMapGeneric();
		System.out.println("aList1.size >>> "+aList.size());
		
		for(int i = 0 ; i < aList1.size(); i++) {
			//���� �޸� ĳ������ ������� ����
			HashMap<String, String> hm = aList1.get(i);
			
			//name
			Object obj1 = hm.get("�̸�");
			String name1 = (String)obj1;
			System.out.print("�̸� >>> " + name1);

			//age
			Object obj2 = hm.get("����");
			String age1 = String.valueOf(hm.get("����"));
			System.out.print("  ���� >>>> "+age1);

			//add
			Object obj3 = hm.get("�ּ�");
			String add1 = hm.get("�ּ�").toString();
			System.out.println("  �ּ� >>>>  "+ add1);
			
		}//end of for ��		
		
		
	}//end of main method

}//end of Ex_HashMap_1 class
