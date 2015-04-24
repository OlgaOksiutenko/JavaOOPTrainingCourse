package com.tyshchenko.training.java.oop.lesson11.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Alexander Tyshchenko.
 */
public interface Calculator extends Remote {

    long add(long a, long b) throws RemoteException;

}
