package Business;

import Entities.User;

public class UserManager implements UserService{
	 UserCheckService userCheckService;
	 public UserManager(final UserCheckService userCheckService ) {
		 this.userCheckService=userCheckService;
	 }
	 

	@Override
	public void Add(final User user) throws Exception {
		if(!userCheckService.CheckIfPerson(user)) {
			throw new Exception("Tc do�rulama yap�lamad�.");
		}
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adl� kullan�c� ekleme i�lemi ba�ar�l�.");
	}

	@Override
	public void Update(final User user) {
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adl� kullan�c� g�ncelleme i�lemi ba�ar�l�.");

		
	}

	@Override
	public void Delete(final User user) {
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adl� kullan�c� silme i�lemi ba�ar�l�.");
	}

}
