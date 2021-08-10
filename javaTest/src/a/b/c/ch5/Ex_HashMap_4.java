package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex_HashMap_4 {

	public ArrayList hashMap() {
		
		HashMap hm0 = new HashMap();
		hm0.put("�̸�", "�赿��");
		hm0.put("����", "28");
		hm0.put("�ּ�", "��õ");
	
		HashMap hm1 = new HashMap();
		hm1.put("�̸�", "�ε���");
		hm1.put("����", "82");
		hm1.put("�ּ�", "û��");
		
		HashMap hm2 = new HashMap();
		hm2.put("�̸�", "����");
		hm2.put("����", "10");
		hm2.put("�ּ�", "û��");
		
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public ArrayList<HashMap<String, String>> hashMapGeneric() {
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("�̸�", "������");
		hm0.put("����", "33");
		hm0.put("�ּ�", "��õ�� ��");
	
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("�̸�", "���뱸");
		hm1.put("����", "27");
		hm1.put("�ּ�", "��õ�� ���굿");
		
		HashMap <String, String> hm2 = new HashMap<String, String>();
		hm2.put("�̸�", "������");
		hm2.put("����", "34");
		hm2.put("�ּ�", "���� ������");
		
		ArrayList<HashMap<String, String>> aList = 
				new ArrayList<HashMap<String, String>>();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_HashMap_4 ex4 = new Ex_HashMap_4();
		ArrayList aList = ex4.hashMap();
		
		for (int i=0; i < aList.size(); i++) {
			
			HashMap hm = (HashMap)aList.get(i);	
			
			Iterator keys = hm.keySet().iterator();
			
			while (keys.hasNext()) {
				String key = (String)keys.next();
				String value = "";
				
				if ("�̸�".equals(key)) {
					value = (String)hm.get(key);
				}
				if ("����".equals(key)) {
					value = (String)hm.get(key);
				}
				if ("�ּ�".equals(key)) {
					value = (String)hm.get(key);
				}
				System.out.println(key + " : " + value);
			}
			
		}
		
		ArrayList<HashMap<String, String>> aList1 = ex4.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			Iterator<String> keys = hm.keySet().iterator();
			
			// Iterator �������� keys �� �̿� �ؼ� ���ͷ����Ϳ� ��� �ִ� �����͸� hasNext() �Լ��� Ȯ�� �Ѵ�. 
			while (keys.hasNext()) {
				String key = (String)keys.next();
				String value = "";
				
				if ("�̸�".equals(key)) {
					value = hm.get(key);
				}
				if ("����".equals(key)) {
					value = hm.get(key);
				}
				if ("�ּ�".equals(key)) {
					value = hm.get(key);
				}
				
//				if ("�̸�".equals(key) || "����".equals(key) || "�ּ�".equals(key)) {
//					value = hm.get(key);
//				}
				System.out.println(key + " : " + value);
			}
		}		
	}
}
