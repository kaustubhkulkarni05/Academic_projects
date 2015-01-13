/**
 * SignUp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public class SignUp  implements java.io.Serializable {
    private java.lang.String fname;

    private java.lang.String lname;

    private java.lang.String uname;

    private java.lang.String pwd;

    public SignUp() {
    }

    public SignUp(
           java.lang.String fname,
           java.lang.String lname,
           java.lang.String uname,
           java.lang.String pwd) {
           this.fname = fname;
           this.lname = lname;
           this.uname = uname;
           this.pwd = pwd;
    }


    /**
     * Gets the fname value for this SignUp.
     * 
     * @return fname
     */
    public java.lang.String getFname() {
        return fname;
    }


    /**
     * Sets the fname value for this SignUp.
     * 
     * @param fname
     */
    public void setFname(java.lang.String fname) {
        this.fname = fname;
    }


    /**
     * Gets the lname value for this SignUp.
     * 
     * @return lname
     */
    public java.lang.String getLname() {
        return lname;
    }


    /**
     * Sets the lname value for this SignUp.
     * 
     * @param lname
     */
    public void setLname(java.lang.String lname) {
        this.lname = lname;
    }


    /**
     * Gets the uname value for this SignUp.
     * 
     * @return uname
     */
    public java.lang.String getUname() {
        return uname;
    }


    /**
     * Sets the uname value for this SignUp.
     * 
     * @param uname
     */
    public void setUname(java.lang.String uname) {
        this.uname = uname;
    }


    /**
     * Gets the pwd value for this SignUp.
     * 
     * @return pwd
     */
    public java.lang.String getPwd() {
        return pwd;
    }


    /**
     * Sets the pwd value for this SignUp.
     * 
     * @param pwd
     */
    public void setPwd(java.lang.String pwd) {
        this.pwd = pwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignUp)) return false;
        SignUp other = (SignUp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fname==null && other.getFname()==null) || 
             (this.fname!=null &&
              this.fname.equals(other.getFname()))) &&
            ((this.lname==null && other.getLname()==null) || 
             (this.lname!=null &&
              this.lname.equals(other.getLname()))) &&
            ((this.uname==null && other.getUname()==null) || 
             (this.uname!=null &&
              this.uname.equals(other.getUname()))) &&
            ((this.pwd==null && other.getPwd()==null) || 
             (this.pwd!=null &&
              this.pwd.equals(other.getPwd())));
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
        if (getFname() != null) {
            _hashCode += getFname().hashCode();
        }
        if (getLname() != null) {
            _hashCode += getLname().hashCode();
        }
        if (getUname() != null) {
            _hashCode += getUname().hashCode();
        }
        if (getPwd() != null) {
            _hashCode += getPwd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignUp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Connection", ">signUp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connection", "fname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connection", "lname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connection", "uname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Connection", "pwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
