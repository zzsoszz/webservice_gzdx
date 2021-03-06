
package com.dxgz.service.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-11-27T09:38:03.861+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class SpInterface_SpInterfacePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.suntektech.com", "SpInterfaceService");

    private SpInterface_SpInterfacePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SpInterfaceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SpInterfaceService ss = new SpInterfaceService(wsdlURL, SERVICE_NAME);
        SpInterface port = ss.getSpInterfacePort();  
        
        {
        System.out.println("Invoking refreshUserInfo...");
        com.dxgz.service.client.RefreshUserInfoRequest _refreshUserInfo_refreshUserInfoRequest = null;
        com.dxgz.service.client.Result _refreshUserInfo__return = port.refreshUserInfo(_refreshUserInfo_refreshUserInfoRequest);
        System.out.println("refreshUserInfo.result=" + _refreshUserInfo__return);


        }
        {
        System.out.println("Invoking syncSPUserList...");
        com.dxgz.service.client.SPUserModel _syncSPUserList_spUser = null;
        com.dxgz.service.client.SyncSPUserResult _syncSPUserList__return = port.syncSPUserList(_syncSPUserList_spUser);
        System.out.println("syncSPUserList.result=" + _syncSPUserList__return);


        }
        {
        System.out.println("Invoking queryUserOrder...");
        com.dxgz.service.client.UserInfo _queryUserOrder_userInfo = null;
        com.dxgz.service.client.UserOrderInfoArray _queryUserOrder__return = port.queryUserOrder(_queryUserOrder_userInfo);
        System.out.println("queryUserOrder.result=" + _queryUserOrder__return);


        }
        {
        System.out.println("Invoking authenSPUser...");
        com.dxgz.service.client.AuthenSPUserModel _authenSPUser_authenInfo = null;
        com.dxgz.service.client.AuthenSPUserResult _authenSPUser__return = port.authenSPUser(_authenSPUser_authenInfo);
        System.out.println("authenSPUser.result=" + _authenSPUser__return);


        }
        {
        System.out.println("Invoking refreshUserOrder...");
        com.dxgz.service.client.UserOrderModel _refreshUserOrder_userOrder = null;
        com.dxgz.service.client.SyncSPUserResult _refreshUserOrder__return = port.refreshUserOrder(_refreshUserOrder_userOrder);
        System.out.println("refreshUserOrder.result=" + _refreshUserOrder__return);


        }

        System.exit(0);
    }

}
