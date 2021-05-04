package odev3;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Business.DiscountManager;
import Business.GameManager;
import Business.UserManager;
import Core.Check;
import Core.EdevletCheck;
import Entities.Campains;
import Entities.Game;
import Entities.User;

public class Main {


	public static void main(String[] args) throws Exception {
		final UserManager userManager=new UserManager(new MernisServiceAdapter());
		final User user=new User(1,"10901692334","Nihal","Eþdoðan",LocalDate.of(1999, 14, 10));
		userManager.Add(user);
		
		GameManager gameManager=new GameManager();
		Game game=new Game(1,"Varolant",500);
		gameManager.add(game);
		
		Campains campains=new Campains(1,50,"Yýlbaþý indirimi",game.getPrice());
		
		
		DiscountManager ds=new DiscountManager();
		ds.sell(user, game, campains);
		
	}

}
