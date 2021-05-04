package Business;

import Entities.Campains;
import Entities.Game;
import Entities.User;

public class DiscountManager implements DiscountService {

	@Override
	public void sell(User user, Game game, Campains campain) {
		System.out.println(user.getFirstName()+" isimli kullan�c� " +game.getGameName()+" oyunu "+campain.getName()+" ile " +campain.getCutprice() +" fiyat�na sat�n ald�.");
		
	}

}
