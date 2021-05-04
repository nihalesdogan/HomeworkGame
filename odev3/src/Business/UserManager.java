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
			throw new Exception("Tc doðrulama yapýlamadý.");
		}
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adlý kullanýcý ekleme iþlemi baþarýlý.");
	}

	@Override
	public void Update(final User user) {
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adlý kullanýcý güncelleme iþlemi baþarýlý.");

		
	}

	@Override
	public void Delete(final User user) {
		System.out.println(user.getFirstName() +" " +user.getLastName() +" adlý kullanýcý silme iþlemi baþarýlý.");
	}

}
