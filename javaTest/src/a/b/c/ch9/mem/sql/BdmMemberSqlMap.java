package a.b.c.ch9.mem.sql;

//��ü������ ��� SQL�� ����� �������� ���� �߻�Ŭ����
//�����ǰ�� ª�� ������ɹ��� �ۼ������� �������ʹ� �Ʒ��� ����
//��ü������ ¥����

public abstract class BdmMemberSqlMap {

	//��ü ��ȸ
	public static String getBdmMemberSelectAllQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 								\n");
		sb.append("      A.HNUM 		HNUM 			\n");
		sb.append("		,A.HNAME  		HNAME 			\n");
		sb.append("		,A.HID  		HID 			\n");
	    sb.append("		,A.HPW  		HPW   			\n");
	    sb.append("		,A.HBIRTH  		HBIRTH 			\n");
		sb.append("		,A.HGENDER  	HGENDER 		\n");
	    sb.append("		,A.HTEL  		HTEL   			\n");
	    sb.append("		,A.HHP  		HHP 			\n");
		sb.append("		,A.HEMAIL  		HEMAIL 			\n");		
	    sb.append("		,A.HADDR  		HADDR   		\n");
	    sb.append("		,A.HHOBBY  		HHOBBY 			\n");
	    sb.append("		,A.HPHOTO  		HPHOTO 			\n");
		sb.append("		,A.HSKILL  		HSKILL 			\n");
	    sb.append("		,A.HJOB  		HJOB   			\n");
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(TO_DATE(A.INSERTDATE), 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(TO_DATE(A.UPDATEDATE), 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 BDM_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");
	    
	    //StringBuffer�� String�� �ƴϱ� ������ toString�������
	    return sb.toString();
	}
	
	//���� ��ȸ
	//? -> �ϳ� �����ϴ°�
	public static String getBdmMemberSelectQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 								\n");
		sb.append("      A.HNUM 		HNUM 			\n");
		sb.append("		,A.HNAME  		HNAME 			\n");
		sb.append("		,A.HID  		HID 			\n");
	    sb.append("		,A.HPW  		HPW   			\n");
	    sb.append("		,TO_CHAR(TO_DATE(A.HBIRTH))  		HBIRTH 			\n");
		sb.append("		,A.HGENDER  	HGENDER 		\n");
	    sb.append("		,A.HTEL  		HTEL   			\n");
	    sb.append("		,A.HHP  		HHP 			\n");
		sb.append("		,A.HEMAIL  		HEMAIL 			\n");		
	    sb.append("		,A.HADDR  		HADDR   		\n");
	    sb.append("		,A.HHOBBY  		HHOBBY 			\n");
	    sb.append("		,A.HPHOTO  		HPHOTO 			\n");
		sb.append("		,A.HSKILL  		HSKILL 			\n");
	    sb.append("		,A.HJOB  		HJOB   			\n");
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(TO_DATE(A.INSERTDATE), 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(TO_DATE(A.UPDATEDATE), 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 BDM_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.HNUM   = ?					\n");
	    
	    return sb.toString();
	}
	
	//���� ����
	public static String getBdmMemInsertQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(" INSERT INTO 						\n");
		sb.append(" BDM_MEMBER( 						\n");
		sb.append("       		HNUM 			\n");
		sb.append("		,  		HNAME 			\n");
		sb.append("		, 		HID 			\n");
	    sb.append("		, 		HPW   			\n");
	    sb.append("		,  		HBIRTH 			\n");
		sb.append("		, 	HGENDER 		\n");
	    sb.append("		,  		HTEL   			\n");
	    sb.append("		,  		HHP 			\n");
		sb.append("		,  		HEMAIL 			\n");		
	    sb.append("		,  		HADDR   		\n");
	    sb.append("		,  		HHOBBY 			\n");
	    sb.append("		,  		HPHOTO 			\n");
		sb.append("		,  		HSKILL 			\n");
	    sb.append("		,  		HJOB   			\n");
	    sb.append("		, 	DELETEYN		\n");
	    sb.append("		,  INSERTDATE	\n");
	    sb.append("		,  UPDATEDATE	\n");	    
	    sb.append("	) 								\n");
	    sb.append("	VALUES 								\n");
	    sb.append("	( 								\n");
	    sb.append("     				 ? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,? 				\n");
	    sb.append("     				 ,'Y' 				\n");
	    sb.append("     				 ,SYSDATE 				\n");
	    sb.append("     				 ,SYSDATE 				\n");
	    sb.append("	              )						\n");
		
		
		return sb.toString();
	}
	
	//�����ϱ�
	public static String getBdmMemberUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("	UPDATE  							\n");	
		sb.append("		   	 BDM_MEMBER 			    \n");	
		sb.append("	SET  								\n");		
		sb.append("			 HEMAIL 		= ?			\n"); // placeholder 1	    	    
		sb.append("			,HADDR			= ?			\n"); // placeholder 2	    
		sb.append("			,HHOBBY 		= ? 		\n"); // placeholder 3
		sb.append("			,HJOB   		= ?			\n"); // placeholder 4	        		
	    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE  	 HNUM 			= ?			\n"); // placeholder 5	    
		sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");
		
		return sb.toString();
	}
	
	//����(FLAG)
	public static String getBdmMemberDeleteQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("	UPDATE  							\n");	
		sb.append("		   BDM_MEMBER 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  HNUM 		= ?				\n");	 // placeholder 1    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");
		

		return sb.toString();
	}
	
	//ȸ��ä�� ��Ģ
	public static String getBdmMemberChabunQuery() {
		
		StringBuffer sb = new StringBuffer();
					
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.HNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    BDM_MEMBER A"); 
		
		return sb.toString();
	}
	
}
