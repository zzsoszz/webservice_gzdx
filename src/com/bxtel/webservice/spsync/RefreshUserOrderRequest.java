package com.bxtel.webservice.spsync;

/*
 * 此接口不使用，用作demo
 */
public class RefreshUserOrderRequest {
	String ServiceID;
	String CommandID;
	String SequenceNo;
	String SubMDN;
	String USERNAME;
	String PASSWORD;
	String STARTTIME;
	String VALIDTIME;
	String FACTORY;
	String PACKAGE;
	String PPFlag;
	String OCS;
	String ORDNO;
	String RESERVED;
	public String getServiceID() {
		return ServiceID;
	}
	public void setServiceID(String serviceID) {
		ServiceID = serviceID;
	}
	public String getCommandID() {
		return CommandID;
	}
	public void setCommandID(String commandID) {
		CommandID = commandID;
	}
	public String getSequenceNo() {
		return SequenceNo;
	}
	public void setSequenceNo(String sequenceNo) {
		SequenceNo = sequenceNo;
	}
	public String getSubMDN() {
		return SubMDN;
	}
	public void setSubMDN(String subMDN) {
		SubMDN = subMDN;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getSTARTTIME() {
		return STARTTIME;
	}
	public void setSTARTTIME(String sTARTTIME) {
		STARTTIME = sTARTTIME;
	}
	public String getVALIDTIME() {
		return VALIDTIME;
	}
	public void setVALIDTIME(String vALIDTIME) {
		VALIDTIME = vALIDTIME;
	}
	public String getFACTORY() {
		return FACTORY;
	}
	public void setFACTORY(String fACTORY) {
		FACTORY = fACTORY;
	}
	public String getPACKAGE() {
		return PACKAGE;
	}
	public void setPACKAGE(String pACKAGE) {
		PACKAGE = pACKAGE;
	}
	public String getPPFlag() {
		return PPFlag;
	}
	public void setPPFlag(String pPFlag) {
		PPFlag = pPFlag;
	}
	public String getOCS() {
		return OCS;
	}
	public void setOCS(String oCS) {
		OCS = oCS;
	}
	public String getORDNO() {
		return ORDNO;
	}
	public void setORDNO(String oRDNO) {
		ORDNO = oRDNO;
	}
	public String getRESERVED() {
		return RESERVED;
	}
	public void setRESERVED(String rESERVED) {
		RESERVED = rESERVED;
	}
}
