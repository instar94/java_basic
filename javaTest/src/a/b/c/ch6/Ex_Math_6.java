package a.b.c.ch6;

public class Ex_Math_6 {
	
	//�迭���·� ��Һ�
	//max�� �Ű������� imax �迭�� ����
	public static int max(int imax[]) {
		//max�� ���� imax�� index 0���� ������ �ʱ�ȭ
		int max = imax[0];
		
		//for�� �̿��� �ݺ���
		for(int i=0; i <imax.length; i++) {
			//imax�� ��� ���ڵ�� ��� ���� ũ�ٸ� max �� ���� �ٲ�
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

		//imax�� �迭 ������ҵ��� �־���
		int imax[] = {5,3,6,4,9,8};
		int max = Ex_Math_6.max(imax);
		System.out.println("max>>>> " + max);
		
		int min = Ex_Math_6.min(imax);
		System.out.println("min>>>> " + min);
	}

}
