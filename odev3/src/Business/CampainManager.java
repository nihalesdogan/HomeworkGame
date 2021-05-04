package Business;


import Entities.Campains;


public class CampainManager implements CampainService {


	@Override
	public void add(Campains campain) {
		System.out.println(campain.getName()+" ad�nda kampanya eklendi.");
		System.out.println("Kampanyadan sonraki fiyat:"+ campain.getCutprice()+ " tl");		
		
	}

	@Override
	public void update(Campains campain) {
		System.out.println(campain.getName()+" ad�nda kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campains campain) {
		System.out.println(campain.getName()+" ad�nda kampanya silindi.");
	}
}
