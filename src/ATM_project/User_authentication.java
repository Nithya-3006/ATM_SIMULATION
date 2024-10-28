package ATM_project;

public class User_authentication {
	int user_pin;
	public int authentication(int user_pin) {
		
		if(user_pin == 1011) {
			return 1;
		}
		return 0;
		
	}
}
