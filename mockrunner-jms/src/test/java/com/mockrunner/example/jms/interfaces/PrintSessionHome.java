/*
 * Generated by XDoclet - Do not edit!
 */
package com.mockrunner.example.jms.interfaces;

/**
 * Home interface for PrintSession.
 */
public interface PrintSessionHome
   extends javax.ejb.EJBHome
{
   String COMP_NAME="java:comp/env/ejb/PrintSession";
   String JNDI_NAME="com/mockrunner/example/PrintSession";

   com.mockrunner.example.jms.interfaces.PrintSession create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
