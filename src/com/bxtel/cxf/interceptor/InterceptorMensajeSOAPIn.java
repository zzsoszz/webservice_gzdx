package com.bxtel.cxf.interceptor;

import javax.xml.soap.SOAPMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;

public class InterceptorMensajeSOAPIn extends AbstractSoapInterceptor {

    private static Log log =LogFactory.getLog(InterceptorMensajeSOAPIn.class);

    private SAAJInInterceptor saajIn = new SAAJInInterceptor();

    public InterceptorMensajeSOAPIn(){

          super(Phase.PRE_PROTOCOL);

          getAfter().add(SAAJInInterceptor.class.getName());

    } 


    public void handleMessage(SoapMessage message) throws Fault {

      SOAPMessage soapMessage = getSOAPMessage(message);

      try {

                soapMessage.writeTo(System.out);

          } catch (Exception e) {

                e.printStackTrace();

          }
    }


    private SOAPMessage getSOAPMessage(SoapMessage smsg){

          SOAPMessage soapMessage = smsg.getContent(SOAPMessage.class);

      if (soapMessage == null) {

          saajIn.handleMessage(smsg);

          soapMessage = smsg.getContent(SOAPMessage.class);

      }   
      return soapMessage;
    }
}
