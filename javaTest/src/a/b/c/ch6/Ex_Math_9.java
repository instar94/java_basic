package a.b.c.ch6;

import java.math.BigDecimal;
//�ڹٿ��� �����÷ο찡 �Ͼ�� �򵥽ø��� ����
//������ ���ڿ� ���ڸ� ����ؾ��� -> ����ȯ��
//�Ҽ���

public class Ex_Math_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double x = 1.12345678922222;
		// double y = 1.2343456789111;
		//���� ���ڷ� ���� ������
		String x = "1.12345678922222";
		String y = "1.2343456789111";

//		BigDecimal b1 = new BigDecimal("1.12345678922222");
//		BigDecimal b2 = new BigDecimal("1.2343456789111");
		
		//���� BigDecimal�� ó���� ��
		BigDecimal b1 = new BigDecimal(x);
		// BigDecimal b1 = new BigDecimal(String.valueOf(x));		
		System.out.println("b1 >>> : " + b1);
		
		BigDecimal b2 = new BigDecimal(y);
		// BigDecimal b2 = new BigDecimal(String.valueOf(y));
		System.out.println("b2 >>> : " + b2);
		
		
		// ���ϱ� 
		BigDecimal badd = b1.add(b2);
		System.out.println("badd >>> : " + badd);
		
		badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd >>> : " + badd);
		
		// ����
		BigDecimal bsub = b1.subtract(b2);
		System.out.println("bsub >>> : " + bsub);
		
		bsub = bsub.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bsub >>> : " + bsub);
		
		// ���ϱ� 
		BigDecimal bmul = b1.multiply(b2);
		System.out.println("bmul >>> : " + bmul);
		
		bmul = bmul.setScale(3, BigDecimal.ROUND_CEILING);
		System.out.println("bmul >>> : " + bmul);
		
		// ������ 
		// BigDecimal bdiv = b1.divide(b2);
		//roundup�� �Լ� �ȿ��� �ؾ��Ѵ�
		BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);
		
//		bdiv = bdiv.setScale(3, BigDecimal.ROUND_DOWN);
//		System.out.println("bdiv >>> : " + bdiv);
	}

}
