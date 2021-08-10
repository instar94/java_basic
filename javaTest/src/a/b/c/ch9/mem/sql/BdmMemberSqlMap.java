package a.b.c.ch9.mem.sql;

//구체적으로 어떻게 SQL에 명령을 내릴지를 쓰는 추상클래스
//기존의경우 짧게 쿼리명령문을 작성했지만 이제부터는 아래와 같이
//구체적으로 짜야함

public abstract class BdmMemberSqlMap {

	//전체 조회
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
	    
	    //StringBuffer는 String이 아니기 때문에 toString해줘야함
	    return sb.toString();
	}
	
	//선택 조회
	//? -> 하나 선택하는거
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
	
	//삽입 쿼리
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
	
	//수정하기
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
	
	//삭제(FLAG)
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
	
	//회원채번 규칙
	public static String getBdmMemberChabunQuery() {
		
		StringBuffer sb = new StringBuffer();
					
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.HNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    BDM_MEMBER A"); 
		
		return sb.toString();
	}
	
}
