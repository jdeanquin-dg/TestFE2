/**
 * DocTipo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FEV1.dif.afip.gov.ar;

public class DocTipo  implements java.io.Serializable {
    private int id;

    private String desc;

    private String fchDesde;

    private String fchHasta;

    public DocTipo() {
    }

    public DocTipo(
           int id,
           String desc,
           String fchDesde,
           String fchHasta) {
           this.id = id;
           this.desc = desc;
           this.fchDesde = fchDesde;
           this.fchHasta = fchHasta;
    }


    /**
     * Gets the id value for this DocTipo.
     *
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DocTipo.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the desc value for this DocTipo.
     *
     * @return desc
     */
    public String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this DocTipo.
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * Gets the fchDesde value for this DocTipo.
     *
     * @return fchDesde
     */
    public String getFchDesde() {
        return fchDesde;
    }


    /**
     * Sets the fchDesde value for this DocTipo.
     *
     * @param fchDesde
     */
    public void setFchDesde(String fchDesde) {
        this.fchDesde = fchDesde;
    }


    /**
     * Gets the fchHasta value for this DocTipo.
     *
     * @return fchHasta
     */
    public String getFchHasta() {
        return fchHasta;
    }


    /**
     * Sets the fchHasta value for this DocTipo.
     *
     * @param fchHasta
     */
    public void setFchHasta(String fchHasta) {
        this.fchHasta = fchHasta;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DocTipo)) return false;
        DocTipo other = (DocTipo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.id == other.getId() &&
            ((this.desc==null && other.getDesc()==null) ||
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.fchDesde==null && other.getFchDesde()==null) ||
             (this.fchDesde!=null &&
              this.fchDesde.equals(other.getFchDesde()))) &&
            ((this.fchHasta==null && other.getFchHasta()==null) ||
             (this.fchHasta!=null &&
              this.fchHasta.equals(other.getFchHasta())));
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
        _hashCode += getId();
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getFchDesde() != null) {
            _hashCode += getFchDesde().hashCode();
        }
        if (getFchHasta() != null) {
            _hashCode += getFchHasta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocTipo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "DocTipo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fchDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FchDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fchHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FchHasta"));
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
