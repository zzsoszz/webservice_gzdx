package com.bxtel.cxf.interceptor;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;


/*http://cxf.apache.org/docs/interceptors.html
 * 创建一个基于SOAPHeader的安全验证(CXF拦截器使用)
 * http://www.blogjava.net/zljpp/archive/2012/04/15/374372.html
 */
public class MyMessageChangeInterceptor extends MessageChangeInterceptor{

	private static final Log logger = LogFactory.getLog(MyMessageChangeInterceptor.class);
	
	@Override
	protected Log getLogger() {
		return logger;
	}

	@Override
	protected String changeOutboundMessage(String currentEnvelope) {
		// TODO Auto-generated method stub
		currentEnvelope=currentEnvelope.replace("</ns1:RefreshUserOrderResponse>", "").replace("<ns1:RefreshUserOrderResponse xmlns:ns1=\"http://spsync.webservice.bxtel.com/\">", "");	
		return currentEnvelope;
	}
	
	@Override
	protected String changeInboundMessage(String currentEnvelope) {
		// TODO Auto-generated method stub
		return currentEnvelope;
	}
	
}
