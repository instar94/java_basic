package a.b.c.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

	public static String yyyymmdd() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
	}
	
	public static void main (String args[]) {
		String d = DateUtil.yyyymmdd();
		System.out.println("d>>>> "+ d);
	}
}
	// a.b.c.common.DataUtil.cTime() ���� �̵��ϱ� 
	abstract class CurrentTime_1 
	{
		public static String cTime(){
			
			long time = System.currentTimeMillis();		
			java.text.SimpleDateFormat sdf = 
				new java.text.SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
			String cTime = sdf.format(new java.util.Date(time));

			return cTime;
		}
	}

