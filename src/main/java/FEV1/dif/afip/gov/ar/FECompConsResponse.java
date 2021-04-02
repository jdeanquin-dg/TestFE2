/**
 * FECompConsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FEV1.dif.afip.gov.ar;

public class FECompConsResponse  extends FEV1.dif.afip.gov.ar.FECAEDetRequest  implements java.io.Serializable {
    private String resultado;

    private String codAutorizacion;

    private String emisionTipo;

    private String fchVto;

    private String fchProceso;

    private FEV1.dif.afip.gov.ar.Obs[] observaciones;

    private int ptoVta;

    private int cbteTipo;

    public FECompConsResponse() {
    }

    public FECompConsResponse(
           int concepto,
           int docTipo,
           long docNro,
           long cbteDesde,
           long cbteHasta,
           String cbteFch,
           double impTotal,
           double impTotConc,
           double impNeto,
           double impOpEx,
           double impTrib,
           double impIVA,
           String fchServDesde,
           String fchServHasta,
           String fchVtoPago,
           String monId,
           double monCotiz,
           FEV1.dif.afip.gov.ar.CbteAsoc[] cbtesAsoc,
           FEV1.dif.afip.gov.ar.Tributo[] tributos,
           FEV1.dif.afip.gov.ar.AlicIva[] iva,
           FEV1.dif.afip.gov.ar.Opcional[] opcionales,
           String resultado,
           String codAutorizacion,
           String emisionTipo,
           String fchVto,
           String fchProceso,
           FEV1.dif.afip.gov.ar.Obs[] observaciones,
           int ptoVta,
           int cbteTipo) {
        super(
            concepto,
            docTipo,
            docNro,
            cbteDesde,
            cbteHasta,
            cbteFch,
            impTotal,
            impTotConc,
            impNeto,
            impOpEx,
            impTrib,
            impIVA,
            fchServDesde,
            fchServHasta,
            fchVtoPago,
            monId,
            monCotiz,
            cbtesAsoc,
            tributos,
            iva,
            opcionales);
        this.resultado = resultado;
        this.codAutorizacion = codAutorizacion;
        this.emisionTipo = emisionTipo;
        this.fchVto = fchVto;
        this.fchProceso = fchProceso;
        this.observaciones = observaciones;
        this.ptoVta = ptoVta;
        this.cbteTipo = cbteTipo;
    }


    /**
     * Gets the resultado value for this FECompConsResponse.
     *
     * @return resultado
     */
    public String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this FECompConsResponse.
     *
     * @param resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the codAutorizacion value for this FECompConsResponse.
     *
     * @return codAutorizacion
     */
    public String getCodAutorizacion() {
        return codAutorizacion;
    }


    /**
     * Sets the codAutorizacion value for this FECompConsResponse.
     *
     * @param codAutorizacion
     */
    public void setCodAutorizacion(String codAutorizacion) {
        this.codAutorizacion = codAutorizacion;
    }


    /**
     * Gets the emisionTipo value for this FECompConsResponse.
     *
     * @return emisionTipo
     */
    public String getEmisionTipo() {
        return emisionTipo;
    }


    /**
     * Sets the emisionTipo value for this FECompConsResponse.
     *
     * @param emisionTipo
     */
    public void setEmisionTipo(String emisionTipo) {
        this.emisionTipo = emisionTipo;
    }


    /**
     * Gets the fchVto value for this FECompConsResponse.
     *
     * @return fchVto
     */
    public String getFchVto() {
        return fchVto;
    }


    /**
     * Sets the fchVto value for this FECompConsResponse.
     *
     * @param fchVto
     */
    public void setFchVto(String fchVto) {
        this.fchVto = fchVto;
    }


    /**
     * Gets the fchProceso value for this FECompConsResponse.
     *
     * @return fchProceso
     */
    public String getFchProceso() {
        return fchProceso;
    }


    /**
     * Sets the fchProceso value for this FECompConsResponse.
     *
     * @param fchProceso
     */
    public void setFchProceso(String fchProceso) {
        this.fchProceso = fchProceso;
    }


    /**
     * Gets the observaciones value for this FECompConsResponse.
     *
     * @return observaciones
     */
    public FEV1.dif.afip.gov.ar.Obs[] getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this FECompConsResponse.
     *
     * @param observaciones
     */
    public void setObservaciones(FEV1.dif.afip.gov.ar.Obs[] observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the ptoVta value for this FECompConsResponse.
     *
     * @return ptoVta
     */
    public int getPtoVta() {
        return ptoVta;
    }


    /**
     * Sets the ptoVta value for this FECompConsResponse.
     *
     * @param ptoVta
     */
    public void setPtoVta(int ptoVta) {
        this.ptoVta = ptoVta;
    }


    /**
     * Gets the cbteTipo value for this FECompConsResponse.
     *
     * @return cbteTipo
     */
    public int getCbteTipo() {
        return cbteTipo;
    }


    /**
     * Sets the cbteTipo value for this FECompConsResponse.
     *
     * @param cbteTipo
     */
    public void setCbteTipo(int cbteTipo) {
        this.cbteTipo = cbteTipo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FECompConsResponse)) return false;
        FECompConsResponse other = (FECompConsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.resultado==null && other.getResultado()==null) ||
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.codAutorizacion==null && other.getCodAutorizacion()==null) ||
             (this.codAutorizacion!=null &&
              this.codAutorizacion.equals(other.getCodAutorizacion()))) &&
            ((this.emisionTipo==null && other.getEmisionTipo()==null) ||
             (this.emisionTipo!=null &&
              this.emisionTipo.equals(other.getEmisionTipo()))) &&
            ((this.fchVto==null && other.getFchVto()==null) ||
             (this.fchVto!=null &&
              this.fchVto.equals(other.getFchVto()))) &&
            ((this.fchProceso==null && other.getFchProceso()==null) ||
             (this.fchProceso!=null &&
              this.fchProceso.equals(other.getFchProceso()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) ||
             (this.observaciones!=null &&
              java.util.Arrays.equals(this.observaciones, other.getObservaciones()))) &&
            this.ptoVta == other.getPtoVta() &&
            this.cbteTipo == other.getCbteTipo();
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
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getCodAutorizacion() != null) {
            _hashCode += getCodAutorizacion().hashCode();
        }
        if (getEmisionTipo() != null) {
            _hashCode += getEmisionTipo().hashCode();
        }
        if (getFchVto() != null) {
            _hashCode += getFchVto().hashCode();
        }
        if (getFchProceso() != null) {
            _hashCode += getFchProceso().hashCode();
        }
        if (getObservaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObservaciones());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getObservaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPtoVta();
        _hashCode += getCbteTipo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FECompConsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FECompConsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "CodAutorizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisionTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "EmisionTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fchVto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FchVto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fchProceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "FchProceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Obs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "Obs"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptoVta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "PtoVta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbteTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ar.gov.afip.dif.FEV1/", "CbteTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
