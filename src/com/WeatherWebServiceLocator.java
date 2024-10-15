/**
 * WeatherWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class WeatherWebServiceLocator extends org.apache.axis.client.Service implements com.WeatherWebService {

    public WeatherWebServiceLocator() {
    }


    public WeatherWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    private java.lang.String WeatherWebServiceSoap12_address = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";

    public java.lang.String getWeatherWebServiceSoap12Address() {
        return WeatherWebServiceSoap12_address;
    }

    private java.lang.String WeatherWebServiceSoap12WSDDServiceName = "WeatherWebServiceSoap12";

    public java.lang.String getWeatherWebServiceSoap12WSDDServiceName() {
        return WeatherWebServiceSoap12WSDDServiceName;
    }

    public void setWeatherWebServiceSoap12WSDDServiceName(java.lang.String name) {
        WeatherWebServiceSoap12WSDDServiceName = name;
    }

    public com.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherWebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherWebServiceSoap12(endpoint);
    }

    public com.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.WeatherWebServiceSoap12Stub _stub = new com.WeatherWebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getWeatherWebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherWebServiceSoap12EndpointAddress(java.lang.String address) {
        WeatherWebServiceSoap12_address = address;
    }

    private java.lang.String WeatherWebServiceSoap_address = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";

    public java.lang.String getWeatherWebServiceSoapAddress() {
        return WeatherWebServiceSoap_address;
    }

    private java.lang.String WeatherWebServiceSoapWSDDServiceName = "WeatherWebServiceSoap";

    public java.lang.String getWeatherWebServiceSoapWSDDServiceName() {
        return WeatherWebServiceSoapWSDDServiceName;
    }

    public void setWeatherWebServiceSoapWSDDServiceName(java.lang.String name) {
        WeatherWebServiceSoapWSDDServiceName = name;
    }

    public com.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherWebServiceSoap(endpoint);
    }

    public com.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.WeatherWebServiceSoap_BindingStub _stub = new com.WeatherWebServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getWeatherWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherWebServiceSoapEndpointAddress(java.lang.String address) {
        WeatherWebServiceSoap_address = address;
    }

    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.WeatherWebServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.WeatherWebServiceSoap12Stub _stub = new com.WeatherWebServiceSoap12Stub(new java.net.URL(WeatherWebServiceSoap12_address), this);
                _stub.setPortName(getWeatherWebServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (com.WeatherWebServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.WeatherWebServiceSoap_BindingStub _stub = new com.WeatherWebServiceSoap_BindingStub(new java.net.URL(WeatherWebServiceSoap_address), this);
                _stub.setPortName(getWeatherWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherWebServiceSoap12".equals(inputPortName)) {
            return getWeatherWebServiceSoap12();
        }
        else if ("WeatherWebServiceSoap".equals(inputPortName)) {
            return getWeatherWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWebServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWebServiceSoap"));
        }
        return ports.iterator();
    }
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
        if ("WeatherWebServiceSoap12".equals(portName)) {
            setWeatherWebServiceSoap12EndpointAddress(address);
        }
        else if ("WeatherWebServiceSoap".equals(portName)) {
            setWeatherWebServiceSoapEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
