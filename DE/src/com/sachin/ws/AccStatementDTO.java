/**
 * AccStatementDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sachin.ws;

public class AccStatementDTO  implements java.io.Serializable {
    private double amount;

    private java.lang.String currency;

    private com.sachin.ws.Date date;

    private int id;

    private double international_amount;

    private java.lang.String ref_number;

    private int reward_point;

    private java.lang.String transaction_details;

    public AccStatementDTO() {
    }

    public AccStatementDTO(
           double amount,
           java.lang.String currency,
           com.sachin.ws.Date date,
           int id,
           double international_amount,
           java.lang.String ref_number,
           int reward_point,
           java.lang.String transaction_details) {
           this.amount = amount;
           this.currency = currency;
           this.date = date;
           this.id = id;
           this.international_amount = international_amount;
           this.ref_number = ref_number;
           this.reward_point = reward_point;
           this.transaction_details = transaction_details;
    }


    /**
     * Gets the amount value for this AccStatementDTO.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AccStatementDTO.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this AccStatementDTO.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AccStatementDTO.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the date value for this AccStatementDTO.
     * 
     * @return date
     */
    public com.sachin.ws.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this AccStatementDTO.
     * 
     * @param date
     */
    public void setDate(com.sachin.ws.Date date) {
        this.date = date;
    }


    /**
     * Gets the id value for this AccStatementDTO.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this AccStatementDTO.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the international_amount value for this AccStatementDTO.
     * 
     * @return international_amount
     */
    public double getInternational_amount() {
        return international_amount;
    }


    /**
     * Sets the international_amount value for this AccStatementDTO.
     * 
     * @param international_amount
     */
    public void setInternational_amount(double international_amount) {
        this.international_amount = international_amount;
    }


    /**
     * Gets the ref_number value for this AccStatementDTO.
     * 
     * @return ref_number
     */
    public java.lang.String getRef_number() {
        return ref_number;
    }


    /**
     * Sets the ref_number value for this AccStatementDTO.
     * 
     * @param ref_number
     */
    public void setRef_number(java.lang.String ref_number) {
        this.ref_number = ref_number;
    }


    /**
     * Gets the reward_point value for this AccStatementDTO.
     * 
     * @return reward_point
     */
    public int getReward_point() {
        return reward_point;
    }


    /**
     * Sets the reward_point value for this AccStatementDTO.
     * 
     * @param reward_point
     */
    public void setReward_point(int reward_point) {
        this.reward_point = reward_point;
    }


    /**
     * Gets the transaction_details value for this AccStatementDTO.
     * 
     * @return transaction_details
     */
    public java.lang.String getTransaction_details() {
        return transaction_details;
    }


    /**
     * Sets the transaction_details value for this AccStatementDTO.
     * 
     * @param transaction_details
     */
    public void setTransaction_details(java.lang.String transaction_details) {
        this.transaction_details = transaction_details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccStatementDTO)) return false;
        AccStatementDTO other = (AccStatementDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.id == other.getId() &&
            this.international_amount == other.getInternational_amount() &&
            ((this.ref_number==null && other.getRef_number()==null) || 
             (this.ref_number!=null &&
              this.ref_number.equals(other.getRef_number()))) &&
            this.reward_point == other.getReward_point() &&
            ((this.transaction_details==null && other.getTransaction_details()==null) || 
             (this.transaction_details!=null &&
              this.transaction_details.equals(other.getTransaction_details())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getAmount()).hashCode();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += getId();
        _hashCode += new Double(getInternational_amount()).hashCode();
        if (getRef_number() != null) {
            _hashCode += getRef_number().hashCode();
        }
        _hashCode += getReward_point();
        if (getTransaction_details() != null) {
            _hashCode += getTransaction_details().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccStatementDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.sachin.com/", "accStatementDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.sachin.com/", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("international_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "international_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reward_point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reward_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
