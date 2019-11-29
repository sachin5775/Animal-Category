package DefaultNamespace;

public class EMICalcServiceProxy implements DefaultNamespace.EMICalcService {
  private String _endpoint = null;
  private DefaultNamespace.EMICalcService eMICalcService = null;
  
  public EMICalcServiceProxy() {
    _initEMICalcServiceProxy();
  }
  
  public EMICalcServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEMICalcServiceProxy();
  }
  
  private void _initEMICalcServiceProxy() {
    try {
      eMICalcService = (new DefaultNamespace.EMICalcServiceServiceLocator()).getEMICalcService();
      if (eMICalcService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eMICalcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eMICalcService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eMICalcService != null)
      ((javax.xml.rpc.Stub)eMICalcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.EMICalcService getEMICalcService() {
    if (eMICalcService == null)
      _initEMICalcServiceProxy();
    return eMICalcService;
  }
  
  public float emiCalc(int principle, int year, int annualIncome) throws java.rmi.RemoteException{
    if (eMICalcService == null)
      _initEMICalcServiceProxy();
    return eMICalcService.emiCalc(principle, year, annualIncome);
  }
  
  public float maxPayableAmountFromIncome(int annualIncome) throws java.rmi.RemoteException{
    if (eMICalcService == null)
      _initEMICalcServiceProxy();
    return eMICalcService.maxPayableAmountFromIncome(annualIncome);
  }
  
  public float minPaybleAmountFromPrinciple(int principle, int year) throws java.rmi.RemoteException{
    if (eMICalcService == null)
      _initEMICalcServiceProxy();
    return eMICalcService.minPaybleAmountFromPrinciple(principle, year);
  }
  
  
}