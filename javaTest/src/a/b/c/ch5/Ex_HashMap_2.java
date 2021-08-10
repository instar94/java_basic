package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_HashMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("�̸�","�ε���");
		hm.put("����","28");
		hm.put("�ּ�","��õ�� ����");
		
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String addr = hm.get("�ּ�");
		
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("addr >>> : " + addr);
		
		//keyset : key���鸸 ��Ƴ��� ��
		//valueset : value���� ��Ƴ��� ��
		//entryset : Ű�� ����� ��� ��Ƴ��� ��
		System.out.println("\n#########################\n");
		System.out.println("hm.keySet() >>> : " + hm.keySet());		
		System.out.println("hm.values() >>> : " + hm.values());
		System.out.println("hm.entrySet() >>> : " + hm.entrySet());		
		System.out.println("\n#########################\n");
		
		// iterator()
		Iterator<String> keys = hm.keySet().iterator();
		
		//  hasNext() �Լ� : Ŀ�� �Լ� ��� �θ���. 
		// ���ϴ� ��ġ�� ���°�?
		while (keys.hasNext())
		{
			String key = keys.next();
			String value = hm.get(key);
			System.out.println("iterator() >>> : " + key + " : " + value);
		}
		System.out.println();
		
		// keySet()
				for (String key1 : hm.keySet())
				{
					String value1 = hm.get(key1);
					System.out.println("keySet() >>> : " + key1 + " : " + value1);
				}
				System.out.println();
				
				// entrySet()
				for (Map.Entry<String, String> entry : hm.entrySet())
				{
					System.out.println("entrySet() >>> : " + entry.getKey() + " : " + entry.getValue());
				}
			}
		}
