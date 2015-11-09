package dinamica.util;

public class DBHelper {

	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));  
	}
	
	public static String getPageSql(String sql,String startrownum,String endrownum)
	{
		String totalSql=getSqlForTotal(sql);
		String pagesql="select  vpage2.* from ( select rownum rn,vpage.* from ( "+totalSql+" ) vpage where rownum<="+endrownum+" )vpage2 where rn>"+startrownum;
		return pagesql;
	}
	
	public static String getSqlForTotal(String sql)
	{
		 String str="select v2.*,count(1) over() totalcount  from ("+sql+") v2"; 
		 return str;
	}
	
	public static String getPageSqlByPageIndex(String sql,String pageindex,String rowPerPage)
	{
		long pageindex2=Integer.parseInt(pageindex);
		long rowPerPage2=Integer.parseInt(rowPerPage);
		long startrownum = (pageindex2-1)*rowPerPage2;
		long endrownum = (pageindex2)*rowPerPage2;
		return getPageSql(sql,new Long(startrownum).toString(),new Long(endrownum).toString());
	}
	
}
