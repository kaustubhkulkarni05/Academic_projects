/**
 * Advertisement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client.jms.entity;

public class Advertisement  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String itemDescription;
    private long itemId;
    private java.lang.String itemName;
    private float price;
    private int quantity;
    private String sellerEmail;
    private java.lang.String sellerInfo;

    /**
     * Gets the itemDescription value for this Advertisement.
     * 
     * @return itemDescription
     */
    public java.lang.String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this Advertisement.
     * 
     * @param itemDescription
     */
    public void setItemDescription(java.lang.String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemId value for this Advertisement.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this Advertisement.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemName value for this Advertisement.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this Advertisement.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the price value for this Advertisement.
     * 
     * @return price
     */
    public float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Advertisement.
     * 
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }


    /**
     * Gets the quantity value for this Advertisement.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Advertisement.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the seller value for this Advertisement.
     * 
     * @return seller
     */
    public String getSellerEmail() {
        return sellerEmail;
    }


    /**
     * Sets the seller value for this Advertisement.
     * 
     * @param seller
     */
    public void setSellerEmail(String seller) {
        this.sellerEmail = seller;
    }


    /**
     * Gets the sellerInfo value for this Advertisement.
     * 
     * @return sellerInfo
     */
    public java.lang.String getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this Advertisement.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(java.lang.String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

  

}
