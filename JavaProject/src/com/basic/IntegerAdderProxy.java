package com.basic;

public class IntegerAdderProxy implements com.basic.IntegerAdder {
  private String _endpoint = null;
  private com.basic.IntegerAdder integerAdder = null;
  
  public IntegerAdderProxy() {
    _initIntegerAdderProxy();
  }
  
  public IntegerAdderProxy(String endpoint) {
    _endpoint = endpoint;
    _initIntegerAdderProxy();
  }
  
  private void _initIntegerAdderProxy() {
    try {
      integerAdder = (new com.basic.IntegerAdderServiceLocator()).getIntegerAdder();
      if (integerAdder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)integerAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)integerAdder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (integerAdder != null)
      ((javax.xml.rpc.Stub)integerAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.basic.IntegerAdder getIntegerAdder() {
    if (integerAdder == null)
      _initIntegerAdderProxy();
    return integerAdder;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (integerAdder == null)
      _initIntegerAdderProxy();
    return integerAdder.add(i, j);
  }
  
  
}