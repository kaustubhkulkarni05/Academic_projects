/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface Calculator extends java.rmi.Remote {
    public int add(int num1, int num2) throws java.rmi.RemoteException;
    public int sub(int num1, int num2) throws java.rmi.RemoteException;
    public int mul(int num1, int num2) throws java.rmi.RemoteException;
    public java.lang.String checkInput(java.lang.String num1, java.lang.String num2, java.lang.String operation) throws java.rmi.RemoteException;
    public int div(int num1, int num2) throws java.rmi.RemoteException;
}
