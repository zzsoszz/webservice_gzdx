
package com.dxgz.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dxgz.service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenSPUserModel_QNAME = new QName("http://www.suntektech.com", "AuthenSPUserModel");
    private final static QName _AuthenSPUserResult_QNAME = new QName("http://www.suntektech.com", "AuthenSPUserResult");
    private final static QName _UserOrderModel_QNAME = new QName("http://www.suntektech.com", "UserOrderModel");
    private final static QName _RefreshUserInfoRequest_QNAME = new QName("http://www.suntektech.com", "RefreshUserInfoRequest");
    private final static QName _SPUserModel_QNAME = new QName("http://www.suntektech.com", "SPUserModel");
    private final static QName _SyncSPUserResult_QNAME = new QName("http://www.suntektech.com", "SyncSPUserResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dxgz.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncSPUserResult }
     * 
     */
    public SyncSPUserResult createSyncSPUserResult() {
        return new SyncSPUserResult();
    }

    /**
     * Create an instance of {@link SPUserModel }
     * 
     */
    public SPUserModel createSPUserModel() {
        return new SPUserModel();
    }

    /**
     * Create an instance of {@link RefreshUserInfoRequest }
     * 
     */
    public RefreshUserInfoRequest createRefreshUserInfoRequest() {
        return new RefreshUserInfoRequest();
    }

    /**
     * Create an instance of {@link UserOrderModel }
     * 
     */
    public UserOrderModel createUserOrderModel() {
        return new UserOrderModel();
    }

    /**
     * Create an instance of {@link AuthenSPUserResult }
     * 
     */
    public AuthenSPUserResult createAuthenSPUserResult() {
        return new AuthenSPUserResult();
    }

    /**
     * Create an instance of {@link AuthenSPUserModel }
     * 
     */
    public AuthenSPUserModel createAuthenSPUserModel() {
        return new AuthenSPUserModel();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link UserOrderInfo }
     * 
     */
    public UserOrderInfo createUserOrderInfo() {
        return new UserOrderInfo();
    }

    /**
     * Create an instance of {@link UserOrderInfoArray }
     * 
     */
    public UserOrderInfoArray createUserOrderInfoArray() {
        return new UserOrderInfoArray();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenSPUserModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "AuthenSPUserModel")
    public JAXBElement<AuthenSPUserModel> createAuthenSPUserModel(AuthenSPUserModel value) {
        return new JAXBElement<AuthenSPUserModel>(_AuthenSPUserModel_QNAME, AuthenSPUserModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenSPUserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "AuthenSPUserResult")
    public JAXBElement<AuthenSPUserResult> createAuthenSPUserResult(AuthenSPUserResult value) {
        return new JAXBElement<AuthenSPUserResult>(_AuthenSPUserResult_QNAME, AuthenSPUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserOrderModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "UserOrderModel")
    public JAXBElement<UserOrderModel> createUserOrderModel(UserOrderModel value) {
        return new JAXBElement<UserOrderModel>(_UserOrderModel_QNAME, UserOrderModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshUserInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "RefreshUserInfoRequest")
    public JAXBElement<RefreshUserInfoRequest> createRefreshUserInfoRequest(RefreshUserInfoRequest value) {
        return new JAXBElement<RefreshUserInfoRequest>(_RefreshUserInfoRequest_QNAME, RefreshUserInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPUserModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "SPUserModel")
    public JAXBElement<SPUserModel> createSPUserModel(SPUserModel value) {
        return new JAXBElement<SPUserModel>(_SPUserModel_QNAME, SPUserModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncSPUserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.suntektech.com", name = "SyncSPUserResult")
    public JAXBElement<SyncSPUserResult> createSyncSPUserResult(SyncSPUserResult value) {
        return new JAXBElement<SyncSPUserResult>(_SyncSPUserResult_QNAME, SyncSPUserResult.class, null, value);
    }

}
