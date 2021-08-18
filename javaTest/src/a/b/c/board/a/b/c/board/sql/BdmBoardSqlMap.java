package a.b.c.board.sql;

public class BdmBoardSqlMap {

	//글번호
	public static String getBdmBoardChabunQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 BNUM	\n");
		sb.append(" FROM    BDM_BOARD A"); 
		
		return sb.toString();
		
	}
	//전체조회
	public static String getBdmboardSelectAllQueryMap() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT");
		sb.append("			A.BNUM         BNUM \n");
		sb.append("		   ,A.BSUBJECT     BSUBJECT \n");
		sb.append("		   ,A.BWIRTER      BWIRTER \n");
		sb.append("		   ,A.BCONTENTS    BCONTENTS \n");
		sb.append("		   ,A.BPW          BPW \n");
		sb.append("		   ,A.DELETEYN     DELETEYN \n");
		sb.append("		   ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')   INSERTDATE \n");
		sb.append("		   ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')   UPDATEDATE \n");
		sb.append("FROM 	BDM_BOARD A \n");
		sb.append("WHERE 	DELETEYN = 'Y' \n");
		sb.append("ORDER BY 1 DESC");
		
		return sb.toString();
	}
	
	//조건조회
	public static String getBdmboardSelectQueryMap() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT");
		sb.append("			A.BNUM         BNUM \n");
		sb.append("		   ,A.BSUBJECT     BSUBJECT \n");
		sb.append("		   ,A.BWIRTER      BWIRTER \n");
		sb.append("		   ,A.BCONTENTS    BCONTENTS \n");
		sb.append("		   ,A.BPW          BPW \n");
		sb.append("		   ,A.DELETEYN     DELETEYN \n");
		sb.append("		   ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')   INSERTDATE \n");
		sb.append("		   ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')   UPDATEDATE \n");
		sb.append("FROM 	BDM_BOARD A \n");
		sb.append("WHERE 	DELETEYN = 'Y' \n");
		sb.append("AND		A.BNUM = ?");
		
		
		return sb.toString();
	}
	
	//INSERT
	public static String getBdmboardInsertQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("INSERT INTO BDM_BOARD	\n");
		sb.append("			VALUES (	\n");
		sb.append("		   ? \n");
		sb.append("		   ,? \n");
		sb.append("		   ,? \n");
		sb.append("		   ,? \n");
		sb.append("		   ,? \n");
		sb.append("		   ,'Y' \n");
		sb.append("		   , SYSDATE \n");
		sb.append("		   , SYSDATE \n");
		sb.append("		   )");
		
		return sb.toString();
	}

	
	public static String getBdmBoardUpdateQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE BDM_BOARD				\n");
		sb.append("	SET								\n");
		sb.append("		    BSUBJECT  =	?			\n");
		sb.append("		   ,BCONTENTS = ? 			\n");
		sb.append("		   ,UPDATEDATE = SYSDATE 	\n");
		sb.append("WHERE    BNUM       = ? 			\n");
		sb.append("AND   DELETEYN = 'Y'		\n");
		
		return sb.toString();
	}
	public static String getBdmBoardDeleteQuery(){
		StringBuffer sb = new StringBuffer();
		sb.append("	UPDATE  							\n");	
		sb.append("		   BDM_BOARD			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  BNUM 		= ?				\n");	 // placeholder 1    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");
		
		
		System.out.println(sb);
		return sb.toString();
	}
	
}
