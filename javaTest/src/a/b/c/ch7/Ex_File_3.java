package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3 {
	
	//멤버변수 선언
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	//printFileList : 사용자 정의 함수
	//매개변수 File의 dir
	public static void printFileList(File dir) {
		//절대주소를 뽑음
		System.out.println(""+dir.getAbsolutePath());
		
		//File형식의 배열선언 후
		//그 안을 파일리스트로 채움
		File[] files =dir.listFiles();
		
		//ArrayList인 subDir를 선언함
		ArrayList subDir = new ArrayList();
		
		//file 배열에 있는 값들을 ArrayList의 배열속에 넣어놓음
		for(int i=0; i<files.length;i++) {
			String fileName = files[i].getName();
			
			if(files[i].isDirectory()) {
				fileName = "["+fileName+"]";
				subDir.add(i+"");
			}
			System.out.println(""+fileName);
		}
		
		//지역변수 선언
		//dirNum은 파일들이 담긴 arrayList 사이즈<-디렉토리
		//filenum은 파일들의 숫자 - dirNum<-파일수
		int dirNum=subDir.size();
		int fileNum = files.length - dirNum;
		
		//토탈 File과 Dir에 각각 집어 넣음
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일."+dirNum+"개의 디렉토리");
		System.out.println();
		
		//subDir의 요소의 인덱스를 구하고 그걸 int형으로 바꾼뒤 Integer형으로 바꿈
		for(int i=0; i<subDir.size();i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			//재귀함수 : 자기 자신을 다시 불러옴
			//file의 인덱스로 사용함
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("값을 입력해주세요");
		//스캐너를 사용하기 위해 선언
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		File dir = new File(str);
		System.out.println("dir >>> "+ dir);
	
		//메소드 printFileList에 dir 값을 넣음
		printFileList(dir);
		System.out.println(" 총 : " + totalFiles + " 개의 파일");
		System.out.println(" 총 : " + totalDirs + " 개의 디렉토리");
	}

}
