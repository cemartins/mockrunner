/*
 * Generated by XDoclet - Do not edit!
 */
package com.mockrunner.example.ejb.interfaces;

/**
 * Home interface for UserEntity.
 */
public interface UserEntityHome
   extends javax.ejb.EJBHome
{
   String COMP_NAME="java:comp/env/ejb/UserEntity";
   String JNDI_NAME="com/mockrunner/example/UserEntity";

   com.mockrunner.example.ejb.interfaces.UserEntity create(java.lang.String username, java.lang.String password)
      throws javax.ejb.CreateException,java.rmi.RemoteException;

   com.mockrunner.example.ejb.interfaces.UserEntity findByPrimaryKey(java.lang.String username)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   java.util.Collection findAll()
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
