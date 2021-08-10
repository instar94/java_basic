package a.b.c.ch6;

import java.math.BigDecimal;
//자바에서 오버플로우가 일어나서 빅데시말로 쓸때
//무조건 문자열 숫자를 사용해야함 -> 형변환시
//소숫점

public class Ex_Math_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double x = 1.12345678922222;
		// double y = 1.2343456789111;
		//문자 숫자로 먼저 선언함
		String x = "1.12345678922222";
		String y = "1.2343456789111";

//		BigDecimal b1 = new BigDecimal("1.12345678922222");
//		BigDecimal b2 = new BigDecimal("1.2343456789111");
		
		//먼저 BigDecimal로 처리를 함
		BigDecimal b1 = new BigDecimal(x);
		// BigDecimal b1 = new BigDecimal(String.valueOf(x));		
		System.out.println("b1 >>> : " + b1);
		
		BigDecimal b2 = new BigDecimal(y);
		// BigDecimal b2 = new BigDecimal(String.valueOf(y));
		System.out.println("b2 >>> : " + b2);
		
		
		// 더하기 
		BigDecimal badd = b1.add(b2);
		System.out.println("badd >>> : " + badd);
		
		badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd >>> : " + badd);
		
		// 빼기
		BigDecimal bsub = b1.subtract(b2);
		System.out.println("bsub >>> : " + bsub);
		
		bsub = bsub.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bsub >>> : " + bsub);
		
		// 곱하기 
		BigDecimal bmul = b1.multiply(b2);
		System.out.println("bmul >>> : " + bmul);
		
		bmul = bmul.setScale(3, BigDecimal.ROUND_CEILING);
		System.out.println("bmul >>> : " + bmul);
		
		// 나누기 
		// BigDecimal bdiv = b1.divide(b2);
		//roundup을 함수 안에서 해야한다
		BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);
		
//		bdiv = bdiv.setScale(3, BigDecimal.ROUND_DOWN);
//		System.out.println("bdiv >>> : " + bdiv);
	}

}
