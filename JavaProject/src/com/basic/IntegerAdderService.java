/**
 * IntegerAdderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.basic;

public interface IntegerAdderService extends javax.xml.rpc.Service {
    public java.lang.String getIntegerAdderAddress();

    public com.basic.IntegerAdder getIntegerAdder() throws javax.xml.rpc.ServiceException;

    public com.basic.IntegerAdder getIntegerAdder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
