/*
 * Generated by XDoclet - Do not edit!
 */
package com.mockrunner.example.ejb.interfaces;

/**
 * Remote interface for UserLoginSession.
 */
public interface UserLoginSession
   extends javax.ejb.EJBObject
{

   boolean loginUser(java.lang.String username, java.lang.String password)
      throws java.rmi.RemoteException;

   boolean createUser(java.lang.String username, java.lang.String password)
      throws java.rmi.RemoteException;

}