/**
 * EMICalcService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface EMICalcService extends java.rmi.Remote {
    public float emiCalc(int principle, int year, int annualIncome) throws java.rmi.RemoteException;
    public float maxPayableAmountFromIncome(int annualIncome) throws java.rmi.RemoteException;
    public float minPaybleAmountFromPrinciple(int principle, int year) throws java.rmi.RemoteException;
}
