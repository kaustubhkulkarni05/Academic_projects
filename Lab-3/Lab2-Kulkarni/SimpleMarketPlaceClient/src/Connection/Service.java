/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public interface Service extends java.rmi.Remote {
    public DAO.CategoryName updateCategory(java.lang.String oldCategoryName, java.lang.String newCategoryName, java.lang.String categoryDescription) throws java.rmi.RemoteException;
    public DAO.CategoryName addCategory(java.lang.String categoryName, java.lang.String categoryDescription) throws java.rmi.RemoteException;
    public DAO.CategoryName deleteCategory(java.lang.String categoryName) throws java.rmi.RemoteException;
    public DAO.CategoryDisplay addComments(java.lang.String reviwer_name, java.lang.String description, java.lang.String rating, java.lang.String review, java.lang.String element) throws java.rmi.RemoteException;
    public java.lang.String signUp(java.lang.String fname, java.lang.String lname, java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException;
    public DAO.CategoryName homePage() throws java.rmi.RemoteException;
    public DAO.CategoryDisplay signIn(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException;
    public DAO.CategoryName displayCategory() throws java.rmi.RemoteException;
    public DAO.CategoryDisplay deleteComments(java.lang.String reviwer_name, java.lang.String element) throws java.rmi.RemoteException;
    public DAO.CategoryDisplay updateComments(java.lang.String reviwer_name, java.lang.String description, java.lang.String rating, java.lang.String review, java.lang.String element) throws java.rmi.RemoteException;
    public DAO.CategoryAll showAllCategory() throws java.rmi.RemoteException;
}
