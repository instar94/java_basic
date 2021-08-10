package a.b.c.ch7;

public class Ex_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String javaVersion = System.getProperty("java.version");
		System.out.println("jave.version >>> " + javaVersion);

		//�۾����� ���丮�� ������ ��
		String userDir = System.getProperty("user.dir");
		System.out.println("user.dir ������丮 >>> " +userDir);
		
		//OS������ �������
		String osName = System.getProperty("os.name");
		System.out.println("os.name ����OS >>> " +osName);
		
		//userhome�� ������ ��
		String userHome = System.getProperty("user.home");
		System.out.println("user.Home ����Ȩ >>> " +userHome);
		
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("file.separator : ���ϱ����� >>>> "+fileSeparator);
		System.out.println("java.io.File.separator ���ϱ����� >>> : "+ java.io.File.separator);
		
		String pathSeparator = System.getProperty("path.separator");
		System.out.println("pathSeparator ��α����� >>> " + pathSeparator);
		
		/*
		//��ǻ���� �Ӽ��� �ҷ����� �Լ�
		java.util.Properties p = System.getProperties();
		
		for(java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + " = "+value);
		}
		
		//���� �����ϰ� �Ӽ��� �ҷ��� �� ����
		p.list(System.out);
*/
	}
}
