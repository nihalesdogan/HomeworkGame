package Business;

import Entities.Game;


public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" isimli oyun alýmý baþarýlý.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +" isimli oyun düzenlenme iþlemi baþarýlý.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" isimli oyun silindi!");
	}

}
