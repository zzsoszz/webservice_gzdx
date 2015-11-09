
package com.dxgz.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthenSPUserModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AuthenSPUserModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subMDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenSPUserModel", propOrder = {
    "commandID",
    "sequenceNo",
    "subMDN",
    "spid",
    "serviceID"
})
public class AuthenSPUserModel {

    @XmlElement(required = true)
    protected String commandID;
    @XmlElement(required = true)
    protected String sequenceNo;
    @XmlElement(required = true)
    protected String subMDN;
    @XmlElement(name = "SPID", required = true)
    protected String spid;
    @XmlElement(required = true)
    protected String serviceID;

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
     * ��ȡspid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * ����spid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
    }

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

}
