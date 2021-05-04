package Adapter;

import java.rmi.RemoteException;

import Business.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
	@Override
	public boolean CheckIfPerson(final User user) {
		final KPSPublicSoap client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula1(Long.parseLong(user.getTc()), user.getFirstName(), user.getLastName(), user.getBirthYear());
		} catch(NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
