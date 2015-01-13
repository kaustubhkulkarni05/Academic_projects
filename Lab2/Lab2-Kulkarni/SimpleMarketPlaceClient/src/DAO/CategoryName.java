/**
 * CategoryName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class CategoryName  implements java.io.Serializable {
    private java.lang.String[] categoryDescription;

    private java.lang.String[] categoryName;

    private java.lang.String errorMessage;

    public CategoryName() {
    }

    public CategoryName(
           java.lang.String[] categoryDescription,
           java.lang.String[] categoryName,
           java.lang.String errorMessage) {
           this.categoryDescription = categoryDescription;
           this.categoryName = categoryName;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the categoryDescription value for this CategoryName.
     * 
     * @return categoryDescription
     */
    public java.lang.String[] getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this CategoryName.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String[] categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the categoryName value for this CategoryName.
     * 
     * @return categoryName
     */
    public java.lang.String[] getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this CategoryName.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String[] categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the errorMessage value for this CategoryName.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CategoryName.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryName)) return false;
        CategoryName other = (CategoryName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              java.util.Arrays.equals(this.categoryDescription, other.getCategoryDescription()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              java.util.Arrays.equals(this.categoryName, other.getCategoryName()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getCategoryDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoryName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO", "CategoryName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "categoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "categoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
