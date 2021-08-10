package a.b.c.ch6;

import java.text.DecimalFormat;

public class Ex_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//E : 자연로그의 밑인 e값
		System.out.println("E : " + Math.E);
		
		//PI : 원주율
		System.out.println("E : " + Math.PI);
		
		//max : 큰값
		int max = Math.max(2, 2);
		System.out.println("max>>>> " + max);
		
		//min : 작은값
		int min = Math.min(2, 2);
		System.out.println("min : " + min);
		
		//random() : 0.0~1.0사이의 난수
		// java.util.Random 로도 사용가능
		double random = Math.random();
		System.out.println("random : " + random);
		
		//abs() : 절대값
		int abs = Math.abs(-10);
		System.out.println("abs : " + abs);
		
		//round 소수점 첫째자리 반올림
		System.out.println("----------------");
		double round = Math.round(1.1234);
		System.out.println("round : " + round);
		
		double d = 3.123456789;
		System.out.println("Math.round(d) >>> : " + Math.round(d));
		System.out.println("Math.round(d*100)/100.0 >>> : " + Math.round(d*100)/100.0);
		System.out.println("Math.round(d*1000)/1000.0 >>> : " + Math.round(d*1000)/1000.0);
		System.out.println("Math.round(d*1000000)/1000000.0 >>> : " + Math.round(d*1000000)/1000000.0);

		System.out.println("String.format(\"%.2f\", d) >>> : " + String.format("%.2f", d));
		System.out.println("String.format(\"%.3f\", d) >>> : " + String.format("%.3f", d));
		System.out.println("String.format(\"%.5f\", d) >>> : " + String.format("%.5f", d));
	
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("포맷 >>> : " + df.format(1.234567));
		
		System.out.println("----------------");
		
		// ceil : 전달 받은 실수보다 큰 정수 중 가장 작은 정수 반환
		double ceil = Math.ceil(10.1);
		System.out.println("ceil >>> : " + ceil);
		
		// floor : 전달 받은 실수보다 작은 정수 중 가장 큰 정수 반환
		double floor = Math.floor(10.9);
		System.out.println("floor >>> : " + floor);
		
		// pow : 제곱연산 : (5, 2) -> 25
		double pow = Math.pow(5, 2);
		System.out.println("pow >>> : " + pow);		

	
	}

}
