package Business;

import Entities.Campains;
import Entities.Game;
import Entities.User;

public interface DiscountService {
	void sell(User user,Game game,Campains campain);

}
