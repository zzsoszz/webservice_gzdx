package demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface BigDataService {
    
    @WebMethod
    @WebResult BigData getBigData(@WebParam String name, @WebParam int size);
}