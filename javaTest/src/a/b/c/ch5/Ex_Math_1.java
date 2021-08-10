package a.b.c.ch5;

public class Ex_Math_1 {
	
	public Ex_Math_1() {
		
	}
	
	public int addM(int x, int y) {
		return x + y;
	}
	
	public int subM(int x, int y) {
		return x - y;
	}
	
	public int mulM(int x, int y) {
		return x*y;
	}
	
	public int divM(int x, int y) {
		return x/y;
	}

	public static void main (String[] args) {
		
		char oper = '\u0000';
		int x = 0;
		int y = 0;
		
		if (3==args.length) {
			oper = args[0].charAt(0);
			x = Integer.parseInt(args[1]);
			y = Integer.parseInt(args[2]);
			
			System.out.println("oper>>> : " + oper);
			System.out.println("x>>> : " + x);
			System.out.println("y>>> : " + y);
			
			if(0x2b == oper) {
				Ex_Math_1 exm = new Ex_Math_1();
				int addSum = exm.addM(x,y);
				System.out.println(x+"+"+y+"="+addSum);
			}
			
			if(0x2D == oper) {
				Ex_Math_1 exm = new Ex_Math_1();
				int subSum = exm.subM(x,y);
				System.out.println(x+"-"+y+"="+subSum);
			}
			
			if(0x2A == oper) {
				Ex_Math_1 exm = new Ex_Math_1();
				int mulSum = exm.mulM(x,y);
				System.out.println(x+"*"+y+"="+mulSum);
			}
			
			if(0x2C == oper) {
				Ex_Math_1 exm = new Ex_Math_1();
				int divSum = exm.divM(x,y);
				System.out.println(x+"*"+y+"="+divSum);
			}
			
			
		}else {
			System.out.println("데이터를 확인해주세요");
		}
	}
}
