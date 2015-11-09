package com.bxtel.webservice.spsync;

/*
 * 此接口不使用，用作demo
 */
//@XmlRootElement(name = "getOrder", namespace = "http://www.example.org/order")
//@XmlType(name = "getOrder", namespace = "http://www.example.org/order")
public class RefreshUserOrderResponse {
	String CommandID;
	String SequenceNo;
	String Result;
	String ResultContent;
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
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public String getResultContent() {
		return ResultContent;
	}
	public void setResultContent(String resultContent) {
		ResultContent = resultContent;
	}
	
}
