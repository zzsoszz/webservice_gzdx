//package com.bxtel.webservice.spsync.impl;
//
//import javax.annotation.Resource;
//
//
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import com.bxtel.bxdatadxgzdg.bo.BxDataDxGzDgTBO;
//import com.bxtel.bxdatadxgzdg.model.BxDataDxGzDgT;
//import com.bxtel.exception.BusinessException;
//import com.bxtel.webservice.spsync.ISPSYNC;
//import com.bxtel.webservice.spsync.RefreshUserOrderResponse;
//
///*
// * 此接口不使用，用作demo    使用  SpInterfaceImpl
// */
//
//
////http://localhost:9001/webservice/cxf/ispsync?wsdl
///*
// * 贵州电信接口
// * 贵州电信厂商 刘
//	18908180955
//	我们是爱易惠
// */
//public class SPSYNC implements ISPSYNC {
//	private JdbcTemplate jdbcTemplate;
//	
////	@Override
////	public RefreshUserOrderResponse RefreshUserOrderRequest(
////			RefreshUserOrderRequest request) {
////		System.out.println(request);
////		return null;//new RefreshUserOrderResponse();
////	}
//	
//	@Resource
//	public BxDataDxGzDgTBO  bo;
//	
//	@Override
//	public RefreshUserOrderResponse RefreshUserOrder(String ServiceID,
//			String CommandID, String SequenceNo, String SubMDN,
//			String USERNAME, String PASSWORD, String STARTTIME,
//			String VALIDTIME, String FACTORY, String PACKAGE, String PPFlag,
//			String OCS, String ORDNO, String RESERVED) {
//		BxDataDxGzDgT model=new BxDataDxGzDgT();
//		try {
//			bo.add(model);
//		} catch (BusinessException e) {
//			e.printStackTrace();
//		}
//		RefreshUserOrderResponse response=new RefreshUserOrderResponse() ;
//		response.setCommandID(CommandID);
//		response.setResult("0000");
//		response.setSequenceNo(SequenceNo);
//		return response;
//	}
//	
//}
//
//
///*
// * 
// *
//
//WSDL Style和use的组合方式说明
//http://blog.sina.com.cn/s/blog_4cc16fc50100b2u5.html
//
//WSDL样式详解
//http://www.blogjava.net/orangelizq/archive/2008/04/22/194903.html
//
//理解web服务模式
//http://blog.csdn.net/lin_bei/article/details/1356912
//
//
//wsdl2java 命令
//博客分类： WebService
//-uri 指定wsdl文件
//> WSDL2Java -uri currencyConvert.wsdl
//-d 使用不同的data binding方法
//> WSDL2Java -uri currencyConvert.wsdl -d xmlbeans
//-a 生成异步的方法
//> WSDL2Java -uri currencyConvert.wsdl -a
//-t 生成测试case
//> WSDL2Java -uri currencyConvert.wsdl -t ...
//复杂一些的，-p可以指定生成的package，-o指定生成的路径，-ss生成服务端代码
//wsdl2java -uri ../wsdl/currencyConvert.wsdl -o ../gen_src  -ss -sd -g -p foo.bat
//再复杂一些，－ns2p 将namespace进行替换,多个中间用逗号隔开
//wsdl2java -uri ../wsdl/currencyConvert.wsdl -o ../wsdl/gen_src  -ss -sd -g -p com.foo.bar -ns2p "http://www.xxx.yyy.com/zzz/v1.0"=com.foo.bar,"http://www.xxx.yyy.com/ddd/v1.1"=com
//
//
//wsdl2java -uri ./VacSyncService_SPClient.wsdl   -o  ./gen_src  -ss   -g -p com.bxtel.webservice
//wsdl2java -uri ./VacSyncService_SPClient.wsdl   -o ../gen_src  -ss -sd -g -p foo.bat
//
//基于Eclipse插件的Axis2开发pojo生成的WebService服务端和自动生成的客户端
//http://www.docin.com/p-385013282.html
//
//
//
//使用axis2进行WebService的开发 
//http://blog.csdn.net/xumengxing/article/details/13093573
//
//
//
/////////////cxf
//
//
//用cxf生成的方式，开发web service应用 
//http://kyfxbl.iteye.com/blog/1481330
//
//wsdl2java -p com.huawei.wfm.czekh.webservice.remedy -d ../../src/remedy -all fileName.wsdl 
//
//wsdl2java -p com.bxtel.webservice -d  src -all  -server  http://114.135.113.20:8889/SpInterface?wsdl 
//
//wsdl2java -p com.bxtel.webservice.dxgz  -d  src -all  -server  http://114.135.113.20:8889/SpInterface?wsdl
//
//最终
//wsdl2java -p com.bxtel.webservice.dxgz  -d  src  -frontend jaxws21   -all  http://114.135.113.20:8889/SpInterface?wsdl
//
//
//axis 1.4调用cxf 2.x服务接口，自定义对象数组参数丢失问题 
//http://zhanjia.iteye.com/blog/1987912
//
//
//
//
//CXF创建webservice客户端和服务端 
//http://blog.csdn.net/chenghui0317/article/details/9320053
//
//
//
//
//*
//*
//*/