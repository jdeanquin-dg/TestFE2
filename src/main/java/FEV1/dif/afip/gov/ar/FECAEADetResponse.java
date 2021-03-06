/**
 * FECAEADetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FEV1.dif.afip.gov.ar;

public class FECAEADetResponse  extends FEV1.dif.afip.gov.ar.FEDetResponse  implements java.io.Serializable {
    private String CAEA;

    public FECAEADetResponse() {
    }

    public FECAEADetResponse(
           int concepto,
           int docTipo,
           long docNro,
           long cbteDesde,
           long cbteHasta,
           String cbteFch,
           String resultado,
           FEV1.dif.afip.gov.ar.Obs[] observaciones,
           String CAEA) {
        super(
            concepto,
            docTipo,
            docNro,
            cbteDesde,
            cbteHasta,
            cbteFch,
            resultado,
            observaciones);
        this.CAEA = CAEA;
    }


    /**
     * Gets the CAEA value for this FECAEADetResponse.
     *
     * @return CAEA
     */
    public String getCAEA() {
        return CAEA;
    }


    /**
     * Sets the CAEA value for this FECAEADetResponse.
     *
     * @param CAEA
     */
    public void setCAEA(String CAEA) {
        this.CAEA = CAEA;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FECAEADetResponse)) return false;
        FECAEADetResponse other = (FECAEADetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.CAEA==null && other.getCAEA()==null) ||
             (this.CAEA!=null &&
              this.CAEA.equals(other.getCAEA())));
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
        if (getCAEA() != null) {
            _hashCode += getCAEA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FECAEADetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECAEADetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "CAEA"));
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
