package DefaultNamespace;

public class IntAdderProxy implements DefaultNamespace.IntAdder {
  private String _endpoint = null;
  private DefaultNamespace.IntAdder intAdder = null;
  
  public IntAdderProxy() {
    _initIntAdderProxy();
  }
  
  public IntAdderProxy(String endpoint) {
    _endpoint = endpoint;
    _initIntAdderProxy();
  }
  
  private void _initIntAdderProxy() {
    try {
      intAdder = (new DefaultNamespace.IntAdderServiceLocator()).getIntAdder();
      if (intAdder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)intAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)intAdder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (intAdder != null)
      ((javax.xml.rpc.Stub)intAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.IntAdder getIntAdder() {
    if (intAdder == null)
      _initIntAdderProxy();
    return intAdder;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (intAdder == null)
      _initIntAdderProxy();
    return intAdder.add(i, j);
  }
  
  
}