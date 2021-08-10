package a.b.c.ch6;

public class Ex_Math_6 {
	
	//배열형태로 대소비교
	//max의 매개변수를 imax 배열로 선언
	public static int max(int imax[]) {
		//max의 값을 imax의 index 0번의 값으로 초기화
		int max = imax[0];
		
		//for를 이용해 반복함
		for(int i=0; i <imax.length; i++) {
			//imax의 모든 숫자들과 대소 비교후 크다면 max 의 값을 바꿈
			if(imax[i] > max) {
				max=imax[i];
			}
		}
		return max;
	}
	
	public static int min(int imax[]) {
		
		int min = imax[0];
		
		for(int i=0; i <imax.length; i++) {
			
			if(imax[i] < min) {
				min=imax[i];
			}
		}
		return min;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//imax의 배열 구성요소들을 넣어줌
		int imax[] = {5,3,6,4,9,8};
		int max = Ex_Math_6.max(imax);
		System.out.println("max>>>> " + max);
		
		int min = Ex_Math_6.min(imax);
		System.out.println("min>>>> " + min);
	}

}
