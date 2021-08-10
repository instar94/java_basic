package a.b.c.ch7;

import java.io.File;
import java.io.IOException;

import a.b.c.common.FilePath;

public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;
		try {
			//File 클래스는 자바에서 파일 및 폴더 객체를 다룸
			//매개변수 없이 사용 불가능
			//new File : File클래스를 인스턴스 한것임
			//-> 실제 디텍토리에 생성된 것은 아니다.
			File f = new File("new");
			System.out.println("f>>>: " + f);
			System.out.println("f.getName()>>> " + f.getName());
			//실제 파일을 만들기 위해서는 createNewFile 함수
			//등을 이용해야함
			//새로운 파일을 만듬
			//이클립스에서 실행시 현재 프로젝트
			//cmd 실행시 현재 디렉토리
			// createNewFile(), mkdir(), mkdirs()
			boolean bf = f.createNewFile();
			System.out.println("bf >>>  "+bf);
			
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> :" + bdir);
			
			boolean bfile = f.isFile();
			System.out.println("bfile >>> :" + bfile);
			
			//주소
			String getPath = f.getPath();
			//절대주소
			String geAbsolutePath = f.getAbsolutePath();
			//절대주소에 . 뺌
			String getCanonicalPath = f.getCanonicalPath();
			
			File f1 = new File(filePath + "/"+"aaa.txt");
			System.out.println("f1 >>> " + f1);
			System.out.println("f1.getName() >>> "+ f1.getName());
			boolean bf1 = f1.createNewFile();
			System.out.println("bf1>>>> "+ bf1);
			
			String getPath1 = f1.getPath(); // File에 입력된 경로 출력 
			System.out.println("getPath1 >>> : " + getPath1);
			String getAbsolutePath1 = f1.getAbsolutePath(); // 현재경로 + 입력된 경로(연산되지 않은 경로)
			System.out.println("getAbsolutePath1 >>> : " + getAbsolutePath1);
			String getCanonicalPath1 = f1.getCanonicalPath(); // 현재경로 + 입력된 경로(연산된 경로)
			System.out.println("getCanonicalPath1 >>> : " + getCanonicalPath1);
			
			
			
					
		}catch(Exception io){
			
		}
	}
}
