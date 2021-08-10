package a.b.c.ch6;

import java.math.BigDecimal;

public class Ex_Math_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//오버플로우 :자료형이 담을 수 있는 용량을 넘어서 수가 이상하게 나오는 것
		//z>>>>> -1794967296
		//z1>>>> 2500000000

		int x = 50000;
		int y = 50000;
		int z = x*y;
		System.out.println("z>>>>> "+z);
		
		long x1 = 50000;
		long y1 = 50000;
		long z1 = x1*y1;
		System.out.println("z1>>>> "+z1);
		
		//부동 소수점 오류
		//z2 >>> 0.29999999999999993
		//z3 >>> 0.3
		
		int x2 =1;
		double y2 = 0.1;
		int num = 7;
		double z2 = x2 -num *y2;
		System.out.println("z2 >>> "+z2);
		
		int x3 = 1;
		double y3 = x3 *10;
		int num1 = 7;
		double z3 = (y3-num1) / 10.0;
		System.out.println("z3 >>> "+z3);
		
		// java.math.BigDecimal 
				// java.math.BigDecimal.add(BigDecimal augend) : 덧셈 연산
				// java.math.BigDecimal.subtract(BigDecimal subtranhend) : 뺄셈 연산
				// java.math.BigDecimal.multiply(BigDecimal multiplicand) : 곱셈 연산
				// java.math.BigDecimal.devide(BigDecimal divisor) : 나눗셈 연산
				// java.math.BigDecimal.remainder(BigDecimal divisor) : 나머지 연산
		
		//오버플로우가 일어나지 않도록 미리 잡고 가는것
		BigDecimal b1 = BigDecimal.valueOf(1);
		BigDecimal b2 = BigDecimal.valueOf(0.7);
		System.out.println("b1.subtract(b2) >>> : " + b1.subtract(b2));
		
	}

}
