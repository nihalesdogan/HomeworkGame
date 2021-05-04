/**
 * KPSPublicSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.time.temporal.Temporal;

public interface KPSPublicSoap extends java.rmi.Remote {
    public boolean TCKimlikNoDogrula1(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, Temporal temporal) throws java.rmi.RemoteException;

	public boolean TCKimlikNoDogrula(long parseLong, String firstName, String lastName, int dogumYili);

	public boolean TCKimlikNoDogrula2(long tCKimlikNo, String firstName, String lastName, String birthYear);

	boolean TCKimlikNoDogrula1(long TCKimlikNo, String ad, String soyad, String string) throws RemoteException;
}
