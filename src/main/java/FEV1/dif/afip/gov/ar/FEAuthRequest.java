/**
 * FEAuthRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FEV1.dif.afip.gov.ar;

public class FEAuthRequest  implements java.io.Serializable {
    private String token;

    private String sign;

    private long cuit;

    public FEAuthRequest() {
    }

    public FEAuthRequest(
           String token,
           String sign,
           long cuit) {
           this.token = token;
           this.sign = sign;
           this.cuit = cuit;
    }


    /**
     * Gets the token value for this FEAuthRequest.
     *
     * @return token
     */
    public String getToken() {
        return token;
    }


    /**
     * Sets the token value for this FEAuthRequest.
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }


    /**
     * Gets the sign value for this FEAuthRequest.
     *
     * @return sign
     */
    public String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this FEAuthRequest.
     *
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }


    /**
     * Gets the cuit value for this FEAuthRequest.
     *
     * @return cuit
     */
    public long getCuit() {
        return cuit;
    }


    /**
     * Sets the cuit value for this FEAuthRequest.
     *
     * @param cuit
     */
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FEAuthRequest)) return false;
        FEAuthRequest other = (FEAuthRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.token==null && other.getToken()==null) ||
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.sign==null && other.getSign()==null) ||
             (this.sign!=null &&
              this.sign.equals(other.getSign()))) &&
            this.cuit == other.getCuit();
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getSign() != null) {
            _hashCode += getSign().hashCode();
        }
        _hashCode += new Long(getCuit()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FEAuthRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FEAuthRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Cuit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
