package com.bxtel.bxdatadxgzdg.model;
import com.bxtel.bxdatadxgzdg.*;
import java.util.*;
public class BxDataDxGzDgT  
{
	
		 public String serviceid;//业务代码，即声讯平台定义的产品标识（对应包月节目的包月ID）
		 public String commandid;//定义本条消息所对应的操作，见2.4
		 public String sequenceno;//由消息发起方分配的一个用于把请求消息与响应消息关联起来的序号：YYYYMMDD+序号
		 public String submdn;//字符型，用户的手机号码
		 public String username;//用户名称
		 public String pwd;//用户业务密码
		 public String starttime;//请求时间（YYYY-MM-DD HH:MM:SS）
		 public String validtime;//订购有效时间（YYYY-MM-DD HH:MM:SS），仅对订购操作有效，默认不填写为一直有效
		 public String factory;//受理渠道：1:营业厅,2:CRM门户,3:IVR，4：自带平台SP 
		 public String pkg;//是否属于套餐订购的标志，0：非套餐，1：套餐
		 public String ppflag;//预付费标记：0：非预付费用户  1：预付费用户
		 public String ocs;//OCS号码
		 public String ordno;//工单流水号
		 public String reserved;//保留字段，对于一些web业务的开户会有特殊的定义字段，在这里传送，如有多个参数可用英文逗号“,”分隔
		public String totalCount;
		public String rowid;
	
		
		 public void setServiceid(String serviceid)
		 {
		 	this.serviceid=serviceid;
		 }
		 public String getServiceid()
		 {
		 	return this.serviceid;
		 }
		 public void setCommandid(String commandid)
		 {
		 	this.commandid=commandid;
		 }
		 public String getCommandid()
		 {
		 	return this.commandid;
		 }
		 public void setSequenceno(String sequenceno)
		 {
		 	this.sequenceno=sequenceno;
		 }
		 public String getSequenceno()
		 {
		 	return this.sequenceno;
		 }
		 public void setSubmdn(String submdn)
		 {
		 	this.submdn=submdn;
		 }
		 public String getSubmdn()
		 {
		 	return this.submdn;
		 }
		 public void setUsername(String username)
		 {
		 	this.username=username;
		 }
		 public String getUsername()
		 {
		 	return this.username;
		 }
		 public void setPwd(String pwd)
		 {
		 	this.pwd=pwd;
		 }
		 public String getPwd()
		 {
		 	return this.pwd;
		 }
		 public void setStarttime(String starttime)
		 {
		 	this.starttime=starttime;
		 }
		 public String getStarttime()
		 {
		 	return this.starttime;
		 }
		 public void setValidtime(String validtime)
		 {
		 	this.validtime=validtime;
		 }
		 public String getValidtime()
		 {
		 	return this.validtime;
		 }
		 public void setFactory(String factory)
		 {
		 	this.factory=factory;
		 }
		 public String getFactory()
		 {
		 	return this.factory;
		 }
		 public void setPkg(String pkg)
		 {
		 	this.pkg=pkg;
		 }
		 public String getPkg()
		 {
		 	return this.pkg;
		 }
		 public void setPpflag(String ppflag)
		 {
		 	this.ppflag=ppflag;
		 }
		 public String getPpflag()
		 {
		 	return this.ppflag;
		 }
		 public void setOcs(String ocs)
		 {
		 	this.ocs=ocs;
		 }
		 public String getOcs()
		 {
		 	return this.ocs;
		 }
		 public void setOrdno(String ordno)
		 {
		 	this.ordno=ordno;
		 }
		 public String getOrdno()
		 {
		 	return this.ordno;
		 }
		 public void setReserved(String reserved)
		 {
		 	this.reserved=reserved;
		 }
		 public String getReserved()
		 {
		 	return this.reserved;
		 }
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getRowid() {
			return rowid;
		}
		public void setRowid(String rowid) {
			this.rowid = rowid;
		}
		
	/*
		 model.setServiceid("serviceidvalue");
		 model.setCommandid("commandidvalue");
		 model.setSequenceno("sequencenovalue");
		 model.setSubmdn("submdnvalue");
		 model.setUsername("usernamevalue");
		 model.setPwd("pwdvalue");
		 model.setStarttime("starttimevalue");
		 model.setValidtime("validtimevalue");
		 model.setFactory("factoryvalue");
		 model.setPkg("pkgvalue");
		 model.setPpflag("ppflagvalue");
		 model.setOcs("ocsvalue");
		 model.setOrdno("ordnovalue");
		 model.setReserved("reservedvalue");
		 model.getServiceid();
		 model.getCommandid();
		 model.getSequenceno();
		 model.getSubmdn();
		 model.getUsername();
		 model.getPwd();
		 model.getStarttime();
		 model.getValidtime();
		 model.getFactory();
		 model.getPkg();
		 model.getPpflag();
		 model.getOcs();
		 model.getOrdno();
		 model.getReserved();
	*/
}

