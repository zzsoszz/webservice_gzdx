
package com.dxgz.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UserOrderModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UserOrderModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commandID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subMDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STARTTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALIDTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FACTORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PPFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OCS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORDNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESERVED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserOrderModel", propOrder = {
    "serviceID",
    "commandID",
    "sequenceNo",
    "subMDN",
    "subType",
    "billNo",
    "username",
    "password",
    "starttime",
    "validtime",
    "factory",
    "_package",
    "ppFlag",
    "ocs",
    "ordno",
    "reserved"
})
public class UserOrderModel {

    @XmlElement(required = true)
    protected String serviceID;
    @XmlElement(required = true)
    protected String commandID;
    @XmlElement(required = true)
    protected String sequenceNo;
    @XmlElement(required = true)
    protected String subMDN;
    @XmlElement(required = true)
    protected String subType;
    @XmlElement(required = true)
    protected String billNo;
    @XmlElement(name = "USERNAME", required = true)
    protected String username;
    @XmlElement(name = "PASSWORD", required = true)
    protected String password;
    @XmlElement(name = "STARTTIME", required = true)
    protected String starttime;
    @XmlElement(name = "VALIDTIME", required = true)
    protected String validtime;
    @XmlElement(name = "FACTORY", required = true)
    protected String factory;
    @XmlElement(name = "PACKAGE", required = true)
    protected String _package;
    @XmlElement(name = "PPFlag", required = true)
    protected String ppFlag;
    @XmlElement(name = "OCS", required = true)
    protected String ocs;
    @XmlElement(name = "ORDNO", required = true)
    protected String ordno;
    @XmlElement(name = "RESERVED", required = true)
    protected String reserved;

    /**
     * ��ȡserviceID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * ����serviceID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * ��ȡcommandID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandID() {
        return commandID;
    }

    /**
     * ����commandID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandID(String value) {
        this.commandID = value;
    }

    /**
     * ��ȡsequenceNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * ����sequenceNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * ��ȡsubMDN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMDN() {
        return subMDN;
    }

    /**
     * ����subMDN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMDN(String value) {
        this.subMDN = value;
    }

    /**
     * ��ȡsubType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * ����subType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * ��ȡbillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * ����billNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * ��ȡusername���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * ����username���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNAME(String value) {
        this.username = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * ��ȡstarttime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTTIME() {
        return starttime;
    }

    /**
     * ����starttime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTTIME(String value) {
        this.starttime = value;
    }

    /**
     * ��ȡvalidtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDTIME() {
        return validtime;
    }

    /**
     * ����validtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDTIME(String value) {
        this.validtime = value;
    }

    /**
     * ��ȡfactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTORY() {
        return factory;
    }

    /**
     * ����factory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTORY(String value) {
        this.factory = value;
    }

    /**
     * ��ȡpackage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGE() {
        return _package;
    }

    /**
     * ����package���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGE(String value) {
        this._package = value;
    }

    /**
     * ��ȡppFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPFlag() {
        return ppFlag;
    }

    /**
     * ����ppFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPFlag(String value) {
        this.ppFlag = value;
    }

    /**
     * ��ȡocs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCS() {
        return ocs;
    }

    /**
     * ����ocs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCS(String value) {
        this.ocs = value;
    }

    /**
     * ��ȡordno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDNO() {
        return ordno;
    }

    /**
     * ����ordno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDNO(String value) {
        this.ordno = value;
    }

    /**
     * ��ȡreserved���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED() {
        return reserved;
    }

    /**
     * ����reserved���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED(String value) {
        this.reserved = value;
    }

}
