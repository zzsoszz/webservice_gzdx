package com.bxtel.cxf.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import java.util.Enumeration;

/*
 *
  CXF Interceptor example: how to get HTTP Headers in CXF
  http://www.asjava.com/web-services/cxf-interceptor-read-http-header/
  
  http://stackoverflow.com/questions/3969399/print-xml-content-of-soap-message
  Print XML content of SOAP message
 */
public class UserCredientialInterceptor extends AbstractSoapInterceptor {
	private SAAJInInterceptor saajIn = new SAAJInInterceptor();

	public UserCredientialInterceptor() {
		super(Phase.PRE_PROTOCOL);
		getAfter().add(SAAJInInterceptor.class.getName());
	}

	public void handleMessage(SoapMessage message) throws Fault {
		SOAPMessage doc = message.getContent(SOAPMessage.class);
		if (doc == null) {
			saajIn.handleMessage(message);
			doc = message.getContent(SOAPMessage.class);
		}
		SOAPHeader headerr = null;
		Document docs=null;
		try {
			docs=doc.getSOAPPart();
			headerr = doc.getSOAPHeader();
		} catch (SOAPException e) {
			e.printStackTrace();
		}
		System.out.println(docs);
		if (headerr != null) {
			NodeList nodes = headerr.getElementsByTagNameNS(
					"http://asjava.com/types", "Username");
			if (nodes != null && nodes.item(0) != null) {
				String user = nodes.item(0).getTextContent();
			}
		}
		HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
		if (null != request) {
			String addr = request.getRemoteAddr();
			Enumeration enums = request.getHeaderNames();
			Cookie[] cookies = request.getCookies();
		}
	}
}