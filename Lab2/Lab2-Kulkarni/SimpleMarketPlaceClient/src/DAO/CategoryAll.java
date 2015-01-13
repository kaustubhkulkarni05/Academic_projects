/**
 * CategoryAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class CategoryAll  implements java.io.Serializable {
    private java.lang.String[] allreviwerName;

    private java.lang.String[] description;

    private java.lang.String[] element;

    private java.lang.String errorMessage;

    private java.lang.String loginTime;

    private java.lang.String[] rating;

    private java.lang.String[] review;

    public CategoryAll() {
    }

    public CategoryAll(
           java.lang.String[] allreviwerName,
           java.lang.String[] description,
           java.lang.String[] element,
           java.lang.String errorMessage,
           java.lang.String loginTime,
           java.lang.String[] rating,
           java.lang.String[] review) {
           this.allreviwerName = allreviwerName;
           this.description = description;
           this.element = element;
           this.errorMessage = errorMessage;
           this.loginTime = loginTime;
           this.rating = rating;
           this.review = review;
    }


    /**
     * Gets the allreviwerName value for this CategoryAll.
     * 
     * @return allreviwerName
     */
    public java.lang.String[] getAllreviwerName() {
        return allreviwerName;
    }


    /**
     * Sets the allreviwerName value for this CategoryAll.
     * 
     * @param allreviwerName
     */
    public void setAllreviwerName(java.lang.String[] allreviwerName) {
        this.allreviwerName = allreviwerName;
    }


    /**
     * Gets the description value for this CategoryAll.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CategoryAll.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }


    /**
     * Gets the element value for this CategoryAll.
     * 
     * @return element
     */
    public java.lang.String[] getElement() {
        return element;
    }


    /**
     * Sets the element value for this CategoryAll.
     * 
     * @param element
     */
    public void setElement(java.lang.String[] element) {
        this.element = element;
    }


    /**
     * Gets the errorMessage value for this CategoryAll.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CategoryAll.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the loginTime value for this CategoryAll.
     * 
     * @return loginTime
     */
    public java.lang.String getLoginTime() {
        return loginTime;
    }


    /**
     * Sets the loginTime value for this CategoryAll.
     * 
     * @param loginTime
     */
    public void setLoginTime(java.lang.String loginTime) {
        this.loginTime = loginTime;
    }


    /**
     * Gets the rating value for this CategoryAll.
     * 
     * @return rating
     */
    public java.lang.String[] getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this CategoryAll.
     * 
     * @param rating
     */
    public void setRating(java.lang.String[] rating) {
        this.rating = rating;
    }


    /**
     * Gets the review value for this CategoryAll.
     * 
     * @return review
     */
    public java.lang.String[] getReview() {
        return review;
    }


    /**
     * Sets the review value for this CategoryAll.
     * 
     * @param review
     */
    public void setReview(java.lang.String[] review) {
        this.review = review;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryAll)) return false;
        CategoryAll other = (CategoryAll) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allreviwerName==null && other.getAllreviwerName()==null) || 
             (this.allreviwerName!=null &&
              java.util.Arrays.equals(this.allreviwerName, other.getAllreviwerName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              java.util.Arrays.equals(this.element, other.getElement()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.loginTime==null && other.getLoginTime()==null) || 
             (this.loginTime!=null &&
              this.loginTime.equals(other.getLoginTime()))) &&
            ((this.rating==null && other.getRating()==null) || 
             (this.rating!=null &&
              java.util.Arrays.equals(this.rating, other.getRating()))) &&
            ((this.review==null && other.getReview()==null) || 
             (this.review!=null &&
              java.util.Arrays.equals(this.review, other.getReview())));
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
        if (getAllreviwerName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllreviwerName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllreviwerName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getLoginTime() != null) {
            _hashCode += getLoginTime().hashCode();
        }
        if (getRating() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRating());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRating(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReview() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReview());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReview(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryAll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO", "CategoryAll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allreviwerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "allreviwerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "element"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "loginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("review");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DAO", "review"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Connection", "item"));
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
