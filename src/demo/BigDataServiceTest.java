package demo;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public class BigDataServiceTest {

   // private static final String address = "http://localhost:9000/ws/compress/bigDataService";
	private static final String address = "http://localhost:9000/ws/compress/bigDataService";
    public static void main(String[] args) throws Exception {
    	setUpBeforeClass();
    	testGetBigData();
	}
    
    
    public static void setUpBeforeClass() throws Exception {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.getInInterceptors().add(new org.apache.cxf.transport.common.gzip.GZIPInInterceptor());
        factoryBean.getOutInterceptors().add(new org.apache.cxf.transport.common.gzip.GZIPOutInterceptor());
        factoryBean.setServiceClass(BigDataServiceImpl.class);
        factoryBean.setAddress(address);
        factoryBean.create();
    }

    
    public static void testGetBigData() {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress(address);
        factoryBean.setServiceClass(BigDataService.class);
        Object obj = factoryBean.create();
        
        Client client = ClientProxy.getClient(obj);
        

	 	HTTPConduit http = (HTTPConduit) client.getConduit();
	 	HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
	 	httpClientPolicy.setConnectionTimeout(36000);
	 	httpClientPolicy.setAllowChunking(false);
	 	httpClientPolicy.setReceiveTimeout(32000);
	 	httpClientPolicy.setProxyServer("119.254.84.182");
	 	httpClientPolicy.setProxyServerPort(8777);
	 	httpClientPolicy.setHost("119.254.84.182");
	 	http.setClient(httpClientPolicy);
	 	
	 	
        Endpoint endpoint = client.getEndpoint();
        endpoint.getInInterceptors().add(new org.apache.cxf.transport.common.gzip.GZIPInInterceptor());
        endpoint.getOutInterceptors().add(new org.apache.cxf.transport.common.gzip.GZIPOutInterceptor());
        
        BigDataService service = (BigDataService) obj;
        
        String name = "my big data";
        int size = 1024 * 1024 * 10;
        
        long start = System.currentTimeMillis();
        BigData bigData = service.getBigData(name, size);
        long stop = System.currentTimeMillis();
        System.out.println("Time: " + (stop - start));
    }
}