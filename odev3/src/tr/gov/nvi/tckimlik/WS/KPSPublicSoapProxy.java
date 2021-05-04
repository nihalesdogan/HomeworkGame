package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.time.temporal.Temporal;

public class KPSPublicSoapProxy implements tr.gov.nvi.tckimlik.WS.KPSPublicSoap {
  private String _endpoint = null;
  private tr.gov.nvi.tckimlik.WS.KPSPublicSoap kPSPublicSoap = null;
  
  public KPSPublicSoapProxy() {
    _initKPSPublicSoapProxy();
  }
  
  public KPSPublicSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initKPSPublicSoapProxy();
  }
  
  private void _initKPSPublicSoapProxy() {
    try {
      kPSPublicSoap = (new tr.gov.nvi.tckimlik.WS.KPSPublicLocator()).getKPSPublicSoap();
      if (kPSPublicSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)kPSPublicSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)kPSPublicSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (kPSPublicSoap != null)
      ((javax.xml.rpc.Stub)kPSPublicSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() {
    if (kPSPublicSoap == null)
      _initKPSPublicSoapProxy();
    return kPSPublicSoap;
  }
  
  public boolean TCKimlikNoDogrula1(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, int dogumYili) throws java.rmi.RemoteException{
    if (kPSPublicSoap == null)
      _initKPSPublicSoapProxy();
    return kPSPublicSoap.TCKimlikNoDogrula(TCKimlikNo, ad, soyad, dogumYili);
  }

@Override
public boolean TCKimlikNoDogrula1(long TCKimlikNo, String ad, String soyad, String string) throws RemoteException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean TCKimlikNoDogrula(long parseLong, String firstName, String lastName, int dogumYili) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean TCKimlikNoDogrula2(long tCKimlikNo, String firstName, String lastName, String birthYear) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean TCKimlikNoDogrula1(long TCKimlikNo, String ad, String soyad, Temporal temporal) throws RemoteException {
	// TODO Auto-generated method stub
	return false;
}
  
  
}