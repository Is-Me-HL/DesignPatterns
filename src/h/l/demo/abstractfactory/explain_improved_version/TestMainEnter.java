package h.l.demo.abstractfactory.explain_improved_version;

import java.util.UUID;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ2‘¬14»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		try {
			IUser user = DataAccess.createUser();
			user.insertUser("userid", "Are you ok?");
			user.deleteUser("userid");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
