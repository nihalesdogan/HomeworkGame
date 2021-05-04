package Core;

import Entities.User;


public class Utils {
	public static void userCheck(Check[] check,User user) {
		for(Check chck:check) {
				chck.check(user);
		}
	}
}
