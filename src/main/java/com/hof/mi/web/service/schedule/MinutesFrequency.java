/**
 * MinutesFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hof.mi.web.service.schedule;

public class MinutesFrequency  extends com.hof.mi.web.service.schedule.ScheduleFrequency  implements java.io.Serializable {
    private java.lang.Integer minutes;

    public MinutesFrequency() {
    }

    public MinutesFrequency(
           java.lang.String frequencyCode,
           java.lang.String frequencyTypeCode,
           java.lang.Integer frequencyUnit,
           java.lang.Integer localRunTime,
           java.lang.String localTimezoneCode,
           java.lang.Integer minutes) {
        super(
            frequencyCode,
            frequencyTypeCode,
            frequencyUnit,
            localRunTime,
            localTimezoneCode);
        this.minutes = minutes;
    }


    /**
     * Gets the minutes value for this MinutesFrequency.
     * 
     * @return minutes
     */
    public java.lang.Integer getMinutes() {
        return minutes;
    }


    /**
     * Sets the minutes value for this MinutesFrequency.
     * 
     * @param minutes
     */
    public void setMinutes(java.lang.Integer minutes) {
        this.minutes = minutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinutesFrequency)) return false;
        MinutesFrequency other = (MinutesFrequency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.minutes==null && other.getMinutes()==null) || 
             (this.minutes!=null &&
              this.minutes.equals(other.getMinutes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMinutes() != null) {
            _hashCode += getMinutes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MinutesFrequency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schedule.service.web.mi.hof.com", "MinutesFrequency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
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
