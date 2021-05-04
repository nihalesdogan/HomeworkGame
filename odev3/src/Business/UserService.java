package Business;

import Entities.User;
public interface UserService {
	
	public void Add(User user) throws Exception;
	public void Update(User user);
	public void Delete(User user);
	

}
