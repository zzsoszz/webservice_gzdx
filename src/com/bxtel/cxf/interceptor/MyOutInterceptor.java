package com.bxtel.cxf.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.*;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.Phase;

public class MyOutInterceptor extends AbstractSoapInterceptor {

public MyOutInterceptor() {
        super(Phase.SEND); 
}

public void handleMessage(SoapMessage message) throws Fault { 
        // Get message content for dirty editing...
        StringWriter writer = new StringWriter();
        CachedOutputStream cos  = (CachedOutputStream)message.getContent(OutputStream.class); 
        InputStream inputStream = null;
		try {
			    inputStream = cos.getInputStream();
			    IOUtils.copy(inputStream, writer, "UTF-8");
			    
			    String content = writer.toString();
		        // remove the substrings from envelope...
		        content = content.replace("<idJustification>0</idJustification>", "");
		        content = content.replace("<indicRdv>false</indicRdv>", "");
		        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		        outputStream.write(content.getBytes(Charset.forName("UTF-8")));
		        message.setContent(OutputStream.class, outputStream);
		        
		} catch (IOException e) {
			e.printStackTrace();
		}
} 

}