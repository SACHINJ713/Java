/**
 * CustomerDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sachin.ws;

public class CustomerDTO  implements java.io.Serializable {
    private java.lang.String card_num;

    private java.lang.String cust_name;

    private int cvv;

    private java.lang.String exp_date;

    private java.lang.String statement_tbl;

    public CustomerDTO() {
    }

    public CustomerDTO(
           java.lang.String card_num,
           java.lang.String cust_name,
           int cvv,
           java.lang.String exp_date,
           java.lang.String statement_tbl) {
           this.card_num = card_num;
           this.cust_name = cust_name;
           this.cvv = cvv;
           this.exp_date = exp_date;
           this.statement_tbl = statement_tbl;
    }


    /**
     * Gets the card_num value for this CustomerDTO.
     * 
     * @return card_num
     */
    public java.lang.String getCard_num() {
        return card_num;
    }


    /**
     * Sets the card_num value for this CustomerDTO.
     * 
     * @param card_num
     */
    public void setCard_num(java.lang.String card_num) {
        this.card_num = card_num;
    }


    /**
     * Gets the cust_name value for this CustomerDTO.
     * 
     * @return cust_name
     */
    public java.lang.String getCust_name() {
        return cust_name;
    }


    /**
     * Sets the cust_name value for this CustomerDTO.
     * 
     * @param cust_name
     */
    public void setCust_name(java.lang.String cust_name) {
        this.cust_name = cust_name;
    }


    /**
     * Gets the cvv value for this CustomerDTO.
     * 
     * @return cvv
     */
    public int getCvv() {
        return cvv;
    }


    /**
     * Sets the cvv value for this CustomerDTO.
     * 
     * @param cvv
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    /**
     * Gets the exp_date value for this CustomerDTO.
     * 
     * @return exp_date
     */
    public java.lang.String getExp_date() {
        return exp_date;
    }


    /**
     * Sets the exp_date value for this CustomerDTO.
     * 
     * @param exp_date
     */
    public void setExp_date(java.lang.String exp_date) {
        this.exp_date = exp_date;
    }


    /**
     * Gets the statement_tbl value for this CustomerDTO.
     * 
     * @return statement_tbl
     */
    public java.lang.String getStatement_tbl() {
        return statement_tbl;
    }


    /**
     * Sets the statement_tbl value for this CustomerDTO.
     * 
     * @param statement_tbl
     */
    public void setStatement_tbl(java.lang.String statement_tbl) {
        this.statement_tbl = statement_tbl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDTO)) return false;
        CustomerDTO other = (CustomerDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.card_num==null && other.getCard_num()==null) || 
             (this.card_num!=null &&
              this.card_num.equals(other.getCard_num()))) &&
            ((this.cust_name==null && other.getCust_name()==null) || 
             (this.cust_name!=null &&
              this.cust_name.equals(other.getCust_name()))) &&
            this.cvv == other.getCvv() &&
            ((this.exp_date==null && other.getExp_date()==null) || 
             (this.exp_date!=null &&
              this.exp_date.equals(other.getExp_date()))) &&
            ((this.statement_tbl==null && other.getStatement_tbl()==null) || 
             (this.statement_tbl!=null &&
              this.statement_tbl.equals(other.getStatement_tbl())));
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
        if (getCard_num() != null) {
            _hashCode += getCard_num().hashCode();
        }
        if (getCust_name() != null) {
            _hashCode += getCust_name().hashCode();
        }
        _hashCode += getCvv();
        if (getExp_date() != null) {
            _hashCode += getExp_date().hashCode();
        }
        if (getStatement_tbl() != null) {
            _hashCode += getStatement_tbl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.sachin.com/", "customerDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "card_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cust_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cust_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exp_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exp_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement_tbl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statement_tbl"));
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
