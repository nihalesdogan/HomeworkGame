package Core;

import Entities.User;


public class EdevletCheck implements Check {
	
	Check[] check;

	@Override
	public void check(User user) {
			System.out.println("E-devlet kullanýcýsý doðrulandý.");
		}
		
		
	}


