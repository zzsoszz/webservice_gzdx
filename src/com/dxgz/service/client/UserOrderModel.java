
package com.dxgz.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UserOrderModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取serviceID属性的值。
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
     * 设置serviceID属性的值。
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
     * 获取commandID属性的值。
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
     * 设置commandID属性的值。
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
     * 获取sequenceNo属性的值。
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
     * 设置sequenceNo属性的值。
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
     * 获取subMDN属性的值。
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
     * 设置subMDN属性的值。
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
     * 获取subType属性的值。
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
     * 设置subType属性的值。
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
     * 获取billNo属性的值。
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
     * 设置billNo属性的值。
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
     * 获取username属性的值。
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
     * 设置username属性的值。
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
     * 获取password属性的值。
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
     * 设置password属性的值。
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
     * 获取starttime属性的值。
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
     * 设置starttime属性的值。
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
     * 获取validtime属性的值。
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
     * 设置validtime属性的值。
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
     * 获取factory属性的值。
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
     * 设置factory属性的值。
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
     * 获取package属性的值。
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
     * 设置package属性的值。
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
     * 获取ppFlag属性的值。
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
     * 设置ppFlag属性的值。
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
     * 获取ocs属性的值。
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
     * 设置ocs属性的值。
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
     * 获取ordno属性的值。
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
     * 设置ordno属性的值。
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
     * 获取reserved属性的值。
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
     * 设置reserved属性的值。
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
