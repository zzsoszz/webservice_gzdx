//package com.bxtel.webservice.spsync;
////wsdl2java -d src -client http://localhost:8080/UnicomMemberWeb/cxf/IMemberService?wsdl
////http://localhost:9001/webservice/cxf/ispsync?wsdl
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.jws.soap.SOAPBinding;
//import javax.xml.ws.ResponseWrapper;
//
//import org.springframework.transaction.annotation.Transactional;
///**
// * 此接口不使用，用作demo
// * 提供用户注册、加分扣分WebService接口
// * @author Zhuanghu
// *
// */
//
////,"com.bxtel.cxf.interceptor.MessageSaopChangeInterceptor"  //,"com.bxtel.cxf.interceptor.UserCredientialInterceptor" 可以根据Document来删除
//@org.apache.cxf.interceptor.OutInterceptors (interceptors = {"com.bxtel.cxf.interceptor.MyMessageChangeInterceptor"})  
//@SOAPBinding(use=SOAPBinding.Use.ENCODED, style=SOAPBinding.Style.RPC)
//@WebService() //targetNamespace="com.bxmis.webservice.MemberService"
//@Transactional
//public interface ISPSYNC {
//	
//	@WebMethod(operationName="RefreshUserOrder")
//	@WebResult(name="RefreshUserOrderResponse",partName="RefreshUserOrderResponse",targetNamespace="")
//	@ResponseWrapper(localName = "executeResponse", targetNamespace = "http://impl.ws.com", className = "com.ws.impl.ExecuteResponse") 
//	public   RefreshUserOrderResponse RefreshUserOrder(
//			@WebParam(name="ServiceID")
//			String ServiceID,
//			@WebParam(name="CommandID")
//			String CommandID,
//			@WebParam(name="SequenceNo")
//			String SequenceNo,
//			@WebParam(name="SubMDN")
//			String SubMDN,
//			@WebParam(name="USERNAME")
//			String USERNAME,
//			@WebParam(name="PASSWORD")
//			String PASSWORD,
//			@WebParam(name="STARTTIME")
//			String STARTTIME,
//			@WebParam(name="VALIDTIME")
//			String VALIDTIME,
//			@WebParam(name="FACTORY")
//			String FACTORY,
//			@WebParam(name="PACKAGE")
//			String PACKAGE,
//			@WebParam(name="PPFlag")
//			String PPFlag,
//			@WebParam(name="OCS")
//			String OCS,
//			@WebParam(name="ORDNO")
//			String ORDNO,
//			@WebParam(name="RESERVED")
//			String RESERVED
//			);
//}
