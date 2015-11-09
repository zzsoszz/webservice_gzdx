package dinamica.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;


import java.text.SimpleDateFormat;   
import java.util.ArrayList;   
import java.util.Calendar;
import java.util.Date;   
import java.util.GregorianCalendar;
import java.util.List;   
import java.util.UUID;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DateHelper {   

	//http://zh.wikipedia.org/wiki/%E8%94%A1%E5%8B%92%E5%85%AC%E5%BC%8F
	public void getWeek(Date date)
	{
		//w=y+[y/4]+[c/4]-2c+[26(m+1)/10]+d-1;
	}
	
	public static Date getDate() throws ParseException
    {
		return getDate("yyyy-MM-dd");
    }
	//EEE, dd MMM yyyy HH:mm:ss zzz
	public static Date getYesterday() throws ParseException
    {
		return addDay(getDate("yyyy-MM-dd"),-1);
    }
	
	public static Date getTime() 
    {
		try {
			return getDate("yyyy-MM-dd HH:mm:ss");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }
	
	
	public static String getTimeString() 
    {
		return getDateString("yyyy-MM-dd HH:mm:ss");
    }
	public static String getTime3String() 
    {
		return getDateString("yyyy-MM-dd HH:mm:ss.SSS");
    }
	
	public static Timestamp getTimestamp() throws ParseException
    {
		Timestamp ts = new Timestamp(getDate("yyyy-MM-dd HH:mm:ss").getTime());
		return ts;
    }
	
	public static Timestamp convertStringToTimestamp(String str) throws Exception
	{
		//"2011-05-09 11:49:45";
		Timestamp ts= new Timestamp(System.currentTimeMillis());
		try{
			ts = Timestamp.valueOf(str);
		}catch(Exception ex)
		{
			throw new Exception(ex.getMessage()+str);
		}
		return ts;
	}
	
	

	public static String convertTimestampToString(Timestamp str)
	{
		return convertTimestampToString(str,"yyyy-MM-dd HH:mm:ss");
	}
	
	public  static String convertTimestampToString(Timestamp str,String format)
	{
		//Timestamp ts = new Timestamp(System.currentTimeMillis());
		String tsStr = "";
		DateFormat sdf = new SimpleDateFormat(format);
		tsStr = sdf.format(str);
		//System.out.println(tsStr);
		return tsStr;
	}
	
	public  static Date convertTimestampToDate(Timestamp timestamp)
	{
		Date date = timestamp;
		return date;
	}
	
	public  static Timestamp convertDateToTimestamp(Date date)
	{
		Timestamp ts = new Timestamp(date.getTime());
		return ts;
	}
	
	
	public static Date getDate(String format) throws ParseException
    {
        SimpleDateFormat df = new SimpleDateFormat(format);   
        Date date =new Date(System.currentTimeMillis());
        return convertStringToDate(df.format(date),format);
    }
	
	
	
	public static String getDateString()
    {
        return getDateString("yyyy-MM-dd");
    }
	
	public static String getDateString(int after)
    {
        return addDay(getDateString("yyyy-MM-dd"),after);
    }
	
	
    public static String getDateString(String format)
    {
        SimpleDateFormat df = new SimpleDateFormat(format);   
        Date date =new Date(System.currentTimeMillis());
        String dateStr = df.format(date);   
        return dateStr;
    }
    
    public static void main(String args[]) throws ParseException
    {
//    	
//    	String insertSql="insert jiankongcollect (nowtime,collectdata) values('"+DateHelper.getDateString("yyyy-MM-dd HH:mm:ss")+"','"+"ddddd"+"')";
//    	//System.out.println(insertSql);
   // 	//System.out.println(getDateString("yyyy-MM-dd HH:mm:ss"));
   // 	;
    	String nString=addDay("2014-05-06",0);
    	Date aa=addHour(convertStringToDate("01:10","HH:mm"),3);
    	System.out.println(aa);
    	//System.out.println(nString);
    }
  /**  
    * 字符串转日期类型  
    *   
    * @author HeCheng  
    * @time 2010-12-08 18:31:46  
    * @return  
 * @throws ParseException 
    */  
   public static Date convertStringToDate(String time, String format) throws ParseException {   
	   if (format == null) {   
           format = "yyyy-MM-dd";   
       }
       SimpleDateFormat sdf = new SimpleDateFormat(format);   
       return sdf.parse(time);   
   }
   public static String convertDateToString(Date date, String format) {   
       if (format == null) {   
           format = "yyyy-MM-dd";   
       }
       SimpleDateFormat sdf = new SimpleDateFormat(format);   
       try {   
           return sdf.format(date);  
       } catch (Exception e) {   
           return null;   
       }
   } 
   
   /**  
    * 取近一年  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:27:41  
    * @return  
    */  
   public static String getLastOneYearDay() {   
       return getLastNumberDayBeforeYesterDay(365);   
   }   
      
   /**  
    * 取近三个月  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:27:41  
    * @return  
    */  
   public static String getLastThreeMonthDay() {   
       return getLastNumberDayBeforeYesterDay(90);   
   }   
      
   /**  
    * 取近一个月  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:27:41  
    * @return  
    */  
   public static String getLastMonthDay() {   
       return getLastNumberDayBeforeYesterDay(30);   
   }   
      
   /**  
    * 取近一周  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:27:41  
    * @return  
    */  
   public static String getLastWeekDay() {   
       return getLastNumberDayBeforeYesterDay(7);   
   }   
 
   /**  
    * 取昨天的前XX天  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:06:08  
    * @param number  
    * @return  
    */  
   public static String getLastNumberDayBeforeYesterDay(int number) {   
       String yesterDay = getYesterdayOrTomorrow(getNowDate(), -1);   
       return getLastNumberDay(yesterDay, number);   
   }   
 
   /**  
    * 取之前XX天  
    *   
    * @author HeCheng  
    * @time 2010-12-08 21:06:08  
    */  
   @SuppressWarnings("deprecation")   
   public static String getLastNumberDay(String day, int number) {   
       String ntime = "";   
       try {   
           SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
           Date startDate = df.parse(day);   
           Date endDate = null;   
           endDate = new Date(startDate.getTime()   
                    - (((long) number * (long) 24 * (long) 3600 * (long) 1000)));   
            ntime = endDate.getYear() + 1900 + "-" + (endDate.getMonth() + 1)   
                    + "-" + endDate.getDate();   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }   
  
    /**  
     * 取上个月的昨天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 18:41:14  
     * @param yesterday  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getYesterdayOnLastMonth(String yesterday) {   
        String ntime = "";   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(yesterday);   
            Date endDate = null;   
            endDate = new Date(startDate.getTime()   
                    - (((long) 30 * (long) 24 * (long) 3600 * (long) 1000)));   
            ntime = endDate.getYear() + 1900 + "-" + (endDate.getMonth() + 1)   
                    + "-" + endDate.getDate();   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }   
  
    /**  
     * 取今年第一天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 18:44:12  
     * @param nowDate  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getFirstDayInYear(String nowDate) {   
        String ntime = "";   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(nowDate);   
            ntime = startDate.getYear() + 1900 + "-01-01";   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }   
  
    /**  
     * 取本季度第一天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 18:46:33  
     * @param nowDate  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getFirstDayInThisQuarter(String nowDate) {   
        String ntime = "";   
        int nowMonth;   
        int nowYear;   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(nowDate);   
            nowMonth = startDate.getMonth() + 1;   
            nowYear = startDate.getYear() + 1900;   
            while (true) {   
                if (nowMonth >= 10) {   
                    ntime = nowYear + "-10-01";   
                    break;   
                }   
                if (nowMonth >= 7) {   
                    ntime = nowYear + "-07-01";   
                    break;   
                }   
                if (nowMonth >= 4) {   
                    ntime = nowYear + "-04-01";   
                    break;   
                }   
                if (nowMonth >= 1) {   
                    ntime = nowYear + "-01-01";   
                    break;   
                }   
            }   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }   
  
    /**  
     * 取昨天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 20:27:21  
     * @return  
     */  
    public static String getYesterDay() {   
        return getYesterdayOrTomorrow(getNowDate(), -1);   
    }   
  
    /**  
     * 取明天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 20:27:21  
     * @return  
     */  
    public static String getTomorrow() {   
        return getYesterdayOrTomorrow(getNowDate(), 1);   
    }   
  
    /**  
     * 取今天  
     *   
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getNowDate() {   
        Date date = new Date();   
        int nowMonth = date.getMonth() + 1;   
        int nowYear = date.getYear() + 1900;   
        int day = date.getDate();   
        String startTime = nowYear + "-" + nowMonth + "-" + day;   
        return startTime;   
    }   
  
    /**  
     * 取时间段  
     *   
     * @author HeCheng  
     * @time 2010-12-08 18:34:22  
     * @param startTime  
     * @param endTime  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static List<String> getTimes(String startTime, String endTime) {   
        List<String> dayList = new ArrayList<String>();   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(startTime);   
            Date endDate = df.parse(endTime);   
            String now = "";   
            for (long i = startDate.getTime(); i <= endDate.getTime(); i += (long) 24  
                    * (long) 3600 * (long) 1000) {   
                Date date = new Date(i);   
                now = date.getYear() + 1900 + "-" + (date.getMonth() + 1) + "-"  
                        + date.getDate();   
                dayList.add(now);   
            }   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return dayList;   
    }   
  
    /**  
     * 取当前月第一天  
     *   
     * @author HeCheng  
     * @time 2010-12-08 18:34:29  
     *   
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getMonthFirstDay() {   
        Date date = new Date();   
        int nowMonth = date.getMonth() + 1;   
        int nowYear = date.getYear() + 1900;   
        String startTime = nowYear + "-" + nowMonth + "-1";   
        return startTime;   
    }   
  
    /**  
     * 取明天或昨天  
     *   
     * @param nowDate  
     * @param con  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getYesterdayOrTomorrow(String nowDate, int con) {   
        String ntime = "";   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(nowDate);   
            Date endDate = null;   
            if (con == -1) {   
                endDate = new Date(startDate.getTime() - (long) 24  
                        * (long) 3600 * (long) 1000);   
            } else {   
                endDate = new Date(startDate.getTime() + (long) 24  
                        * (long) 3600 * (long) 1000);   
            }   
            ntime = endDate.getYear() + 1900 + "-" + (endDate.getMonth() + 1)   
                    + "-" + endDate.getDate();   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }   
  
    /**  
     * 取月的最后一天  
     *   
     * @param time  
     * @return  
     */  
    @SuppressWarnings("deprecation")   
    public static String getMonthEndDay(String time) {   
        String ntime = "";   
        try {   
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
            Date startDate = df.parse(time);   
            int nowMonth = startDate.getMonth() + 1;   
            int nextMonth = nowMonth + 1;   
            int nowYear = startDate.getYear() + 1900;   
            String nextTime = nowYear + "-" + nextMonth + "-1";   
            Date tmpDate = df.parse(nextTime);   
            Date endDate = new Date(tmpDate.getTime() - 24 * 3600 * 1000);   
            ntime = endDate.getYear() + 1900 + "-" + (endDate.getMonth() + 1)   
                    + "-" + endDate.getDate();   
        } catch (Exception e) {   
            //System.out.println(e);   
        }   
        return ntime;   
    }
    
    
	public static JdbcTemplate getJdbcTemplate(String datasource) {
		 	Context initContext;
		 	JdbcTemplate jdbcTemplate = null;
		 	DataSource ds = null;
			try {
					initContext = new InitialContext();
				    Context envContext = (Context)initContext.lookup("java:/comp/env");
				    if (datasource == null)
				    {
				        ds = (DataSource) envContext.lookup("jdbc/jk");
				    }
				    else
				    {
				        ds = (DataSource) envContext.lookup(datasource);
				    }
				    jdbcTemplate=new JdbcTemplate(ds);
			} catch (NamingException e) {
				e.printStackTrace();
			}
			return jdbcTemplate;
	}
	
	
	public static JdbcTemplate getJdbcTemplate() {
		return getJdbcTemplate("jdbc/jk");
	}

	
	public static String getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate;
		java.util.Date endDate;
		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime())
					/ (24 * 60 * 60 * 1000);

			// //System.out.println("相隔的天数="+day);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return new Long(day).toString();
	}
	
	public static long getSubDay(String beginDateStr, String endDateStr) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate;
		java.util.Date endDate;
		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime())
					/ (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return day;
	}
	
	public static String getHourSub(String beginDateStr, String endDateStr) {
		long hour = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date beginDate;
		java.util.Date endDate;
		try{
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			hour = (endDate.getTime() - beginDate.getTime()) / ( 60 * 60 * 1000);
			// //System.out.println("相隔的天数="+day);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return new Long(hour).toString();
	}
	
	
	public static String getHourSub(Date beginDate, Date endDate) {
		long hour = 0;
		hour = (endDate.getTime() - beginDate.getTime()) / ( 60 * 60 * 1000);
		return new Long(hour).toString();
	}
	
	public static long getSubDay(Date beginDate, Date endDate) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		day = (endDate.getTime() - beginDate.getTime())
				/ (24 * 60 * 60 * 1000);
		return new Long(day);
	}
	
	public static String getDaySub(Date beginDate, Date endDate) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		day = (endDate.getTime() - beginDate.getTime())
				/ (24 * 60 * 60 * 1000);
		return new Long(day).toString();
	}
	
	
	public static ArrayList<String> getDayListBySub(String beginDateStr, String endDateStr) {
		ArrayList<String> list=new ArrayList<String>();
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate;
		java.util.Date endDate;
		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime())/ (24 * 60 * 60 * 1000);
			// //System.out.println("相隔的天数="+day);
			for(int i=0;i<=day;i++)
			{
				String newdate=addDay(beginDateStr,i);
				list.add(newdate);
			}
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return list;
	}
	
	public static String addDay(String beginDateStr, int adddaycount) {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			Date  beginDate= format.parse(beginDateStr);
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.DATE, adddaycount);
			Date enddate=cal.getTime();
			return format.format(enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String addDayByDate(String beginDateStr, int adddaycount){
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date beginDate;
		try {
			beginDate = format.parse(beginDateStr);
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.DATE, adddaycount);
			Date enddate=cal.getTime();
			return format.format(enddate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static String addHour(String beginDateStr, int adddaycount) {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			Date  beginDate= format.parse(beginDateStr);
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.HOUR_OF_DAY, adddaycount);
			Date enddate=cal.getTime();
			return format.format(enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static Date addHour(Date beginDate, int count) {
		Calendar cal=Calendar.getInstance();  
		cal.setTime(beginDate);
		cal.add(Calendar.HOUR_OF_DAY, count);
		Date enddate=cal.getTime();
		return enddate;
	}
	
	
	
	
	public static String addMonth(String beginDateStr, int addcount) {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			Date  beginDate= format.parse(beginDateStr);
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.MONTH, addcount);
			Date enddate=cal.getTime();
			return format.format(enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public static Date addDay(Date beginDate, int addcount) {
		Calendar cal=Calendar.getInstance();  
		cal.setTime(beginDate);
		cal.add(Calendar.DAY_OF_YEAR, addcount);
		Date enddate=cal.getTime();
		return enddate;
	}
	
	public static Date addSecond(Date beginDate, int addcount) {
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.SECOND, addcount);
			Date enddate=cal.getTime();
			return enddate;
	}
	
	public static String addYEAR(String beginDateStr, int addcount) {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			Date  beginDate= format.parse(beginDateStr);
			Calendar cal=Calendar.getInstance();  
			cal.setTime(beginDate);
			cal.add(Calendar.YEAR, addcount);
			Date enddate=cal.getTime();
			return format.format(enddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getWeekOfDate(Date date) { 
		String[] weekDaysName = { "日", "一", "二", "三", "四", "五", "六" }; 
		String[] weekDaysCode = { "0", "1", "2", "3", "4", "5", "6" }; 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); 
		int intWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1; 
		return weekDaysName[intWeek];
	} 

	/**
	 * 把日期格式的字符串转换为Date类型
	 * @author 廖庆
	 * @param strDate 传入yyyy-MM-dd格式的字符串
	 * @return 返回转换后的日期
	 * @throws ParseException 
	 */
	public static Date StringToDate(String strDate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		return new java.sql.Date(date.getTime());
		
	}
	public static Date StringToTime(String strDate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date date = sdf.parse(strDate);
		return new java.sql.Date(date.getTime());
		
	}

	/**
	 * 把秒格式转化为日期字符串
	 * @author 张晓东
	 * @param str 传入秒
	 * @return 返回转化后的日期字符串 
	 */
	public static String millisecondToDate(String str){
		long ms=Long.parseLong(str);
		Date dat=new Date(ms*1000);
//		//System.out.println(dat);
		GregorianCalendar gc = new GregorianCalendar();   
        gc.setTime(dat);  
//        //System.out.println(gc.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sb=format.format(gc.getTime());  
		return sb;
	}
	
	public static Date StringToDate1(String strDate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(strDate);
		return new java.util.Date(date.getTime());
		
	}
	
}  