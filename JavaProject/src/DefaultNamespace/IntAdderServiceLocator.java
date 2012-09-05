/**
 * IntAdderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class IntAdderServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.IntAdderService {

    public IntAdderServiceLocator() {
    }


    public IntAdderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntAdderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntAdder
    private java.lang.String IntAdder_address = "http://localhost/DynamicWebProject/services/IntAdder";

    public java.lang.String getIntAdderAddress() {
        return IntAdder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntAdderWSDDServiceName = "IntAdder";

    public java.lang.String getIntAdderWSDDServiceName() {
        return IntAdderWSDDServiceName;
    }

    public void setIntAdderWSDDServiceName(java.lang.String name) {
        IntAdderWSDDServiceName = name;
    }

    public DefaultNamespace.IntAdder getIntAdder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntAdder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntAdder(endpoint);
    }

    public DefaultNamespace.IntAdder getIntAdder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.IntAdderSoapBindingStub _stub = new DefaultNamespace.IntAdderSoapBindingStub(portAddress, this);
            _stub.setPortName(getIntAdderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntAdderEndpointAddress(java.lang.String address) {
        IntAdder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.IntAdder.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.IntAdderSoapBindingStub _stub = new DefaultNamespace.IntAdderSoapBindingStub(new java.net.URL(IntAdder_address), this);
                _stub.setPortName(getIntAdderWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IntAdder".equals(inputPortName)) {
            return getIntAdder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "IntAdderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "IntAdder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntAdder".equals(portName)) {
            setIntAdderEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
