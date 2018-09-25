package com.sachin.ws;

public class CreaditServiceProxy implements com.sachin.ws.CreaditService {
  private String _endpoint = null;
  private com.sachin.ws.CreaditService creaditService = null;
  
  public CreaditServiceProxy() {
    _initCreaditServiceProxy();
  }
  
  public CreaditServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreaditServiceProxy();
  }
  
  private void _initCreaditServiceProxy() {
    try {
      creaditService = (new com.sachin.ws.CreaditServiceImplServiceLocator()).getCreaditServiceImplPort();
      if (creaditService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creaditService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creaditService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creaditService != null)
      ((javax.xml.rpc.Stub)creaditService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sachin.ws.CreaditService getCreaditService() {
    if (creaditService == null)
      _initCreaditServiceProxy();
    return creaditService;
  }
  
  public com.sachin.ws.AccStatementDTO[] getStatement(com.sachin.ws.CustomerDTO arg0) throws java.rmi.RemoteException{
    if (creaditService == null)
      _initCreaditServiceProxy();
    return creaditService.getStatement(arg0);
  }
  
  
}