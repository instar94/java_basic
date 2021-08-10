package a.b.c.ch5;

import java.util.ArrayList;
import a.b.c.TestVO;
import java.util.Scanner;

public class Ex_ArrayList_3 {
	
	//회원조회 함수
	public ArrayList<TestVO> memSelect() {
		
		System.out.println("Ex_ArrayList_3.memSelect() 함수 시작 >>>>> ");
		
		//ArrayList인 aList를 선언 . <TestVO>를 제너릭으로 사용
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		
		for (int i = 0; i < 3; i++) {
		
			//TestVO의 자원을 세팅하기 위해 참조변수 선언
			TestVO tvo = new TestVO();
			
			//setter를 이용해서 각 변수들을 세팅함
			tvo.setMnum("00_"+i);
			tvo.setMid("aa_"+i);
			tvo.setMpw("aa00_"+i);
			tvo.setMhp("010_"+i);
			tvo.setMjuso("주소_"+i);
			
			//aList에 tvo의 주소값을 담음
			aList.add(tvo);
			
			//프린트하면 주소값이 나옴
			System.out.println(aList);
		}
		System.out.println("Ex_ArrayList_3.memSelect() 함수 끝 >>>>> ");
		return aList;
	}
	
	public ArrayList<TestVO> memSelect(TestVO tvo){
		System.out.println("Ex_ArrayList_3.memSelect(TestVO tvo) 함수 시작 >>>>> ");
		
		//의도적으로 데이터를 세팅 <-세팅이 안되어 있음
		//세팅을 위해 ArrayList를 두개를 만듬
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		
		for(int i = 0 ; i < 3 ; i++) {
			//TestVO의 자원을 세팅하기 위해 참조변수 선언
			TestVO tt = new TestVO();
			
			//setter를 이용해서 각 변수들을 세팅함
			//mnum이 00_0~ 00_2까지 만들어짐
			tt.setMnum("00_"+i);
			tt.setMid("aa_"+i);
			tt.setMpw("aa00_"+i);
			tt.setMhp("010_"+i);
			tt.setMjuso("주소_"+i);
			//세팅된 값들을 aList로 보냄
			aList.add(tt);
			System.out.println(aList);
		}
		
		//출력을 위한 ArrayList를 만듬
		ArrayList<TestVO> aList_1 = new ArrayList<TestVO>();
		
		//00_0~00_2 중 00_1을 가져옴 고정함
		if("00_1".equals(tvo.getMnum())){
			
			//00_1에 해당하는 값을 가져오기 위해 TestVO를 참조변수로 선언
			TestVO _tvo = new TestVO();
			//set함수를 통해 세팅하는데, 그 값은 aList에서 get(0).getMnum 값을 가져옴
			//aList.get(0) : aLsit의 첫번째 구성요소의 주소값을 가지고 옴
			// aList에서 get(0).getMnum : aList의 0번째 구성요소 주소값에 해당하는 getMnum 값을 가져옴
			
			
			_tvo.setMnum(aList.get(0).getMnum());
			_tvo.setMid(aList.get(0).getMid());
			_tvo.setMpw(aList.get(0).getMpw());
			_tvo.setMhp(aList.get(0).getMhp());
			_tvo.setMjuso(aList.get(0).getMjuso());
			
	
			aList_1.add(_tvo);	
		}//end of if문
		
		System.out.println("Ex_ArrayList_3.memSelect(TestVO tvo) 함수 끝 >>>>> ");
		return aList_1;
	}//end of memSelect(TestVO tvo) 함수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_ArrayList_3.main 함수 시작 >>>>> ");
		System.out.println("조회 키워드 입력 : 조건조회 S / 전체조회SALL");
		
		//Scanner 클래스를 통해서 값을 받아옴
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();
		//toUpperCase : 대문자로 만듬
		isud = isud.toUpperCase();
		
		if("S".equals(isud)) {
			System.out.println("isud >>>> " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
			
			//지역변수는 특별한 일이 없으면 객체, 기초자료형 모두 디폴트값으로 초기화
			TestVO tvo = null;
			tvo = new TestVO();
			tvo.setMnum("00_1");
			
			ArrayList<TestVO> aList = ex3.memSelect(tvo);
			System.out.println("aList.size () >>>> "+aList.size());
			System.out.println("aList >>>> : "+ aList);
			
			if (aList.size() > 0) {
				for(int i = 0; i< aList.size(); i++) {
					TestVO _tvo = aList.get(i);
					
					System.out.print(" " + _tvo.getMnum());
					System.out.print(" " + _tvo.getMid());
					System.out.print(" " + _tvo.getMpw());
					System.out.print(" " + _tvo.getMhp());
					System.out.println(" " + _tvo.getMjuso());
					
			}//for문 종료
		}//end of if문		
	}//end of S if문
		
		//모든 회원 정보를 가져오는 if 문
		if("SALL".equals(isud)) {
			System.out.println("isud >>>> " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
			
			ArrayList<TestVO> aList = ex3.memSelect();
			
			System.out.println("aList.size() >>> "+aList.size());
			System.out.println("aList >>>> " + aList);
			
			if (aList.size() > 0) {
			for(int i = 0; i< aList.size(); i++) {
				TestVO tvo = aList.get(i);
				System.out.print(" " + tvo.getMnum());
				System.out.print(" " + tvo.getMid());
				System.out.print(" " + tvo.getMpw());
				System.out.print(" " + tvo.getMhp());
				System.out.println(" " + tvo.getMjuso());
					}//for문 종료
				}//end of if문
			}//end of if 문
		System.out.println("Ex_ArrayList_3.main 함수 끝 >>>>> ");
		}//end of main method
	}//end of Ex_ArrayList_3 class

