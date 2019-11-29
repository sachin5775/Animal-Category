/**
 * EMICalcServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class EMICalcServiceServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.EMICalcServiceService {

    public EMICalcServiceServiceLocator() {
    }


    public EMICalcServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EMICalcServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EMICalcService
    private java.lang.String EMICalcService_address = "http://localhost:7070/EMIService/services/EMICalcService";

    public java.lang.String getEMICalcServiceAddress() {
        return EMICalcService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EMICalcServiceWSDDServiceName = "EMICalcService";

    public java.lang.String getEMICalcServiceWSDDServiceName() {
        return EMICalcServiceWSDDServiceName;
    }

    public void setEMICalcServiceWSDDServiceName(java.lang.String name) {
        EMICalcServiceWSDDServiceName = name;
    }

    public DefaultNamespace.EMICalcService getEMICalcService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EMICalcService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEMICalcService(endpoint);
    }

    public DefaultNamespace.EMICalcService getEMICalcService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.EMICalcServiceSoapBindingStub _stub = new DefaultNamespace.EMICalcServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEMICalcServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEMICalcServiceEndpointAddress(java.lang.String address) {
        EMICalcService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.EMICalcService.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.EMICalcServiceSoapBindingStub _stub = new DefaultNamespace.EMICalcServiceSoapBindingStub(new java.net.URL(EMICalcService_address), this);
                _stub.setPortName(getEMICalcServiceWSDDServiceName());
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
        if ("EMICalcService".equals(inputPortName)) {
            return getEMICalcService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "EMICalcServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "EMICalcService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EMICalcService".equals(portName)) {
            setEMICalcServiceEndpointAddress(address);
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
