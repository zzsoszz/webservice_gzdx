package com.dxgz.service.client;

import java.io.IOException;


import org.apache.cxf.configuration.security.ProxyAuthorizationPolicy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.service.Service;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import dinamica.util.DateHelper;

public class DxGxClient {
	
	 public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		 	//proxy
		 	//http://cxf.apache.org/docs/client-http-transport-including-ssl-support.html
		 	//http://blog.csdn.net/kongxx/article/details/7530216
		 	//http://blog.csdn.net/kongxx/article/details/7527115
		 	//http://www.2cto.com/kf/201403/282792.html
		 	
		 	
		 
		 	//---------------------------------------直连方式start
		 	//SpInterfaceService ss = new SpInterfaceService();
		 	//SpInterface port = ss.getSpInterfacePort();
		    //---------------------------------------直连方式 end
		 	
		 	
		    //------------------------------------代理方式
		 	JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
	        factoryBean.setAddress("http://114.135.113.20:8889/SpInterface");
	        factoryBean.setServiceClass(SpInterface.class);
	        Object obj = factoryBean.create();
	        
	        Client client = ClientProxy.getClient(obj);
		 	HTTPConduit http = (HTTPConduit) client.getConduit();
		 	HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		 	httpClientPolicy.setProxyServer("119.254.84.182");
		 	httpClientPolicy.setProxyServerPort(8777);
		 	long timeout = 60000;
		 	httpClientPolicy.setConnectionTimeout(timeout);
		 	httpClientPolicy.setReceiveTimeout(timeout);
		 	http.setClient(httpClientPolicy);
//		 	ProxyAuthorizationPolicy proxyAuthPolicy = new	ProxyAuthorizationPolicy();
//		 	proxyAuthPolicy.setUserName("testUser");
//		 	proxyAuthPolicy.setPassword("testPass");
//		 	proxyAuthPolicy.setAuthorizationType("Basic");
//		 	http.setProxyAuthorization(proxyAuthPolicy); 
		 	SpInterface port =(SpInterface)obj;
		 	//------------------------------------非代理服务器地址
		 	
		 	
	        System.out.println("Invoking refreshUserOrder...");
	        com.dxgz.service.client.UserOrderModel req = new com.dxgz.service.client.UserOrderModel();
	        req.setServiceID("11811808");
	        req.setCommandID("10010");//退订
	        req.setSequenceNo(DateHelper.getDateString("yyyyMMddHHmmss"));
	        req.setSubMDN("13730666347");
	        req.setSTARTTIME(DateHelper.getTimeString());
	        req.setFACTORY("4");
	        req.setPACKAGE("1");
	        req.setPPFlag("1");
	        
//	        req.setBillNo("");
//	        req.setOCS("");
//	        req.setORDNO(DateHelper.getDateString("yyyyMMddHHmmss")+Guid.genRandom(4));
//	        req.setRESERVED("");
//	        req.setSubType("");
//	        req.setUSERNAME("");
//	        req.setPASSWORD("");
//	        req.setVALIDTIME("");
	        
	        com.dxgz.service.client.SyncSPUserResult resp = port.refreshUserOrder(req);
	        ObjectMapper om=new ObjectMapper();
	        System.out.println("refreshUserOrder.result=" + om.writeValueAsString(resp));
	        
	}
}


//com.dxgz.service.client.RefreshUserInfoRequest req =new com.dxgz.service.client.RefreshUserInfoRequest();
//req.setCityID("");
//req.setNewUserID("");
//req.setPrePaidSystemID("");
//req.setProvinceID("");
//req.setState(1);
//req.setStreamingNo("");
//req.setUserID(value)
//req.setUserIDType(value)
//req.setUserName(value)
//req.setUserPayType(value);
//com.dxgz.service.client.Result _refreshUserInfo__return = port.refreshUserInfo(req);
//System.out.println("refreshUserInfo.result=" + _refreshUserInfo__return);
//System.out.println("Invoking refreshUserOrder...");
//com.dxgz.service.client.UserOrderModel _refreshUserOrder_userOrder = null;
//com.dxgz.service.client.SyncSPUserResult _refreshUserOrder__return = port.refreshUserOrder(_refreshUserOrder_userOrder);
//System.out.println("refreshUserOrder.result=" + _refreshUserOrder__return);


//
//System.getProperties().put("http.proxyHost", "someProxyURL");
//System.getProperties().put("http.proxyPort", "someProxyPort");
//System.getProperties().put("http.proxyUser", "someUserName");
//System.getProperties().put("http.proxyPassword", "somePassword");


//props.setProperty(“http.proxyHost”, “proxy.ssn.net”);
//props.setProperty(“http.proxyPort”, “8080”);
//props.setProperty( “mail.imap.socketFactory.class”, SSL_FACTORY);
// props.setProperty( “mail.imap.socketFactory.fallback”, “false”);
//props.setProperty( “mail.imap.port”, “993”);
//props.setProperty( “mail.imap.socketFactory.port”, “993”);
//props.put(“mail.imap.host”, “imap.gmail.com”);
//Session session =
// Session.getDefaultInstance(props, null);
// store = session.getStore(“imap”);
//store.connect(dialog.getServer(),dialog.getUsername(),dialog.getPassword());
//
//I could connect to gmail server without proxy setting. but when i set the proxy setting in college i couldn’t connect.
//
//

//
//
//
//Apache CXF实战之五 压缩Web Service数据  
//.
//分类： Java WebService CXF  2012-05-03 09:19 7334人阅读 评论(3) 收藏 举报 
//
//serviceapachewebstringinterceptorbig data
//
//
//本文链接：http://blog.csdn.net/kongxx/article/details/7530216
//
//Apache CXF实战之一 Hello World Web Service
//
//Apache CXF实战之二 集成Sping与Web容器
//
//Apache CXF实战之三 传输Java对象 
//
//Apache CXF实战之四 构建RESTful Web Service 
//
//在现实应用中有些时候会有比较大的数据对象需要传输，或者在一个比较慢的网络环境下发布调用web service，此时可以通过压缩数据流的方式来减小数据包的大小，从而提高web service的性能。下面来看看怎样来做到这一点。
//
//1. 首先模拟一个可以存放大数据的pojo对象，这个对象可以通过构造参数给定的size来模拟一个size大小的字符串。
//
//
//
//
//[java] view plaincopyprint?
//01.package com.googlecode.garbagecan.cxfstudy.compress;  
//02.  
//03.  
//04.public class BigData {  
//05.      
//06.    private String name;  
//07.      
//08.    private String data;  
//09.      
//10.    public BigData() {  
//11.          
//12.    }  
//13.      
//14.    public BigData(String name, int size) {  
//15.        this.name = name;  
//16.        StringBuilder sb = new StringBuilder();  
//17.        for (int i = 0; i < size; i++) {  
//18.            sb.append("0");  
//19.        }  
//20.        this.data = sb.toString();  
//21.    }  
//22.  
//23.    public String getName() {  
//24.        return name;  
//25.    }  
//26.  
//27.    public void setName(String name) {  
//28.        this.name = name;  
//29.    }  
//30.  
//31.    public String getData() {  
//32.        return data;  
//33.    }  
//34.  
//35.    public void setData(String data) {  
//36.        this.data = data;  
//37.    }  
//38.}  
//
//2. Web Service接口类，和普通的接口定义没有什么区别。
//
//
//
//
//[java] view plaincopyprint?
//01.package com.googlecode.garbagecan.cxfstudy.compress;  
//02.  
//03.import javax.jws.WebMethod;  
//04.import javax.jws.WebParam;  
//05.import javax.jws.WebResult;  
//06.import javax.jws.WebService;  
//07.  
//08.@WebService  
//09.public interface BigDataService {  
//10.      
//11.    @WebMethod  
//12.    @WebResult BigData getBigData(@WebParam String name, @WebParam int size);  
//13.}  
//
//3. Web Service实现类
//
//
//
//
//[java] view plaincopyprint?
//01.package com.googlecode.garbagecan.cxfstudy.compress;  
//02.  
//03.public class BigDataServiceImpl implements BigDataService {  
//04.    public BigData getBigData(String name, int size) {  
//05.        BigData bigData = new BigData(name, size);  
//06.        return bigData;  
//07.    }  
//08.}  
//
//4. 测试类，这片文章使用了JUnit测试类来做测试。setUpBeforeClass方法用来启动Service, testGetBigData方法用来测试web service。
//
//注意setUpBeforeClass方法中的
//
//factoryBean.getInInterceptors().add(new GZIPInInterceptor());
//
//factoryBean.getOutInterceptors().add(new GZIPOutInterceptor());
//
//和testGetBigData方法中的
//
//endpoint.getInInterceptors().add(new GZIPInInterceptor());
//
//endpoint.getOutInterceptors().add(new GZIPOutInterceptor());
//
//上面两段代码就是告诉CXF使用压缩Interceptor来压缩和解压缩数据包。
//
//
//
//
//[java] view plaincopyprint?
//01.package com.googlecode.garbagecan.cxfstudy.compress;  
//02.  
//03.import org.apache.cxf.endpoint.Client;  
//04.import org.apache.cxf.endpoint.Endpoint;  
//05.import org.apache.cxf.frontend.ClientProxy;  
//06.import org.apache.cxf.interceptor.LoggingInInterceptor;  
//07.import org.apache.cxf.interceptor.LoggingOutInterceptor;  
//08.import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;  
//09.import org.apache.cxf.jaxws.JaxWsServerFactoryBean;  
//10.import org.apache.cxf.transport.http.gzip.GZIPInInterceptor;  
//11.import org.apache.cxf.transport.http.gzip.GZIPOutInterceptor;  
//12.import org.junit.Assert;  
//13.import org.junit.BeforeClass;  
//14.import org.junit.Test;  
//15.  
//16.public class BigDataServiceTest {  
//17.  
//18.    private static final String address = "http://localhost:9000/ws/compress/bigDataService";  
//19.      
//20.    @BeforeClass  
//21.    public static void setUpBeforeClass() throws Exception {  
//22.        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();  
//23.        factoryBean.getInInterceptors().add(new LoggingInInterceptor());  
//24.        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());  
//25.        factoryBean.getInInterceptors().add(new GZIPInInterceptor());  
//26.        factoryBean.getOutInterceptors().add(new GZIPOutInterceptor());  
//27.          
//28.        factoryBean.setServiceClass(BigDataServiceImpl.class);  
//29.        factoryBean.setAddress(address);  
//30.        factoryBean.create();  
//31.    }  
//32.  
//33.    @Test  
//34.    public void testGetBigData() {  
//35.        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
//36.        factoryBean.setAddress(address);  
//37.        factoryBean.setServiceClass(BigDataService.class);  
//38.        Object obj = factoryBean.create();  
//39.          
//40.        Client client = ClientProxy.getClient(obj);  
//41.        Endpoint endpoint = client.getEndpoint();  
//42.        endpoint.getInInterceptors().add(new GZIPInInterceptor());  
//43.        endpoint.getOutInterceptors().add(new GZIPOutInterceptor());  
//44.          
//45.        BigDataService service = (BigDataService) obj;  
//46.        Assert.assertNotNull(service);  
//47.          
//48.        String name = "my big data";  
//49.        int size = 1024 * 1024 * 10;  
//50.          
//51.        long start = System.currentTimeMillis();  
//52.        BigData bigData = service.getBigData(name, size);  
//53.        long stop = System.currentTimeMillis();  
//54.        System.out.println("Time: " + (stop - start));  
//55.          
//56.        Assert.assertNotNull(bigData);  
//57.        Assert.assertEquals(name, bigData.getName());  
//58.        Assert.assertEquals(size, bigData.getData().length());  
//59.    }  
//60.}  
//
//5. 运行此unit test，可以在日志中看到数据包前后大小和内容。
//
//
//




