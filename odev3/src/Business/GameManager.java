package Business;

import Entities.Game;


public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" isimli oyun al�m� ba�ar�l�.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +" isimli oyun d�zenlenme i�lemi ba�ar�l�.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" isimli oyun silindi!");
	}

}
