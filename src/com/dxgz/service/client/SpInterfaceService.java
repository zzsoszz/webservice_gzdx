package com.dxgz.service.client;

import java.net.MalformedURLException;



import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-11-27T09:38:03.959+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "SpInterfaceService", 
                  wsdlLocation = "http://114.135.113.20:8889/SpInterface?wsdl",
                  targetNamespace = "http://www.suntektech.com") 
public class SpInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.suntektech.com", "SpInterfaceService");
    public final static QName SpInterfacePort = new QName("http://www.suntektech.com", "spInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://114.135.113.20:8889/SpInterface?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SpInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://114.135.113.20:8889/SpInterface?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SpInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SpInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SpInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SpInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SpInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SpInterface
     */
    @WebEndpoint(name = "spInterfacePort")
    public SpInterface getSpInterfacePort() {
        return super.getPort(SpInterfacePort, SpInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpInterface
     */
    @WebEndpoint(name = "spInterfacePort")
    public SpInterface getSpInterfacePort(WebServiceFeature... features) {
        return super.getPort(SpInterfacePort, SpInterface.class, features);
    }

}
