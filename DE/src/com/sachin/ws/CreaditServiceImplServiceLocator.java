/**
 * CreaditServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sachin.ws;

public class CreaditServiceImplServiceLocator extends org.apache.axis.client.Service implements com.sachin.ws.CreaditServiceImplService {

    public CreaditServiceImplServiceLocator() {
    }


    public CreaditServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreaditServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreaditServiceImplPort
    private java.lang.String CreaditServiceImplPort_address = "http://localhost:8080/CreaditCardWSSOAP/ws";

    public java.lang.String getCreaditServiceImplPortAddress() {
        return CreaditServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreaditServiceImplPortWSDDServiceName = "CreaditServiceImplPort";

    public java.lang.String getCreaditServiceImplPortWSDDServiceName() {
        return CreaditServiceImplPortWSDDServiceName;
    }

    public void setCreaditServiceImplPortWSDDServiceName(java.lang.String name) {
        CreaditServiceImplPortWSDDServiceName = name;
    }

    public com.sachin.ws.CreaditService getCreaditServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreaditServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreaditServiceImplPort(endpoint);
    }

    public com.sachin.ws.CreaditService getCreaditServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sachin.ws.CreaditServiceImplPortBindingStub _stub = new com.sachin.ws.CreaditServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCreaditServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreaditServiceImplPortEndpointAddress(java.lang.String address) {
        CreaditServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sachin.ws.CreaditService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sachin.ws.CreaditServiceImplPortBindingStub _stub = new com.sachin.ws.CreaditServiceImplPortBindingStub(new java.net.URL(CreaditServiceImplPort_address), this);
                _stub.setPortName(getCreaditServiceImplPortWSDDServiceName());
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
        if ("CreaditServiceImplPort".equals(inputPortName)) {
            return getCreaditServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.sachin.com/", "CreaditServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.sachin.com/", "CreaditServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreaditServiceImplPort".equals(portName)) {
            setCreaditServiceImplPortEndpointAddress(address);
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
