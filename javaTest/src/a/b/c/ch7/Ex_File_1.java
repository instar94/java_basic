package a.b.c.ch7;

public class Ex_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String javaVersion = System.getProperty("java.version");
		System.out.println("jave.version >>> " + javaVersion);

		//작업중인 디렉토리를 가지고 옴
		String userDir = System.getProperty("user.dir");
		System.out.println("user.dir 현재디렉토리 >>> " +userDir);
		
		//OS버전을 가지고옴
		String osName = System.getProperty("os.name");
		System.out.println("os.name 현재OS >>> " +osName);
		
		//userhome을 가지고 옴
		String userHome = System.getProperty("user.home");
		System.out.println("user.Home 유저홈 >>> " +userHome);
		
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("file.separator : 파일구분자 >>>> "+fileSeparator);
		System.out.println("java.io.File.separator 파일구분자 >>> : "+ java.io.File.separator);
		
		String pathSeparator = System.getProperty("path.separator");
		System.out.println("pathSeparator 경로구분자 >>> " + pathSeparator);
		
		/*
		//컴퓨터의 속성을 불러오는 함수
		java.util.Properties p = System.getProperties();
		
		for(java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + " = "+value);
		}
		
		//위와 동일하게 속성을 불러올 수 있음
		p.list(System.out);
*/
	}
}
