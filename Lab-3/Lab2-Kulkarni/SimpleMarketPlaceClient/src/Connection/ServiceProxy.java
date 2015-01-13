package Connection;

public class ServiceProxy implements Connection.Service {
  private String _endpoint = null;
  private Connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new Connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public DAO.CategoryName updateCategory(java.lang.String oldCategoryName, java.lang.String newCategoryName, java.lang.String categoryDescription) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.updateCategory(oldCategoryName, newCategoryName, categoryDescription);
  }
  
  public DAO.CategoryName addCategory(java.lang.String categoryName, java.lang.String categoryDescription) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.addCategory(categoryName, categoryDescription);
  }
  
  public DAO.CategoryName deleteCategory(java.lang.String categoryName) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteCategory(categoryName);
  }
  
  public DAO.CategoryDisplay addComments(java.lang.String reviwer_name, java.lang.String description, java.lang.String rating, java.lang.String review, java.lang.String element) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.addComments(reviwer_name, description, rating, review, element);
  }
  
  public java.lang.String signUp(java.lang.String fname, java.lang.String lname, java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signUp(fname, lname, uname, pwd);
  }
  
  public DAO.CategoryName homePage() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.homePage();
  }
  
  public DAO.CategoryDisplay signIn(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signIn(uname, pwd);
  }
  
  public DAO.CategoryName displayCategory() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.displayCategory();
  }
  
  public DAO.CategoryDisplay deleteComments(java.lang.String reviwer_name, java.lang.String element) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteComments(reviwer_name, element);
  }
  
  public DAO.CategoryDisplay updateComments(java.lang.String reviwer_name, java.lang.String description, java.lang.String rating, java.lang.String review, java.lang.String element) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.updateComments(reviwer_name, description, rating, review, element);
  }
  
  public DAO.CategoryAll showAllCategory() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.showAllCategory();
  }
  
  
}