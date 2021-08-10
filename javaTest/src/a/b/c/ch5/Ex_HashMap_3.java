package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;

public class Ex_HashMap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ؽ��� ����
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("�̸�", "�赿��");
		hm.put("����", "28");
		hm.put("�ּ�", "��õ�� ����");
		
		//������ ��ü�� String���� ������
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String addr = hm.get("�ּ�");
		
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("addr >>> : " + addr);
		
		//Ű�� ����� ��Ʈ����
		System.out.println("\n#########################\n");
		System.out.println("hm.keySet() >>> : " + hm.keySet());		
		System.out.println("hm.values() >>> : " + hm.values());
		System.out.println("hm.entrySet() >>> : " + hm.entrySet());		
		System.out.println("\n#########################\n");
		
		/*
		hm.keySet() : �̸�, ����, �ּ� �� �迭�� ���� 
		.iterator() : hm.keySet() �Լ����� ������ 
		[�̸�, ����, �ּ�] �����͸� Iterator keys 
		���������� �����Ѵ�.
		
		�ٸ� ���� Iterator keys ���������� 
		hm.keySet() �Լ����� ������ [�̸�, ����, �ּ�] �����͸� 
		����Ų��.
		*/
		Iterator keys = hm.keySet().iterator();
		
		// Iterator �������� keys �� �̿� �ؼ� 
		//���ͷ����Ϳ� ��� �ִ� �����͸� hasNext() 
		//�Լ��� Ȯ�� �Ѵ�. 
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
}
