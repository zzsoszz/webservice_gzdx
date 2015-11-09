package com.bxtel.cxf.interceptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.cxf.binding.soap.interceptor.SoapPreProtocolOutInterceptor;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.xmlbeans.impl.soap.SOAPMessage;
import org.w3c.dom.Document;

/**
 * http://www.mastertheboss.com/jboss-web-services/apache-cxf-interceptors
 * http://stackoverflow.com/questions/6915428/how-to-modify-the-raw-xml-message-of-an-outbound-cxf-request
 * 
 * http://cxf.apache.org/docs/interceptors.html
 * 
 * Apache CXF 学习-使用Dispatch/Provider来直接处理SOAP消息
 * http://supercharles888.blog.51cto.com/609344/1362037
 */
public  class MessageSaopChangeInterceptor extends AbstractPhaseInterceptor<Message> {

    public MessageSaopChangeInterceptor() {
        super(Phase.PRE_STREAM);
    }
    
    public void handleMessage(Message message) {
    	SOAPMessage saaj = message.getContent(SOAPMessage.class);
        Document doc = saaj.getSOAPPart();
        System.out.println(doc);
    }
    public void handleFault(Message message) {
    }
}


/*

import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;

public class Main {

 public static void main(String[] args) throws Exception {
   SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
   SOAPPart soapPart = soapMessage.getSOAPPart();
   SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

   SOAPHeader soapHeader = soapEnvelope.getHeader();
   SOAPHeaderElement headerElement = soapHeader.addHeaderElement(soapEnvelope.createName(
       "Signature", "SOAP-SEC", "http://schemas.xmlsoap.org/soap/security/2000-12"));

   SOAPBody soapBody = soapEnvelope.getBody();
   soapBody.addAttribute(soapEnvelope.createName("id", "SOAP-SEC",
       "http://schemas.xmlsoap.org/soap/security/2000-12"), "Body");
   Name bodyName = soapEnvelope.createName("FooBar", "z", "http://example.com");
   SOAPBodyElement gltp = soapBody.addBodyElement(bodyName);

   Source source = soapPart.getContent();

 }
}
*/