/*
 * Generated by XDoclet - Do not edit!
 */
package com.mockrunner.example.ejb.interfaces;

/**
 * Home interface for DBStateful.
 */
public interface DBStatefulHome
   extends javax.ejb.EJBHome
{
   String COMP_NAME="java:comp/env/ejb/DBStateful";
   String JNDI_NAME="com/mockrunner/example/DBStateful";

   com.mockrunner.example.ejb.interfaces.DBStateful create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
